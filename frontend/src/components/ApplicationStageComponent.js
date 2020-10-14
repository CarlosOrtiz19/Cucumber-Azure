import React, { Component } from 'react';
import StageService from '../service/StageService';
import EtudiantService from "../service/EtudiantService";
import CandidatureService from "../service/CandidatureService";


export default class ApplicationStageComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            stages: [],
            hasApplied:""
        };
        this.handleSubmit = this.handleSubmit.bind(this)
        //this.onChangeHandler = this.onChangeHandler.bind(this)
        this.addStage = this.addStage.bind(this);

    }
    addStage() {

        this.props.history.push('/createStage')
    }

    async componentDidMount() {

        var id;
        if (localStorage.getItem("desc") == "Etudiant")
            id = localStorage.getItem("id");

        StageService.getStagesEtudiant(id).then((res) => { this.setState({ stages: res.data }) })

    }
    handleSubmit(event) {
        event.preventDefault()
        var idEtudiant;
        if (localStorage.getItem("desc") == "Etudiant")
            idEtudiant = localStorage.getItem("id");
        var idStage = event.target.value
        this.componentDidMount();
        this.setState({hasApplied: true});
        CandidatureService.post(idEtudiant, idStage)
        setTimeout(function() {
            window.location.reload();
        }, 1000);
    }
    render() {
        return (
            <form className="d-flex flex-column">
            <div className="container">
                <div className="col">
                    <div className="pt-3 mt-3">
                        <h5 className="card-title text-center p-3" style={{ background: '#E3F9F0 ' }}>Offres de stage</h5>

                        <div className="row">

                            <table className="table table-striped table-bordered">
                                <thead>
                                <tr >
                                    <th> Titre </th>
                                    <th> Programme </th>
                                    <th> Description </th>
                                    <th> Date de début </th>
                                    <th> Date finale </th>
                                    <th> Ville </th>
                                    <th> Nombre d'heures par semaine </th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                {this.state.stages.map(
                                    stage =>
                                        <tr key={stage.id}>
                                            <td>{stage.titre}</td>
                                            <td>{stage.programme}</td>
                                            <td>{stage.description}</td>
                                            <td>{stage.dateDebut}</td>
                                            <td>{stage.dateFin}</td>
                                            <td>{stage.ville}</td>
                                            <td>{stage.nbHeuresParSemaine}</td>
                                            <td><button type="submit" className="btn btn-primary" value={stage.id} onClick={this.handleSubmit}>Postuler</button></td>

                                        </tr>
                                )}
                                </tbody>
                            </table>
                            {this.state.hasApplied? <label style={{color: "green"}}>Vous venez de téléverser votre CV</label>: null}<br/>

                        </div>
                    </div>
                </div>
            </div>
            </form>
        );
    }
}
