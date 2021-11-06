import helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsDemo {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        String USERNAME = "oauth-baktygulakimbekova-ee150";
        String ACCESSKEY = "ec40f078-a318-4553-bd62-aeb198a6be7f";
        String url = "https://oauth-baktygulakimbekova-ee150:ec40f078-a318-4553-bd62-aeb198a6be7f@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.WIN10);
        capabilities.setCapability("browserName", BrowserType.CHROME);
        capabilities.setCapability("browserVersion","latest");

        WebDriver driver = new RemoteWebDriver(new URL(url),capabilities);
        driver.get("https://nambafood.kg/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(3000);
        String element = driver.findElement(By.xpath("//h3[contains(text(),'Всё лучшее для наших клиентов')]")).getText();
        System.out.println(element);

    }
}
