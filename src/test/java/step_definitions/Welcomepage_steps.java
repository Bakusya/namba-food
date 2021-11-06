package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.mainPage.MainPage;
import utilities.Driver;

public class Welcomepage_steps {

    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();

    
    @Given("^Я как пользователь должен зайти на сайт nambafood$")
    public void я_как_пользователь_должен_зайти_на_сайт_nambafood() {
        driver.navigate().to("https://nambafood.kg/");
      
        
    }
    @Given("^Заголовок сайта должен быть \"([^\"]*)\"$")
    public void заголовок_сайта_должен_быть(String expectedPageTitle)  {
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);

    }


    @When("^Пользователь нажмет на картинку Еда$")
    public void пользователь_нажмет_на_картинку_Еда() {
       Helper.mouseClick(mainPage.food);

      
        
    }

    @Then("^Пользователь должен успешно зайти в раздел Еда$")
    public void пользователь_должен_успешно_зайти_в_раздел_Еда() {
       String cafes = driver.findElement(By.xpath("/html/body/div[2]/main/section[3]/h1")).getText();
       Assert.assertTrue(cafes.contains("250 лучших заведений города"));
      
        
    }


}
