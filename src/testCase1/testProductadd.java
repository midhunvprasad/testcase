package testCase1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testProductadd {

    WebDriver driver;
    JavascriptExecutor jse;

    public void setting() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\seleniumtest\\libs\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.get("https://www.ebay.ca/");
            productAdd();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void productAdd() {
        try {
            driver.get("https://www.ebay.ca/");

            driver.findElement(By.id("gh-ac")).click();
            driver.findElement(By.id("gh-ac")).sendKeys("toys");
            driver.findElement(By.id("gh-btn")).click();
            {
                WebElement element = driver.findElement(By.cssSelector(".s-item:nth-child(2) .s-item__title"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            driver.findElement(By.cssSelector(".s-item:nth-child(2) .s-item__title")).click();
            {
                WebElement element = driver.findElement(By.tagName("body"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element, 0, 0).perform();
            }
            driver.findElement(By.id("isCartBtn_btn")).click();
            Thread.sleep(2000);
            driver.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        testProductadd test = new testProductadd();
        test.setting();

    }
}