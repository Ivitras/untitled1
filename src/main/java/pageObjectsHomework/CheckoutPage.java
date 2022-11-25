package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    //4
    WebDriver driver;

    private By pageTitle = By.className("title");

    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");

    private By lastNameInputField = By.id("last-name");

    private By postalCodeInputField = By.id("postal-code");


    public void inputPostalCodeField(String c){
        driver.findElement(postalCodeInputField).sendKeys(c);
    }

    public void inputLastNameField(String b){
        driver.findElement(lastNameInputField).sendKeys(b);
    }

    public void inputFirstName(String a){
        driver.findElement(firstNameInputField).sendKeys(a);
    }

    public String getErrorText(){
        return driver.findElement(errorText).getText();
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public WebElement getPageTitle() {
        return driver.findElement(pageTitle);
    }

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

}
