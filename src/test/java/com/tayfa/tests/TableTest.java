package com.tayfa.tests;

import com.tayfa.pages.W3Schools;
import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    W3Schools schools = new W3Schools();

    @Test
    public void tumBasliklar() {
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        //list<WebElement>
        for (WebElement element : schools.basliklar) {
            System.out.println(element.getText());
        }
    }

    @Test
    public void tumHucreler() {
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);

        //list<WebElement>
        for (WebElement element : schools.tumHucreler) {
            System.out.println(element.getText());
        }
    }


    @Test
    public void tumBasliklarReusuableMethods() {
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);
        List<WebElement> liste = ReusableMethods.getBasliklar(1);
        for (WebElement element : liste) {
            System.out.println(element.getText());
        }
    }

    @Test
    public void tabloSatirSutunTesti() {
        String url = "https://www.w3schools.com/html/html_tables.asp";
        Driver.getDriver().get(url);
        WebElement element = ReusableMethods.getTabloSatirSutun(1, 5, 2);

        System.out.println(element.getText());
    }


}
