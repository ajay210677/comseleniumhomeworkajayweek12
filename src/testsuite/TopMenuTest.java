package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    //4.1)
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a")).click();

        //Verify the text ‘Computers’
        String expectedMessage = "Computers";

        //Location what actually message it shows when you enter invalid username and password
        WebElement actualMessagetext = driver.findElement(By.xpath("//h1[text()='Computers']"));
        String actualMessage = actualMessagetext.getText();

        Assert.assertEquals("No such message is displayed", actualMessage, expectedMessage);
    }

    @Test
    //4.2)
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a")).click();

        //Verify the text ‘Computers’
        String expectedMessage = "Electronics";

        //Location what actually message it shows when you enter invalid username and password
        WebElement actualMessagetext = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualMessage = actualMessagetext.getText();

        Assert.assertEquals("No such message is displayed", actualMessage, expectedMessage);

    }

    @Test
    //4.3)
    public void userShouldNavigateToApparelPageSuccessfull() {
        //click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a")).click();

        //Verify the text ‘Apparel’
        String expectedMessage = "Apparel";

        //Location what actually message it shows when you enter invalid username and password
        WebElement actualMessagetext = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualMessage = actualMessagetext.getText();

        Assert.assertEquals("No such message is displayed", actualMessage, expectedMessage);
    }

    @Test
    //4.4)
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a")).click();

        //Verify the text ‘Digital downloads’
        String expectedMessage = "Digital downloads";

        //Location what actually message it shows when you enter invalid username and password
        WebElement actualMessagetext = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualMessage = actualMessagetext.getText();

        Assert.assertEquals("No such message is displayed", actualMessage, expectedMessage);

    }

    @Test
    //4.5)
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on the ‘Books’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a")).click();

        //Verify the text ‘Books’
        String expectedMessage = "Books";

        //Location what actually message it shows when you enter invalid username and password
        WebElement actualMessagetext = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualMessage = actualMessagetext.getText();

        Assert.assertEquals("No such message is displayed", actualMessage, expectedMessage);
    }

    @Test
    //4.6)
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a")).click();

        //Verify the text ‘Jewelry’
        String expectedMessage = "Jewelry";

        //Location what actually message it shows when you enter invalid username and password
        WebElement actualMessagetext = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualMessage = actualMessagetext.getText();

        Assert.assertEquals("No such message is displayed", actualMessage, expectedMessage);

    }

    @Test
    //4.7)
    public void userShouldNavigateToGiftCardsPageSuccessfull() {
        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a")).click();

        //Verify the text ‘Gift Cards’
        String expectedMessage = "Gift Cards";

        //Location what actually message it shows when you enter invalid username and password
        WebElement actualMessagetext = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualMessage = actualMessagetext.getText();

        Assert.assertEquals("No such message is displayed", actualMessage, expectedMessage);

    }
}