package TestAutomationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebdriver  {
    public static void main(String[] args)  throws InterruptedException {
        // initiaze webdriver browser
        WebDriver driver;
        if (args.length != 0 && args[0].equals("1")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
            driver = new ChromeDriver();

        } else {


            System.setProperty("webdriver.firefox.marionette", "C:\\Webdriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        //Maximize window
        driver.manage().window().maximize();
        //Log in
        driver.navigate().to("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys("Mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.cssSelector("select[name='fromPort']")).sendKeys("Paris");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("select[name='fromMonth']")).sendKeys("January");
        driver.findElement(By.cssSelector("select[name='fromDay']")).sendKeys("2");
        driver.findElement(By.cssSelector("select[name='toPort']")).sendKeys("Frankfurt");
        driver.findElement(By.cssSelector("select[name='toMonth']")).sendKeys("January");
        driver.findElement(By.cssSelector("select[name='toDay']")).sendKeys("25");
        driver.findElement(By.cssSelector("input[value='First']"));
        driver.findElement(By.cssSelector("select[name='airline']")).sendKeys("Blue Skies Airlines");
        driver.findElement(By.cssSelector("input[type='image']")).click();
        driver.findElement(By.cssSelector("input[type='image']")).click();
        driver.findElement(By.cssSelector("input[name='passFirst0']")).sendKeys("Enver");
        driver.findElement(By.cssSelector("input[name='passLast0']")).sendKeys("juma");
        driver.findElement(By.cssSelector("input[name='creditnumber']")).sendKeys("234567890");
        driver.findElement(By.cssSelector("input[type='image']")).click();
        driver.findElement(By.cssSelector("img[src='/images/forms/Logout.gif']")).click();
        driver.close();
        //driver.close();



    }

}
