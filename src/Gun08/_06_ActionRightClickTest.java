package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionRightClickTest extends BaseDriver {
    @Test
    public void Test(){

        driver.get("https://demoqa.com/buttons");

        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        MyFunc.Wait(1);

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.contextClick(rightClick).build();
        aksiyon.perform();

        //aksiyonlar.moveToElement(rightClick).contextClick().build();

        BekleVeKapat();

    }
}
