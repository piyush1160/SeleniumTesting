package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.*;

public class AddToCart {

    static String[] productList = {"Cucumber","Brocolli","Beetroot"};



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

        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public static void addingToCart() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        driver.manage().window().maximize();
        addToCart(driver);

    }


}

