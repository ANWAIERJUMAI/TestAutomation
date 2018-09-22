package TestAutomationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.*;

public class GmailTest {
    public static void main(String[] args) throws InterruptedException {
        //initialize Webdriver browser
        WebDriver driver;
        if (args.length != 0 && args[0].equals("1")) {
            System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
            driver =new ChromeDriver();

        }
          else        {
    System.setProperty("webdriver.firfox.marionette","C:\\Webdriver\\geckodriver");
          driver =new FirefoxDriver();
        }
        //maxmize window
        driver.manage().window().maximize();
          //log in
        driver.navigate().to("https://www.google.com/gmail/about/#");
        driver.findElement(By.cssSelector("a[class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("envernurluk@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("enver926341");
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[class='gb_za gb_5f gb_bg gb_Qe gb_Fb']")).click();
         driver.close();
        //driver.findElement(By.cssSelector("div[class='TN bzz aHS-bnw'][style='margin-left:0px']"));
        //driver.findElement(By.cssSelector("span[name='Oglam Wali']"));
        //Thread.sleep(3000);
        //driver.findElement(By.cssSelector("img[class='aYw aZC']"));
        }


    }

