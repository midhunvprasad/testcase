package testCase1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLogin {

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
            driver.get("https://www.facebook.com/");
            loginPage();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void loginPage() {
        try {
            driver.get("https://www.facebook.com/");

            driver.findElement(By.cssSelector(".\\_8esk")).click();
            driver.findElement(By.id("email")).sendKeys("check@gmail.com");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(".\\_8esk")).click();
            driver.findElement(By.id("pass")).sendKeys("password");
            Thread.sleep(2000);
            driver.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        testLogin test = new testLogin();
        test.setting();

    }
}