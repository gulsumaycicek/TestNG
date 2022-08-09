package tests.day22_crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class C05_Emoji extends TestBase {

    //go to web site : https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
//maximize the web site
//click on second emoji
//click all second emoji's element
//go back parent iframe
//fill out the form,(Fill the form with the texts you want)
//click on apply button
// web sitesini büyüt
// tüm ikinci emoji öğelerini tıklayın
// ana iframe'e geri dön
//formu doldurun,(Formu istediğiniz metinlerle doldurun)
// uygula butonuna tıklayın


    @Test
    public void test01() {
        //go to web site : https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        //maximize the web site
        driver.manage().window().maximize();

      WebElement iframe=  driver.findElement(By.xpath("//iframe[@id='emooji'"));
      driver.switchTo().frame(iframe);

        //click on second emoji
   WebElement secondEmoji  = driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]"));
   secondEmoji.click();

        //click all second emoji's element
    List<WebElement> emoji = driver.findElements(By.xpath("//div[@id='nature']/div/img"));


    }
}
