package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class OrangeHrmDemo {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        driver.findElement(By.xpath("//*[text()=' Add ']")).click();
        driver.findElement(By.name("firstName")).sendKeys("Prabhas");
        driver.findElement(By.name("lastName")).sendKeys("Raju");
        // driver.findElement(By.className("oxd-input oxd-input--active"));
        driver.findElement(By.xpath("//button[text()=' Save ']")).click();

        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("DRIVING002");
        //driver.findElement(By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")).click();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //driver.findElement(By.xpath("//li[@class='oxd-calendar-selector-month']")).click();
        //driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).click();

        driver.findElement(By.xpath("//*[text()='Male']")).click();
        driver.findElement(By.xpath("//*[text()='Yes']")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]")).sendKeys("No");
        driver.findElement(By.xpath("(//*[text()=' Save '])[1]")).click();


        // uploadFile AutoIT script
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text']")).click();
        driver.findElement(By.xpath("//*[text()='Browse']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\Vishal\\Documents\\fileUpload002.exe");
        driver.close();

    }
}
