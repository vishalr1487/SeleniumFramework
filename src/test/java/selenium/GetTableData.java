package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class GetTableData {

    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node0d4pv45vgi8o41009co22bz9c3492791.node0");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        js.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");
        WebElement baseTable = driver.findElement(By.cssSelector(".tableFixHead"));

        List<WebElement> Values = baseTable.findElements(By.cssSelector(".tableFixHead table thead tr th"));
        System.out.println("Total Headers are  : " + Values.size());

        List<WebElement> rows = baseTable.findElements(By.cssSelector(".tableFixHead tr td"));
        System.out.println("Total number of Rows : " + rows.size());

//        for (WebElement value : Values)
//        {
//            System.out.println(value.getText() + " ");
//        }



//        System.out.println("****************************************************************");
//
//        for (WebElement rowValue : rows)
//        {
//            System.out.print(rowValue.getText() + " ");
//
//        }


        List<WebElement> amount = baseTable.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));

        int sum=0;

        for(int i=0; i<amount.size();i++){
            sum = sum + (Integer.parseInt(amount.get(i).getText()));
        }

        System.out.println(sum);

        String totalAmount = driver.findElement(By.cssSelector(".totalAmount")).getText();

        Assert.assertEquals(totalAmount, "Total Amount Collected: 296");




    }
}
