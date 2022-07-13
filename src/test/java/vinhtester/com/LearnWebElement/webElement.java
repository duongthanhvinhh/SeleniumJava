package vinhtester.com.LearnWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class webElement {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;//Declare driver
        WebDriverManager.edgedriver().setup();//Set up edge browser
        driver = new EdgeDriver();//Initial edge window
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://hrm.anhtester.com");
        Thread.sleep(3000);
        WebElement inputEmail = driver.findElement(By.id("iusername"));
        WebElement inputPassWord = driver.findElement(By.id("ipassword"));
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        inputEmail.sendKeys("admin01");
        inputPassWord.sendKeys("123456");
        submitButton.click();
        Thread.sleep(5000);
        Cookie newCookie = new Cookie("number","12345");
        driver.manage().addCookie(newCookie);
        System.out.println(newCookie.getValue());
        System.out.println(driver.manage().getCookieNamed("number"));
        System.out.println(driver.manage().getCookieNamed("ci_session"));//get current ci_session
        Thread.sleep(5000);
        driver.quit();
    }
}
