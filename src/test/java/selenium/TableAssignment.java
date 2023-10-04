package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TableAssignment {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        js.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");

        //List<WebElement> tableClass = driver.findElements(By.cssSelector(".left-align fieldset table"));

        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr/td[3]"));

        int sum=0;
        for (WebElement price : prices) {

           sum = sum + (Integer.parseInt(price.getText()));
        }

        System.out.println("Sum of Total Prices is : " + sum);

        // //div[@class='left-align']/fieldset/table/tbody/tr/td[3]





    }
}
