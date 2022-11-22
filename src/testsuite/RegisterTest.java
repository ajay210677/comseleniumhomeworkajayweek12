package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Search register tab and click on tab
        driver.findElement(By.xpath("//a[text()='Register']")).click();

        //Search gender radio button and select radio button
        driver.findElement(By.id("gender-male")).click();

        //Search first name and enter in field element
        driver.findElement(By.name("FirstName")).sendKeys("Abc");

        //Search last name and enter in field element
        driver.findElement(By.name("LastName")).sendKeys("Xyz");

        //Search date of birth and enter in field element
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("1");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("January");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1995");

        //Search email and enter in field element
        driver.findElement(By.name("Email")).sendKeys("test123@gmail.com");

        //Find password and confirm password and enter in field element
        driver.findElement(By.name("Password")).sendKeys("test1234");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("test1234");

        //Search register button and click on tab
        driver.findElement(By.id("register-button")).click();

        //Verify text after registration
        String expectedMessage = "Your registration completed";

        //Search text message element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
        String actualMessage = actualTextMessageElement.getText();

        // actual and expected
        Assert.assertEquals("Message not matched", expectedMessage, actualMessage);


    }
}
