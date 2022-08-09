package tests.Pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class C06 {

    @Test
    public void test() {
        Driver.getDriver().get("https://demo.guru99.com/test/web-table-element.php");

        List<WebElement> baslıklar=Driver.getDriver().findElements(By.xpath("//thead"));
        for (WebElement each:baslıklar
             ) {
            System.out.println(each.getText());

        }
        List<WebElement> dorduncusatır=Driver.getDriver().findElements(By.xpath("//tbody//tr[3]//td"));

        for (WebElement w:dorduncusatır
             ) {
            System.out.println(w.getText());
        }
        //thead=basliklari dondurur
        //,tbody tüm tabluyu secer
        //tr=satir verir[1]birinci satırı verir
        //td=satirin hucrelerını verır

    }
}
