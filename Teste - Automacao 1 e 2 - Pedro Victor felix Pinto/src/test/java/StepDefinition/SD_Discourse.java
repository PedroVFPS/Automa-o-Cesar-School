package StepDefinition;
import Objects.DiscourseObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SD_Discourse extends DiscourseObject {


/*
    @Given("that I access page of {string}")
    public void thatIAccessPageOf(String page) throws InterruptedException {
            //Acessa a página
            accesspage(page);
            Thread.sleep(2000);
    }



    @When("click at {string}")
    public void clickAt(String element) throws InterruptedException {
        //clica no elemento indicado
            clickelement(element);
            Thread.sleep(5000);
    }



    @And("scroll to end of page")
    public void scrollToEndOfPage()  throws InterruptedException {
        //Rola até o fim da página
        DownPage();
        Thread.sleep(2000);
        DownPage();
        Thread.sleep(2000);
    }
*/

    @Then("print all titles of the closed topics")
    public void printAllTitlesOfTheClosedTopics() throws InterruptedException {
        //Printa na tela os títulos bloqueados
        Printclosedtopics();

    }



    @And("print how many itens there in each category")
    public void printHowManyItensThereInEachCategory() throws InterruptedException {
        //Printa quantidade de itens com e sem categorias
        numberOfitens();

    }

    @And("print the title of the highest number of views")
    public void printTheTitleOfTheHighestNumberOfViews() {
        //Printa o titulo da postagem com maior número de views
        highestViews();
    }
}
