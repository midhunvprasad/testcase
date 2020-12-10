package testCase1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testRegister {

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
            driver.get(
                    "https://www.epicgames.com/id/register/epic?redirect_uri=https%3A%2F%2Fwww.epicgames.com%2Fstore%2Fen-US%2F&client_id=875a3b57d3a640a6b7f9b4e883463ab4");
            registrationPage();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void registrationPage() {
        try {
            driver.get(
                    "https://www.epicgames.com/id/register/epic?redirect_uri=https%3A%2F%2Fwww.epicgames.com%2Fstore%2Fen-US%2F&client_id=875a3b57d3a640a6b7f9b4e883463ab4");
            driver.findElement(By.id("country")).click();
            driver.findElement(By.id("country-option-42")).click();
            driver.findElement(By.id("name")).click();
            driver.findElement(By.id("name")).sendKeys("test");
            Thread.sleep(1000);
            driver.findElement(By.id("lastName")).sendKeys("automation");
            Thread.sleep(1000);
            driver.findElement(By.id("displayName")).sendKeys("test12334567890");
            Thread.sleep(1000);
            driver.findElement(By.id("email")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("email")).sendKeys("test@gmail.com");
            driver.findElement(By.id("password")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("password")).sendKeys("Testingcanada1");
            driver.findElement(By.id("optIn")).click();
            driver.findElement(By.id("termsOfService")).click();
            Thread.sleep(2000);
            driver.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        testRegister test = new testRegister();
        test.setting();

    }
}
