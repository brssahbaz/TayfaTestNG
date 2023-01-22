package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandlesTest {

    @Test
    public void windowsHandles() {

        Driver.getDriver().get("https://www.w3schools.com/html/default.asp");
        String str = Driver.getDriver().getWindowHandle();
        System.out.println(str);

        WebElement facebookLink = Driver.getDriver().findElement(By.xpath("//a[@title='Facebook']"));
        facebookLink.click();
        ReusableMethods.sleep(2000);
        String str1 = Driver.getDriver().getWindowHandle();
        Set<String> strList = Driver.getDriver().getWindowHandles();
        System.out.println(str1);
        System.out.println(strList);
        ReusableMethods.sleep(2000);
        Driver.getDriver().switchTo().window(str);


    }


}
