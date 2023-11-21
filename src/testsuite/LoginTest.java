package testsuite;

import browserfactory.BestTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/** Create the package ‘testsuite’ and create the
 following class inside the ‘testsuite’ package.
 1. LoginTest
 3. Write down the following test into ‘LoginTest’ class
 1. userSholdLoginSuccessfullyWithValid Credentials
 * Enter “standard_user” username
 * Enter “secret_sauce” password
 * Click on ‘LOGIN’ button
 * Verify the text “PRODUCTS”
 2. verifyThatSixProductsAreDisplayedOnPage
 * Enter “standard_user” username
 * Enter “secret_sauce” password
 * Click on ‘LOGIN’ button
 * Verify that six products are displayed on page
 */
public class LoginTest extends BestTest {

    // Declare baseUrl
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // Enter “standard_user” username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Enter “secret_sauce” password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        // Click on ‘LOGIN’ button
        driver.findElement(By.id("login-button")).click();
        // Verify the text “PRODUCTS”
        String expectedText ="Products";
        WebElement actualTextElement = driver.findElement(By.xpath("//span[text()='Products']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        // Enter “standard_user” username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Enter “secret_sauce” password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        // Click on ‘LOGIN’ button
        driver.findElement(By.id("login-button")).click();
        // Verify that six products are displayed on page
       // List<WebElement> productsDisplayed = (List<WebElement>) driver.findElement(By.className("inventory_item"));
      //  int number = productsDisplayed.size();
       // System.out.println("Number of products displayed in this page " + number);

        String expectedText = "Sauce Labs Backpack";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
        String expectedText1 = "Sauce Labs Bike Light";
        WebElement actualTextElement1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
        String actualText1 = actualTextElement1.getText();
        Assert.assertEquals(expectedText1, actualText1);
        String expectedText2 = "Sauce Labs Bolt T-Shirt";
        WebElement actualTextElement2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        String actualText2 = actualTextElement2.getText();
        Assert.assertEquals(expectedText2, actualText2);
        String expectedText3 = "Sauce Labs Fleece Jacket";
        WebElement actualTextElement3 = driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
        String actualText3 = actualTextElement3.getText();
        Assert.assertEquals(expectedText3, actualText3);
        String expectedText4 = "Sauce Labs Onesie";
        WebElement actualTextElement4 = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
        String actualText4 = actualTextElement4.getText();
        Assert.assertEquals(expectedText4, actualText4);
        String expectedText5 = "Test.allTheThings() T-Shirt (Red)";
        WebElement actualTextElement5 = driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']"));
        String actualText5 = actualTextElement5.getText();
        Assert.assertEquals(expectedText5, actualText5);
    }

    @After
    public void closingBrowser(){
        closeBrowser();
    }
}
