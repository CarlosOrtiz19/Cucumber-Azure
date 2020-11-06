package glue;

import com.equipe1.repository.EmployeurRepository;
import com.equipe1.service.EmployeurService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;


public class EmployeursSteps {





    @When("the client calls \\/findAll")
    public void the_client_calls_find_all() {
        //Mockito.when()
        System.out.println("im here");
    }


    @Then("the client receives all employers")
    public void the_client_receives_all_employers() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("im here");
    }

}
