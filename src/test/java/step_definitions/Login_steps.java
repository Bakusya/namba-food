package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.loginpage.LoginPage;
import pages.mainPage.MainPage;
import pojo.LoginDataContainer;


import java.util.List;

public class Login_steps {


   // WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("^Пользователь должен нажать на кнопку ВОЙТИ$")
    public void пользователь_должен_нажать_на_кнопку_ВОЙТИ()  {
        mainPage.signIn(mainPage.signInToSystem);

    }


    @When("^Пользователь войдет в систему с этими данными$")
    public void пользователь_войдет_в_систему_с_этими_данными(List<LoginDataContainer> loginData) {
        loginPage.login(loginData.get(0).getUsername(),loginData.get(0).getPassword());

    }

    @Then("^Пользователь должен успешно войти в систему$")
    public void пользователь_должен_успешно_войти_в_систему() {
        mainPage.clickProfileMenu(mainPage.profileMenu);
        String expectedResult = "Здравствуйте, Бактыгул ";
        Assert.assertEquals(expectedResult, Helper.getTextValue(mainPage.profileMenu));


    }

    @Then("^Пользователь должен увидеть ошибку \"([^\"]*)\"$")
    public void пользовательДолженУвидетьОшибку(String expectedErrorMessage)  {
        String actualErrorMessage = Helper.getTextValue(loginPage.errorMessage);
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }
}
