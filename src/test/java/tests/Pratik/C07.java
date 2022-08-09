package tests.Pratik;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
import utilities.Driver;


public class C07  {

    WebDriver driver;
    @Test
    public void test01() {

        Driver.getDriver().get("https://tradylinn.com");

        driver.findElement(By.xpath("//i[@ class='w-icon-account']")).click();

     //  WebElement email= driver.findElement(By.xpath("//input[@type='text']"));

     //  email.sendKeys("gulsum.e.e.y.58@gmail.com");

      // WebElement password= driver.findElement(By.xpath("//input[@type='password']"));

     //  password.sendKeys("Esin2016+");

     //  driver.findElement(By.xpath("//button[@class='woocommerce-button button woocommerce-form-login__submit']"+Keys.ENTER));






    }

}
