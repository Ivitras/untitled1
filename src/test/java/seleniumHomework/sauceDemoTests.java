package seleniumHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import pageObjectsHomework.*;
import java.time.Duration;


public class sauceDemoTests {
    public WebDriver driver;
    WebDriverWait wait;

    //I scenārijs
    //1.navigēt uz saiti
    @BeforeMethod
    public void setupBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDownBrowser() {
        driver.quit();
    }

    //2.ielogoties, 3.pārbaudīt vai ielogojies, 4.ievietot preci grozā
    @Test
    public void testOfBuyingProcess() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
//        Thread.sleep(3000);

        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertEquals(inventoryPage.getPageTitle().getText(), "PRODUCTS");
        inventoryPage.getAddToCartBackpackButton().click();
        Assert.assertEquals(inventoryPage.getCartButton().getText(), "1");
//        Thread.sleep(3000);
        inventoryPage.getCartButton().click();

        //5.grozs, 6.pārbaudīt preci grozā
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
//        Thread.sleep(3000);
        cartPage.getCheckoutButton().click();

        //7.Doties uz checkout, 8.ievadīt v.,u.un LV
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.inputFirstName("Ivita");
        checkoutPage.inputLastNameField("Vasiļevska");
        checkoutPage.inputPostalCodeField("LV-1014");
//        Thread.sleep(3000);
        checkoutPage.clickContinueButton();

        //9.checkout overview lapa, 10.finish lapa, 11.Back Home poga
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        Assert.assertEquals(checkoutOverviewPage.getInventoryItemName().getText(), "Sauce Labs Backpack");
//        Thread.sleep(3000);
        checkoutOverviewPage.getFinishButton().click();

        CheckoutSuccessPage checkoutSuccessPage = new CheckoutSuccessPage(driver);
        Assert.assertEquals(checkoutSuccessPage.getPageTitle().getText(), "CHECKOUT: COMPLETE!");
//        Thread.sleep(3000);
        checkoutSuccessPage.getBackHomeButton().click();
    }



    //II scenārijs
    @Test
    public void testCheckoutPageMandatoryFields() throws InterruptedException {
        //1.navigēt uz saiti un 2.ielogoties
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
//        Thread.sleep(1000);

        //3.doties uz grozu
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.getCartButton().click();
//        Thread.sleep(1000);

        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
//        Thread.sleep(1000);
        cartPage.getCheckoutButton().click();

        //4.doties uz checkout
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
//        Thread.sleep(1000);

        //5.pārbaudīt, ka lauki ir obligāti un 6.vai pareizs kļūdas paziņojums
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(),"Error: First Name is required");
//        Thread.sleep(1000);

        checkoutPage.inputFirstName("Ivita");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(), "Error: Last Name is required");
//        Thread.sleep(1000);

        checkoutPage.inputLastNameField("Vasiļevska");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(), "Error: Postal Code is required");
//        Thread.sleep(1000);

        checkoutPage.inputPostalCodeField("LV-1014");
        checkoutPage.clickContinueButton();

    }





}
