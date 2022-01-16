package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class CesarPage {


    public WebElement getBlog(WebDriver driver) {

        WebElement Blog = driver.findElement(By.xpath("//*[@id=\"menu-item-8945\"]/a"));
        return Blog;
    }

    public WebElement getsecongPage(WebDriver driver) {

        WebElement Secpage = driver.findElement(By.xpath("//*[@class='page-numbers' and contains(text(),'2')]"));
        return Secpage;
    }

    public List<WebElement> getDateSecond(WebDriver driver) {

        List<WebElement> Datesec = driver.findElements(By.cssSelector("time[class*=\"entry-date published\"]"));

        return Datesec;
    }

    public List<WebElement> getthirdPubli(WebDriver driver) {

        List<WebElement> thirdPubli = driver.findElements(By.cssSelector("div[class*=\"ast-date-meta\"]"));

        return thirdPubli;
    }


    public List<WebElement> getTitleSecond(WebDriver driver) {

        List<WebElement> Titlesec = driver.findElements(By.cssSelector("h2[class=\"entry-title\"]"));

        return Titlesec;
    }

    public WebElement getTitlethird(WebDriver driver) {

        WebElement Titlethird = driver.findElement(By.cssSelector("main[class*=\"site-main\"] h1[class=\"entry-title\"]"));

        return Titlethird;
    }
    public WebElement getAutorthird(WebDriver driver) {

        WebElement Autorthird = driver.findElement(By.cssSelector("main[class*=\"site-main\"] span[class*=\"author-name\"]"));

        return Autorthird;
    }

    public WebElement getAddress(WebDriver driver) {

        WebElement Address = driver.findElement(By.cssSelector("div[class*=\"onde\"] > p"));

        return Address;
    }

}

