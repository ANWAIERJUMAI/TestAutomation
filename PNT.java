package TestAutomationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PNT {
    public static void main(String[] args) throws InterruptedException {
        //initialize Webdriver browser
        WebDriver driver;
        if (args.length != 0 && args[0].equals("1")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
            driver = new ChromeDriver();

        } else {
            System.setProperty("webdriver.firfox.marionette", "C:\\Webdriver\\geckodriver");
            driver = new FirefoxDriver();
        }
        //maxmize window
        driver.manage().window().maximize();
        // log  in
        driver.navigate().to("https://forum.piit.us/index.php?action=pm");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name='user']")).sendKeys("ajumai91");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("836468074092691");
        //Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        //driver.findElement(By.cssSelector("a[class='clear']")).click();
    }
}