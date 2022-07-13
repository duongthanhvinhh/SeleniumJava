package vinhtester.com.LearnWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import vinhtester.com.BasePM.BaseTest;

public class robotActions extends BaseTest {

    @Test
    public void basicActions() throws InterruptedException {

        createDriver("Edge");
        driver.navigate().to("https://hrm.anhtester.com");
        Thread.sleep(3000);
        WebElement inputEmail = driver.findElement(By.id("iusername"));
        WebElement inputPassWord = driver.findElement(By.id("ipassword"));
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        inputEmail.sendKeys("admin01");
        inputPassWord.sendKeys("123456");
        submitButton.click();
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(2000);
    }

    @Test
    public void pressKeys(){

    }
}
