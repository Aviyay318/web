package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.setProperty("webdriver.openqa.driver","C:\\Users\\byhyh\\Desktop\\מדעי המחשב\\מבוא למדעי המחשב\\WhatsAppARYD\\src\\drivers");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.one.co.il/");
        chromeDriver.manage().window().maximize();
        WebElement searchBar = chromeDriver.findElement(By.id("one-search"));
        if (searchBar!=null){
            searchBar.click();
            searchBar.sendKeys(text);
            searchBar.sendKeys(Keys.ENTER);
            WebElement openTab= chromeDriver.findElement(By.id("_ctl0_ContentHolder_Body_rpResults__ctl0_ucPlainArticle_oneArticleTitle"));
            if (openTab!=null){
                openTab.click();
                WebElement title= chromeDriver.findElement(By.className("article-main-title"));
                WebElement subtitle= chromeDriver.findElement(By.className("article-sub-title"));
                if (subtitle!=null){
                    System.out.println(title.getText());
                    System.out.println(subtitle.getText());
                }
            }
        }
    }
}