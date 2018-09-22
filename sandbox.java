package TestAutomationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sandbox {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver;
        if (args.length !=0 && args[0].equals("1")){
            System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else{
            System.setProperty("webdriver.firfox.marionette","C:\\Webdriver\\geckodriver");
            driver =new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.navigate().to("http://sandbox.clinicwise.net/");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("test");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.cssSelector("a[id='nav_clients']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("menu_new_client_link")).click();
        driver.findElement(By.id("client_first_name")).sendKeys("Abdulaah101");
        driver.findElement(By.id("client_last_name")).sendKeys("Dawut");
        driver.findElement(By.id("client_gender_male")).click();
        driver.findElement(By.id("client_birth_date")).sendKeys("21/09/2018");
        //driver.findElement(By.cssSelector("th[class='datepicker-switch']")).sendKeys("2018");
        //driver.findElement(By.cssSelector("span[class='month']")).click();
        //driver.findElement(By.cssSelector("td[class='old day']")).click();
        driver.findElement(By.id("client_medicare_number")).sendKeys("123456789");
        driver.findElement(By.id("client_private_health_fund_id")).click();
        driver.findElement(By.cssSelector("option[value='3']")).click();
        driver.findElement(By.id("client_mobile")).sendKeys("0432121202");
        driver.findElement(By.id("client_mobile_phone_type_ios")).click();
        driver.findElement(By.id("create_client_btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("i[class='fa fa-caret-down']")).click();
        driver.findElement(By.id("sign_out_link")).click();




    }
}
