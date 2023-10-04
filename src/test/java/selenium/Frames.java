package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frames {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //js.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");

        driver.findElement(By.xpath("//div[@id='content']/ul/li/a[text()='Frames']")).click();
        driver.findElement(By.xpath("//*[text()='Nested Frames']")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middleFrame = driver.findElement(By.tagName("body"));
        String middle = middleFrame.getText();
        System.out.println(middle);

    }

}
