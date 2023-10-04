package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickers {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.id("second_date_picker")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 300)");
        //driver.findElement(By.xpath("//a[text()='28']")).click();

        String month= "May 2024";
        String inputDate= "26";


        while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().equalsIgnoreCase(month))
        {
            driver.findElement(By.xpath("//a[@data-handler='next']")).click();
        }

        List<WebElement> days = driver.findElements(By.xpath("//*[@data-handler='selectDay']"));

        for(int i=0; i<days.size(); i++)
        {
            String date = driver.findElements(By.xpath("//*[@data-handler='selectDay']")).get(i).getText();

            if(date.equalsIgnoreCase(inputDate)){

                By element = By.xpath("//*[@data-handler='selectDay']");

                WebElement selectedEle = driver.findElement(element);
               selectedEle.click();
               System.out.println(selectedEle.getText() + " is  selected ");
               break;


            }
        }








       /* driver.get("https://www.goibibo.com/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only+Goibibo&utm_term=%21SEM%21DF%21G%21Brand%21RSA%21108599293%216504095653%21602838584772%21e%21goibibo%21c%21&gad=1&gclid=Cj0KCQjwpc-oBhCGARIsAH6ote_BA9mrcWV3BKtCd_0J2IFCfNbMc7FpkpX2PJVs4KdvlO-AgUOryV8aAnhKEALw_wcB");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//div[@class='sc-uVWWZ kONpUA']")).click();
        driver.findElement(By.xpath("//*[text()='Departure']")).click();

        //String monthName = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText();

        String monthName = "February";


        while(!driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText().contains(monthName)){
            driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[@aria-label='Next Month']")).click();
        }


        List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[2]/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']"));

        for (int i = 0; i<dates.size(); i++) {

            String text = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[2]/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']")).get(i).getText();

            if (text.equalsIgnoreCase("25")) {
                By ele = By.xpath("(//div[@class='DayPicker-Body'])[2]/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']");

                WebElement element = driver.findElements(ele).get(i);
                element.click();
                System.out.println(element.getText() + " " + monthName + " is Selected ");
                break;

            }

        }
        driver.findElement(By.xpath("//*[@class='fswTrvl__done']")).click();

        driver.findElement(By.xpath("(//div[@class='sc-12foipm-63 bRxdtF']/span[@class='sc-12foipm-64 dGRyPm'])[2]")).click();
        driver.findElement(By.xpath("(//div[@class='sc-12foipm-63 bRxdtF']/span[@class='sc-12foipm-64 dGRyPm'])[4]")).click();
        driver.findElement(By.xpath("(//div[@class='sc-12foipm-63 bRxdtF']/span[@class='sc-12foipm-64 dGRyPm'])[6]")).click();
        driver.findElement(By.xpath("//a[text()='Done']")).click();


        //driver.close();
       // (//div[@class='DayPicker-Body'])[2]/div[@class='DayPicker-Week']/div[@class='DayPicker-Day'] */


    }
}

