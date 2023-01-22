package com.tayfa.tests;

import com.tayfa.utilities.ConfigurationReader;
import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleAramaTest {

    @Test
    public void aramaTesti() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        //WebElement aranaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        //aranaKutusu.sendKeys("telefon"+ Keys.ENTER);
       //WebElement baslik = Driver.getDriver().findElement(By.tagName("h1"));
       //System.out.println(baslik.getText());
       //WebElement cevaplananSorular = Driver.getDriver().findElement(By.partialLinkText("50 answered"));
       //System.out.println(baslik.getText());
     // List<WebElement> linkler = Driver.getDriver().findElements(By.tagName("a"));
     // for (WebElement element : linkler) {
     //     System.out.println(element.getText());
     // }
       // WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));






    }


}
