package StepDefinition;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.getProperty;




public class Hooks{

    @Before

    public void InitializeTest() {

        System.out.println("Inicio");

    }

    @After

    public void Endtest() {

        System.out.println("Fim");

    }
}