package com.eurotech.test.day01_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {

        //we have to enter this  line, if we want to open chrome/firefox/safari...
       WebDriverManager.chromedriver().setup();
        // WebDriver repsent the browser, we are creating driver for chrome browser
        WebDriver driver=new ChromeDriver(); //polymorphism
     //  WebDriverManager.edgedriver().setup();
       // WebDriver driver=new EdgeDriver();
      //  driver.get("https://www.google.com");
        driver.get("https://www.amazon.com.tr/");
//sayfa acildikdan sonra bu sayfanin buyuk ekran acilmasi
        //driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().
       // WebDriverManager.edgedriver().setup();
      //  WebDriver driver1r=new EdgeDriver();
        //  driver.get("https://www.google.com");
          Thread.sleep(5000);// 5 saniye bekletiyor sonra kapatiyor
          driver.quit(); //sayfayi kapama
      //  driver.close();
    }
}
