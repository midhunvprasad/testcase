package testCase1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSignup {

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
            driver.get("https://www.dominos.ca/en/pages/rewards/#!/create-profile/");
            signupPage();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void signupPage() {
        try {
            driver.get("https://www.dominos.ca/en/pages/rewards/#!/create-profile/");
            driver.findElement(By.id("loyalty-offer__form__first")).click();
            driver.findElement(By.id("loyalty-offer__form__first")).sendKeys("Midhun");
            Thread.sleep(2000);
            driver.findElement(By.id("loyalty-offer__form__last")).click();
            driver.findElement(By.id("loyalty-offer__form__last")).sendKeys("Prasad");
            Thread.sleep(2000);
            driver.findElement(By.id("loyalty-offer__form__email")).click();
            driver.findElement(By.id("loyalty-offer__form__email")).sendKeys("midhun@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.id("loyalty-offer__form__email-confirm")).click();
            driver.findElement(By.id("loyalty-offer__form__email-confirm")).sendKeys("midhun@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.id("loyalty-offer__form__phone")).click();
            driver.findElement(By.id("loyalty-offer__form__phone")).sendKeys("(514) 943-7746");
            Thread.sleep(2000);
            driver.findElement(By.name("phoneExt")).click();
            driver.findElement(By.name("phoneExt")).sendKeys("+1");
            Thread.sleep(2000);
            driver.findElement(By.id("loyalty-offer__form__password")).click();
            driver.findElement(By.id("loyalty-offer__form__password")).sendKeys("password");
            Thread.sleep(2000);
            driver.findElement(By.id("loyalty-offer__form__password-confirm")).click();
            driver.findElement(By.id("loyalty-offer__form__password-confirm")).sendKeys("password");
            Thread.sleep(2000);
            driver.findElement(By.id("loyalty-offer__form__email-list-signup")).click();
            driver.findElement(By.id("loyalty-offer__form__loyalty-signup")).click();
            Thread.sleep(4000);
            driver.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        testSignup test = new testSignup();
        test.setting();

    }
}