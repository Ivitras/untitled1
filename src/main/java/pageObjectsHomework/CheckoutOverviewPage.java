package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {
    //5
    WebDriver driver;

    private By inventoryItemName = By.className("inventory_item_name");

    private By finishButton = By.id("finish");

    public WebElement getFinishButton(){
        return driver.findElement(finishButton);
    }
    public WebElement getInventoryItemName() {
        return driver.findElement(inventoryItemName);
    }

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }


}
