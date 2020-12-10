package testCase1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testContactus {

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
            driver.get("https://www.brightlocal.com/about-us/#contact");
            contactusPage();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void contactusPage() {
        try {
            driver.get("https://www.brightlocal.com/about-us/#contact");
            driver.findElement(By.id("input_2_11")).click();
            driver.findElement(By.id("input_2_11")).sendKeys("Midhun Prasad");
            Thread.sleep(2000);
            driver.findElement(By.id("input_2_2")).click();
            driver.findElement(By.id("input_2_2")).sendKeys("midhunA@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.id("input_2_3")).click();
            driver.findElement(By.id("input_2_3")).sendKeys("mvp company");
            Thread.sleep(2000);
            driver.findElement(By.id("label_2_4_1")).click();
            driver.findElement(By.cssSelector("#field_2_5 > .gfield_label")).click();
            driver.findElement(By.id("input_2_5")).click();
            {
                WebElement dropdown = driver.findElement(By.id("input_2_5"));
                dropdown.findElement(By.xpath("//option[. = 'Marketing enquiry']")).click();
            }
            Thread.sleep(2000);
            driver.findElement(By.id("input_2_5")).click();
            driver.findElement(By.cssSelector("#field_2_6 > .gfield_label")).click();
            driver.findElement(By.id("input_2_6")).click();
            driver.findElement(By.id("input_2_6")).sendKeys("testing");
            Thread.sleep(2000);
            driver.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        testContactus test = new testContactus();
        test.setting();

    }
}