package StepDefinition;

import Objects.CesarObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SD_Cesar extends CesarObject {



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
    }



    @And("I go to the second page")
    public void iGoToTheSecondPage() throws InterruptedException {
        secondPage();
        Thread.sleep(2000);
    }

    @Then("print date and title of second publication")
    public void printDateAndTitleOfSecondPublication() {
        printTitleSecond();
        printDateSecond();

    }

    @And("acess the third publication")
    public void acessTheThirdPublication() {
        thirdPubli();
    }

    @Then("print title and author")
    public void printTitleAndAuthor() {

        printTitlethird();
        printAutorthird();


    }

    @And("print cesar school address")
    public void printCesarSchoolAdress() {
        printAddress();
    }
}
