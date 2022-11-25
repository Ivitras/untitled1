package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSuccessPage {
    //6
    WebDriver driver;

    private By pageTitle = By.cssSelector("span.title");

    private By backHomeButton = By.id("back-to-products");

    public WebElement getBackHomeButton(){
        return driver.findElement(backHomeButton);
    }

    public WebElement getPageTitle() {
        return driver.findElement(pageTitle);
    }

    public CheckoutSuccessPage(WebDriver driver) {
        this.driver = driver;
    }

}
