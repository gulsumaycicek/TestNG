package tests.day17_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanımı {

    @Test
    public void test01() {

        // facebook anasayfaya gidin
// cikarsa cookies kabul edin
// kullanici mail kutusuna rastgele bir isim yazdirin
// kullanici sifre kutusuna rastgele bir password yazdirin
// login butonuna basin
// giris yapilamadigini test edin

        FacebookPage facebookPage=new FacebookPage();

        Driver.getDriver().get("https://www.facebook.com");

        Faker faker=new Faker();
        facebookPage.mailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.sifreKutusu.sendKeys(faker.internet().password());
        facebookPage.loginTusu.click();
        Assert.assertTrue( facebookPage.girilemediYaziElementi.isDisplayed());
        Driver.closeDriver();

    }
}
