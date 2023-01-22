package com.tayfa.tests;

import com.tayfa.pages.W3Schools;
import com.tayfa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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


}
