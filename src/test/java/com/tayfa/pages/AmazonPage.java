package com.tayfa.pages;

import com.tayfa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchbox;

    @FindBy(id="searchDropdownBox")
    public WebElement kategoriListe;

    @FindBy(className = "a-price-whole")
    public List<WebElement> tumFiyatlar;

    @FindBy(xpath="//span[@class='a-size-base s-underline-text']")
    public List<WebElement> tumDegerlendirmeler;

    @FindBy(xpath=" //span[@class='a-icon-alt']")
    public List<WebElement> tumPuanlar;

    @FindBy(xpath="//div[@data-component-type='s-search-result']")
    public List<WebElement> tumUrunler;




    // class "."   id "#"  css selector
    // class ="deneme yazi" --> .deneme.yazi  (  class ı hem deneme hem yazi olanlar)
    // <div lass ="deneme>
           //  <div class="yazi">  ---> .deneme .yazi  (parenti deneme child ı yazı olan classlar )






}
