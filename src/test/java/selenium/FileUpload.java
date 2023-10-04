package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class FileUpload {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://smallpdf.com/pdf-to-word");
        driver.findElement(By.xpath("//button[@class='l3tlg0-0 ggoliT']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\Vishal\\Documents\\fileUpload.exe");



    }
}
