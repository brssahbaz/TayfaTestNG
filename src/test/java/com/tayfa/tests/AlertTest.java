package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest {
    @Test
    public void alertAccept() {
        Driver.getDriver().get(" https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

        ReusableMethods.sleep(2000);
        Driver.getDriver().switchTo().frame("iframeResult");
        WebElement tryItButton=Driver.getDriver().findElement(By.xpath("//button[@onclick='myFunction()']"));
        tryItButton.click();
        System.out.println(Driver.getDriver().switchTo().alert().getText());

        String actualMesaage=Driver.getDriver().switchTo().alert().getText();
        String expectedMesaage="I am an alert box!";
        Driver.getDriver().switchTo().alert().accept();
        Assert.assertEquals(expectedMesaage,actualMesaage);
    }

    @Test
    public void alertDismiss() {
        Driver.getDriver().get(" https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

        ReusableMethods.sleep(2000);
        Driver.getDriver().switchTo().frame("iframeResult");
        WebElement tryItButton=Driver.getDriver().findElement(By.xpath("//button[@onclick='myFunction()']"));
        tryItButton.click();
        System.out.println(Driver.getDriver().switchTo().alert().getText());

        String actualMesaage=Driver.getDriver().switchTo().alert().getText();
        String expectedMesaage="I am an alert box!";
        Driver.getDriver().switchTo().alert().accept();
        Assert.assertEquals(expectedMesaage,actualMesaage);
    }





}
