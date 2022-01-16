package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DiscoursePage {


    public WebElement getDemo(WebDriver driver) {

        WebElement Demo = driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[4]/a"));
        return Demo;
    }

    public WebElement clickclos(WebDriver driver) {

        WebElement clos = driver.findElement(By.cssSelector("tr[class=\"topic-list-item category-movies closed ember-view\"]"));
        return clos;
    }

    public List<WebElement> getClosed(WebDriver driver) {


        List<WebElement> Close = driver.findElements(By.cssSelector("tr[class*=\"closed\"] a[class*=\"title\"]"));

        return Close;
    }
    public List<WebElement> getWithCategory(WebDriver driver) {


        List<WebElement> WithCat = driver.findElements(By.cssSelector("span[class*=\"category-name\"]"));

        return WithCat;
    }
    public List<WebElement> getNoCategory(WebDriver driver) {


        List<WebElement> NoCat = driver.findElements(By.cssSelector("a[class*=\"title\"]"));

        return NoCat;
    }

    public List<WebElement> getViews(WebDriver driver) {


        List<WebElement> Views = driver.findElements(By.cssSelector("td[class*=\"views\"]"));

        return Views;
    }


}

