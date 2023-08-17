package Gun08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.amazon.com/");

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        Select ddMenu = new Select(webMenu);//ELEMENTI DAHA RAHAT KULLANILABILIR SELECT NESNESINE CEVIRDI

        //ddMenu.selectByIndex(4); // ISTER BU SEKILDE SECERSIN INDEX ILE
        //ddMenu.selectByValue("search-alias=electronics-intl-ship");//VALUE ILE SECEBILIRSIN
        ddMenu.selectByVisibleText("Electronics");// GORUNEN STRING ILE SECEBILIRSIN

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());
        //SELECTIN KAC TANE OPTION U VAR BU SEKILDE ALABILIRIZ




    }
}
