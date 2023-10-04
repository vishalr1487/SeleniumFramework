package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class ParallelExecution {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\DRIVERS\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.id("userEmail")).sendKeys("vishalr1487@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Vishal456@");
        driver.findElement(By.id("login")).click();

        List<WebElement> productNames = driver.findElements(By.xpath("//div/div[@class='card-body']/h5"));
        for (WebElement productName : productNames) {
            System.out.println(productName.getText());
        }

        WebElement prod = productNames.stream().filter(product->product.findElement(By.cssSelector("b")).getText()
                        .equals("ZARA COAT 3")).findFirst().orElse(null);// it will find product name

        assert prod != null;
        prod.findElement(By.xpath("//div[@class='card-body']/button[2]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
        driver.findElement(By.xpath("//*[@routerlink='/dashboard/cart']")).click();
        driver.findElement(By.xpath("//button[text()='Checkout']")).click();
        driver.findElement(By.xpath("(//input[@class='input txt'])[1]")).sendKeys("123");
        driver.findElement(By.xpath("(//input[@class='input txt'])[2]")).sendKeys("VISHAL.B");
        driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("India");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
        WebElement countryName = driver.findElement(By.cssSelector("button.ta-item:nth-of-type(2)"));
        System.out.println("Selected Country name is : " + countryName.getText());
        countryName.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//a[text()='Place Order ']")).click();
        String confirmationMessage =  driver.findElement(By.xpath("//h1[text()=' Thankyou for the order. ']")).getText();
        Assert.assertTrue(confirmationMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
        driver.findElement(By.xpath("//button[@routerlink='/dashboard/']")).click();

       // System.out.println("Total Number of Products are : " + productNames.size());
    }

}
