package pages.mainPage;

import helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage extends Helper {
    public  MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class='home--cat-item food']")
    public WebElement food;

    @FindBy(xpath = "//a[@href='/pharmacy']//div[@class='home--cat-prev']")
    public WebElement pharmacy;

    @FindBy(id = "login--button")
    public WebElement signInToSystem;

    @FindBy(xpath = "")
    public WebElement userWelcome;

    @FindBy(id = "menu--profile-btn")
    public WebElement profileMenu;

    public void clickProfileMenu(WebElement element){
        waitElementToBeDisplayed(element);
        waitForElementToBeClickable(element);


    }
    public void signIn(WebElement element){
        waitElementToBeDisplayed(element);
        waitForElementToBeClickable(element);
        signInToSystem.click();
    }
}
