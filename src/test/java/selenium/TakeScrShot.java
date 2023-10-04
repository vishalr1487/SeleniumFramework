package selenium;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakeScrShot {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // First convert webDriver object to screenshot object
        // we are casting driver object to TakesScreenshot method object
        // FileUtils is the method which will copy the screenshot from source to the local machine
        System.out.println(driver.getTitle());

        File scrShot = ((TakesScreenshot) driver).getScreenshotAs((OutputType.FILE));
        FileUtils.copyFile(scrShot, new File("C:\\Users\\Vishal\\Screenshots\\screenshot.png"));







    }
}
