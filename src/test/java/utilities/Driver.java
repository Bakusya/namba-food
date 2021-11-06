package utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Driver {

    //Singleton pattern - Одноэлементный шаблон
    private Driver(){}



    private static WebDriver driver;


    public static WebDriver getDriver(){

        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){

                case "firefox":
                    driver = FirefoxWebDriver.loadFirefoxWebDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                    break;
                case "saucelabs":
                    driver = loadSauceLabs();
                    break;
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebDriver loadSauceLabs(){
        String url = "https://oauth-baktygulakimbekova-ee150:ec40f078-a318-4553-bd62-aeb198a6be7f@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.HIGH_SIERRA);
        capabilities.setCapability("browserName", BrowserType.SAFARI);
        capabilities.setCapability("browserVersion","latest");

        WebDriver driver = null;
        try{
            driver = new RemoteWebDriver(new URL(url),capabilities);

        }catch (MalformedURLException e){
            e.printStackTrace();
        }return driver;

    }
}
