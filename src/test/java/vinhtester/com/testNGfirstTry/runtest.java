package vinhtester.com.testNGfirstTry;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import vinhtester.com.BasePM.BaseTest;

public class runtest extends BaseTest {
    @BeforeTest
    public void loginCRM() {
        createDriver("Chrome");
        driver.get("https://hrm.anhtester.com");
        driver.findElement(By.id("iusername")).sendKeys("admin01");
        driver.findElement(By.id("ipassword")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test
    public void openProjectPage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Dự án']")).click();
    }

    @Test
    public void getTitlePage() throws InterruptedException {
        Thread.sleep(1000);
        String title = driver.getTitle();
        System.out.println("Title's Page is:" + title);
    }


    @AfterTest
    public void closePage() {
        closeDriver();
    }
}
