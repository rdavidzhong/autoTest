/**
 * Created by David Zhong on 2016-01-10.
 */


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstTest {

    @Test
    public void startWebDriver() {
        String baseUrl;
        boolean acceptNextAlert = true;
        StringBuffer verificationErrors = new StringBuffer();

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://news360.com/");
        baseUrl = "https://news360.com/";

        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Sign in with email")).click();
        driver.findElement(By.id("signinemail")).clear();
        driver.findElement(By.id("signinemail")).sendKeys("your@email.com");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("your_pw");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        driver.close();
        driver.quit();

    }
}

