package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    //3
    WebDriver driver;
    private By pageTitle = By.className("title");
    private By checkoutButton = By.id("checkout");
    public WebElement getCheckoutButton(){
        return driver.findElement(checkoutButton);
    }
    public CartPage(WebDriver parluks) {
        this.driver = parluks;
    }
    public WebElement getPageTitle() {
        return driver.findElement(pageTitle);
    }

}
