package com.tayfa.tests;

import com.tayfa.pages.AmazonPage;
import com.tayfa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonAramaTest {
    AmazonPage page = new AmazonPage();

    @Test
    public void aramaTesti() {
        String eniyiUrunIsim = "";
        String eniyiUrunPuan = "";
        String eniyiUrunSayi = "";
        String eniyiUrunFiyat = "";
        int hesap = 0;


        Driver.getDriver().get("https://amazon.com");
        Select select = new Select(page.kategoriListe);
        select.selectByVisibleText("Automotive");
        // select.selectByIndex(3);
        // select.selectByValue("search-alias=automotive-intl-ship");
        page.searchbox.sendKeys("car phone holder" + Keys.ENTER);
        // System.out.println("size:"+page.tumFiyatlar.size());


        // for(WebElement e: page.tumFiyatlar) {
        //     System.out.println(e.getText());
        // }
        // System.out.println("size:"+page.tumDegerlendirmeler.size());

        // for(WebElement w: page.tumDegerlendirmeler) {
        //     System.out.println(w.getText());
        // }

        // System.out.println("size:"+page.tumPuanlar.size());

        // for(WebElement v: page.tumPuanlar) {
        //     System.out.println(v.getAttribute("aria-label"));
        // }

        // for(WebElement w: page.tumUrunler) {
        //     System.out.println(w.getText());
        // }

        for (WebElement w : page.tumUrunler) {

            WebElement isim = w.findElement(By.cssSelector(".a-size-medium.a-color-base.a-text-normal"));
            System.out.println("isim: " + isim.getText());

            WebElement fiyat = w.findElement(By.className("a-price-whole"));
            System.out.println("fiyat: " + fiyat.getText());

            WebElement puan = w.findElement(By.cssSelector("[aria-label~='stars']"));
            System.out.println("puan: " + puan.getAttribute("aria-label"));

            WebElement degerlendirmeSayisi = w.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
            System.out.println("değerlendirme: " + degerlendirmeSayisi.getText());
            System.out.println("***");

            String[] puanEldeEt =puan.getAttribute("aria-label").split(" out");

            int puanHesapla = (int)Float.parseFloat(puanEldeEt[0]) * Integer.parseInt(degerlendirmeSayisi.getText().replace(",",""));
            int fiyatHesapla = Integer.parseInt(fiyat.getText());
            int sonuc = puanHesapla - fiyatHesapla;

            if (sonuc > hesap) {
                eniyiUrunIsim = isim.getText();
                eniyiUrunPuan = puan.getAttribute("aria-label");
                eniyiUrunSayi = degerlendirmeSayisi.getText();
                eniyiUrunFiyat = fiyat.getText();

            }
        }
        System.out.println(eniyiUrunIsim);
        System.out.println(eniyiUrunPuan);
        System.out.println(eniyiUrunSayi);
        System.out.println(eniyiUrunFiyat);

    }


}
