import React, {Component} from 'react';
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";

function NotLoggedInNav(){
    return (
        <Nav className="mr-auto">
            <Nav.Link href="/">Home</Nav.Link>
            <Nav.Link href="/empRegist">Inscrire un employé</Nav.Link>
            <Nav.Link href="/create">Inscrire un étudiant</Nav.Link>
            <Nav.Link href="/Login">Login</Nav.Link>
        </Nav>
    );
}

function GestionnaireNav(){
    return (
        <Nav className="mr-auto">
            <Nav.Link href="/">Home</Nav.Link>


        </Nav>
    );
}

function EmployeurNav(){
    return(
        <Nav className="mr-auto">
            <Nav.Link href="/">Home</Nav.Link>
            <Nav.Link href="/createStage">Créer un stage</Nav.Link>

        </Nav>
    );
}

function EtudiantNav(props){
    return(
        <Nav className="mr-auto">
            <Nav.Link href="/">Home</Nav.Link>


        </Nav>
    );
}

function NavType(props){
    if (props.desc.toUpperCase() == "ETU")
        return <EtudiantNav/>
    else if (props.desc.toUpperCase() == "EMP")
        return <EmployeurNav/>
    else if (props.desc.toUpperCase() == "GEST")
        return <GestionnaireNav/>
    else
        return <NotLoggedInNav/>
}


class HeaderComponent extends Component {
    constructor(props) {
        super(props);

        this.state = {desc : localStorage.getItem("desc") == null ? "" : localStorage.getItem("desc")}
    }






    render() {
        return (
            <Navbar bg="dark" variant="dark" expand="lg">
                <Navbar.Brand href="/">
                    Projet intégré équipe 1
                </Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">

                    <NavType desc={this.state.desc}/>

                </Navbar.Collapse>
            </Navbar>
        );
    }
}

export default HeaderComponent;