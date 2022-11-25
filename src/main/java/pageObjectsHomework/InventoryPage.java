package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    //2
    WebDriver driver;

    private By pageTitle = By.cssSelector("span.title");

    private By cartButton = By.id("shopping_cart_container");

    private By addToCartBackpackButton = By.id("add-to-cart-sauce-labs-backpack");

    public WebElement getAddToCartBackpackButton() {
        return driver.findElement(addToCartBackpackButton);
    }

    public WebElement getCartButton(){
        return driver.findElement(cartButton);
    }

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPageTitle() {
        return driver.findElement(pageTitle);
    }

}
