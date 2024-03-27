package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class AddToCart {
    static String successfullyApplied = "Code applied ..!";

    static String[] productList = {"Cucumber","Brocolli","Beetroot","Carrot","Tomato"};

    public  static void addToCart(WebDriver driver) throws  Exception{
        List<WebElement> prodlist = driver.findElements(By.cssSelector("h4.product-name"));

        List neededList = Arrays.asList(productList);



        for(int i =0 ;i<prodlist.size();i++){

            // Brocolli -1 Kg
            //Brocolli

            String[] elements = prodlist.get(i).getText().split("-");
            String formattedName =  elements[0].trim();
            //Thread.sleep(1000);
            int j =0 ;
            if(neededList.contains(formattedName)){
             //   Thread.sleep(1000);
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if(j==productList.length){
                    break;
                }

            }
        }
        proceddToCart(driver);
      //  Thread.sleep(2000);
        driver.quit();
    }


    public static void  proceddToCart(WebDriver driver) throws Exception{
        driver.findElement(By.cssSelector(".cart-icon")).click();

        // proceed to checkout ..
      driver.findElement(By.xpath("//*[@id=\'root\']/div/header/div/div[3]/div[2]/div[2]/button")).click();
     // Thread.sleep(1000);
      driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
      driver.findElement(By.cssSelector(".promoBtn")).click();


        System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
        String actual = driver.findElement(By.cssSelector(".promoInfo")).getText();

        Assert.assertEquals(successfullyApplied,actual,"succesfully applied ");
      driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > button:nth-child(14)")).click();
    }

    @Test
    public static void addingToCart() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        addToCart(driver);

    }


}

