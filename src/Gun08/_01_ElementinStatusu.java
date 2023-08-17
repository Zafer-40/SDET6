package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElementinStatusu extends BaseDriver {
    @Test
    public void Test(){

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        MyFunc.Wait(2);
        WebElement sali = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-label"));
        System.out.println("sali.isDisplayed() = " + sali.isDisplayed()); //WEBDE GORUNUYORMU
        System.out.println("sali.isEnabled() = " + sali.isEnabled());      //WEBDE ETKINMI
        System.out.println("sali.isSelected() = " + sali.isSelected());    //CEKLI DURUMDAMI

        sali.click();
        MyFunc.Wait(2);
        System.out.println("sali.isSelected() = " + sali.isSelected());

        WebElement cumartesi = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-label"));
        MyFunc.Wait(2);
        System.out.println("cumartesi.isDisplayed() = " + cumartesi.isDisplayed());//WEBDE GORUNUYORMU
        System.out.println("cumartesi.isEnabled() = " + cumartesi.isEnabled());//WEBDE ETKINMI
        System.out.println("cumartesi.isSelected() = " + cumartesi.isSelected());//CEKLI DURUMDAMI

        BekleVeKapat();



    }
}
