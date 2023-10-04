package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");

            URL link = new URL(url);
            HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
            httpConn.connect();
            int responseCode = httpConn.getResponseCode();

            if (responseCode >= 400) {
                System.out.println(url + " - " + " this is a BROKEN LINK");

            } else {
                System.out.println(url + " - " + "this is a VALID LINK");
            }
        }


    }


}
