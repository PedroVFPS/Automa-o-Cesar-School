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
import page.CesarPage;

import static java.lang.System.getProperty;
import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.*;

// Pastas do projeto

public class CesarObject extends CesarPage {

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

            case "Blog":
                getBlog(navegator).click();
                break;

            default:

                break;

        }
    }

    public void secondPage(){

        getsecongPage(navegator).click();
    }

    public void printTitleSecond(){
        System.out.print("Título do segundo post: ");
        System.out.println(getTitleSecond(navegator).get(1).getText());
    }

    public void printDateSecond(){
        System.out.print("Data do segundo post: ");
        System.out.println(getDateSecond(navegator).get(1).getText());

    }

    public void thirdPubli(){

        getthirdPubli(navegator).get(2).click();
    }

    public void printTitlethird(){
        System.out.print("Título do terceiro post: ");
        System.out.println(getTitlethird(navegator).getText());

    }
    public void printAutorthird(){
        System.out.print("Autor do terceiro post: ");
        System.out.println(getAutorthird(navegator).getText());
    }

    public void DownPage() {


        JavascriptExecutor jse = (JavascriptExecutor) this.navegator;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
    }

    public void printAddress(){
        System.out.print("Endereço do School: ");
        System.out.println(getAddress(navegator).getText());
    }


}





