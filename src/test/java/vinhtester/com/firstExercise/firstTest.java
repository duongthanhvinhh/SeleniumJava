package vinhtester.com.firstExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstTest {

    static WebDriver driver;
    @Test
    public void regressionTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hrm.anhtester.com");

        //Login steps:
        driver.findElement(By.id("iusername")).sendKeys("admin01");
        driver.findElement(By.id("ipassword")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);


        //Get title's page:
//        Thread.sleep(3000);
//        String a = driver.getTitle();
//        System.out.println("Title of the Page is: "+ a );
//        Thread.sleep(8000);
//        driver.findElement(By.xpath("//body/header[@class='pc-header bg-dark']/div[@class='header-wrapper']/div[@class='ml-auto']/ul[@class='list-unstyled']/li[1]/a[1]/img[1]")).click();
//        driver.findElement(By.xpath("//span[normalize-space()='English']"));
//        WebElement x = driver.findElement(By.xpath("//span[contains(text(),'Dự án')]"));
//        x.click();
//        driver.findElement(By.xpath("//div[@class='card-header-right']//a[contains(.,'Thêm mới')]")).click();
//        driver.findElement(By.xpath("//div[@class='form-group']/descendant::input[@placeholder='Tiêu đề']")).sendKeys("Duong Thanh Vinh");
//        driver.findElement(By.xpath("//span[@id='select2-client_id-container']")).click();
//        driver.findElement(By.xpath("//li[contains(text(),'Huong Nguyen')]")).click();

        //Close browser:
        driver.quit();
    }
}
