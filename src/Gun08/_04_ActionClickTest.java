package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click()

        Actions aksiyonlar = new Actions(driver);// web sayfası aksiyonlara açıldı.

        Action aksiyon = aksiyonlar.moveToElement(element).click().build();
        // elementin üzerin click için git orda bekle.aksiyonu hazırla.
        System.out.println("Aksiyon hazırlandı");

        MyFunc.Wait(3);
        aksiyon.perform(); // aksiyon gerçekleşiyor. işleme al, uygula.
        System.out.println("aksiyon gerçekleşti");

        // kısa hali.
        //new Actions(driver).moveToElement(element).click().build().perform();

        BekleVeKapat();

    }
}
