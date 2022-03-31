import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class Selenium {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.safaridriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://oskar-frontend.herokuapp.com");

                driver.getTitle();
                driver.getCurrentUrl();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        //Thread.sleep(5 * 1000);


        WebElement password = driver.findElement(By.id("password"));
        WebElement name = driver.findElement(By.id("userName"));
        WebElement loginButton = driver.findElement(By.id("login"));
        name.sendKeys("Anna");
        password.sendKeys("hejaheja");
        loginButton.click();



    }
}