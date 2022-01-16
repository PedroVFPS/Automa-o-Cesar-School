package Objects;
import java.lang.System;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import page.DiscoursePage;

import static java.lang.System.getProperty;
import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.*;

// Pastas do projeto

public class DiscourseObject extends DiscoursePage {

    //pastas do projeto
    String dirResourcesNAME = "/resources";
    String dirExecutaveisNAME = "/Executaveis";
    String chromeDriverNAME = "/chromedriver.exe";
    // Caminho de drivers do projeto
    String chromeDriverLocal = getProperty("user.dir") + dirResourcesNAME + dirExecutaveisNAME
            + chromeDriverNAME;
    WebDriver navegator;

    public void accesspage(String page) {

        System.setProperty("webdriver.chrome.driver", chromeDriverLocal);
        this.navegator = new ChromeDriver();

        if (page.contains("https://")) page = page.replace("https://", "");
        navegator.get("https://" + page);
        navegator.manage().window().maximize();

    }

    public void clickelement(String element) {

        switch (element) {

            case "Demo":
                getDemo(navegator).click();
                break;

            default:

                break;

        }

        ArrayList<String> tabs = new ArrayList<String>(navegator.getWindowHandles());
        navegator.switchTo().window(tabs.get(1));
    }

    public void DownPage() {


        JavascriptExecutor jse = (JavascriptExecutor) this.navegator;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
    }

    public void Printclosedtopics() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<String>(navegator.getWindowHandles());
        navegator.switchTo().window(tabs.get(1));

        JavascriptExecutor jse = (JavascriptExecutor) this.navegator;
        jse.executeScript("window.scrollBy(0, -250)", "");
        sleep(1000);

        System.out.println("Closed:");
        for (WebElement webElement : getClosed(navegator)) {
            String name = webElement.getText();
            System.out.println(name);
        }

    }

    public void numberOfitens() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<String>(navegator.getWindowHandles());
        navegator.switchTo().window(tabs.get(1));
        System.out.println("With Category:");
        System.out.println(getWithCategory(navegator).size());
        System.out.println("No category:");
        System.out.println(getNoCategory(navegator).size()-getWithCategory(navegator).size());


    }

    public void highestViews(){
        ArrayList<String> tabs = new ArrayList<String>(navegator.getWindowHandles());
        navegator.switchTo().window(tabs.get(1));
        int highest=0;
        int i=0, max = 0;
        System.out.println("Highest Views:");

        for (WebElement webElement : getViews(navegator)) {
            String sview;
            if (webElement.getText().contains("k")){
                sview = webElement.getText().replace("k","").replace("M","").replace(".","");
                sview = sview+"00";
            } else {
                sview = webElement.getText();
            }

            int iview = Integer.parseInt(sview);
            if (iview > highest){
                highest = iview;
                max = i;
            }
            i=i+1;
        }
        
        System.out.println(getNoCategory(navegator).get(max).getText());

    }

}





