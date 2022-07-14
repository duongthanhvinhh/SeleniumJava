package vinhtester.com.LearnWebElement;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import vinhtester.com.BasePM.BaseTest;

public class checkBox extends BaseTest {

    @Test
    public void singleCheckbox() {
        createDriver("Chrome");
        driver.get("https://demo.anhtester.com/basic-checkbox-demo.html");
        boolean isAgeSelected = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
        if (!isAgeSelected) {
            driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
        }
        isAgeSelected = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
        if(isAgeSelected){
            System.out.println("Check single box: PASSED");
        }else{
            System.out.println("Check single box: FAILED");
        }
        closeDriver();
    }
    @Test
    public void multipleCheckbox() {
        createDriver("Chrome");
        driver.get("https://demo.anhtester.com/basic-checkbox-demo.html");
        //boolean isAgeSelected = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected();
        boolean isAgeSelected = driver.findElement(By.xpath("//label[normalize-space()='Option 1']/child::input")).isSelected();
        if (!isAgeSelected) {
            //driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
            driver.findElement(By.xpath("//label[normalize-space()='Option 1']/child::input")).click();
        }
        //isAgeSelected = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected();
        isAgeSelected = driver.findElement(By.xpath("//label[normalize-space()='Option 1']/child::input")).isSelected();
        if(isAgeSelected){
            System.out.println("Check multiple box: PASSED");
        }else{
            System.out.println("Check multiple box: FAILED");
        }
        closeDriver();
    }
}
