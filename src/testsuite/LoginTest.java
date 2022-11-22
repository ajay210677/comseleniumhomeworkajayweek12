package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //1)
    @Test


    public void userShouldNavigateToLoginPageSuccessfully() {

        //Locate Login button and click on it

        driver.findElement(By.linkText("Log in")).click();

        //Verify the text ‘Welcome, Please Sign In!’
        String expectedMessage = "Welcome, Please Sign In!";

        //found using xpath and stored it into actualTextMessage
        WebElement actualTextMessage = driver.findElement(By.xpath("//button[text()='Log in']"));
        //
        String actualMessage = actualTextMessage.getText();
        //Validate actual and expected
        Assert.assertEquals("Not Navigated to Login Page", expectedMessage, actualMessage);

    }

    //2)
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //qwert@gmail.com//qwerty1234


        driver.findElement(By.linkText("Log in")).click();
        //Located Email field and entered valid email
        driver.findElement(By.id("Email")).sendKeys("123456@gmail.com");
        //Located Password field and enter valid credentials
        driver.findElement(By.name("Password")).sendKeys("123456");

        //After entering valid credentials click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //verifying LogOut text is displayed or no
        String expectedMessage1 = "Log out";
        WebElement actualMessagetext = driver.findElement(By.xpath("//a[text()='Log out']"));
        String actualMessage1 = actualMessagetext.getText();

        Assert.assertEquals("No log out text is available", actualMessage1, expectedMessage1);

    }

    //3
    @Test
    public void verifyTheErrorMessage() {

        driver.findElement(By.linkText("Log in")).click();
        //Located Email field and entered invalid email
        driver.findElement(By.id("Email")).sendKeys("12345@gmail.com");
        //Located Password field and enter invalid credentials
        driver.findElement(By.name("Password")).sendKeys("12345");
        //After entering invalid credentials click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //Verify login unsuccessful message
        String expectedMessage2 = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";

        //Location what actually message it shows when you enter invalid username and password
        WebElement actualMessagetext = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage2 = actualMessagetext.getText();

        Assert.assertEquals("No such message is displayed", actualMessage2, expectedMessage2);

    }

    @After
    public void teardown() {
        closeBrowser();
    }

}
