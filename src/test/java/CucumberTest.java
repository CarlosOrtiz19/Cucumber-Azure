import com.equipe1.Application;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;


@CucumberContextConfiguration
@SpringBootTest(classes = {Application.class})
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},features = "src/test/resources")
public class CucumberTest {

}
