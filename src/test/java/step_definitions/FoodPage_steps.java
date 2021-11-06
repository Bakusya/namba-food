package step_definitions;

import cucumber.api.java.en.Given;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.foodpage.FoodPage;
import pages.mainPage.MainPage;
import utilities.Driver;

public class FoodPage_steps {

    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();
    FoodPage foodPage = new FoodPage();


    @Given("^Я как пользователь должен зайти на сайт https://nambafood\\.kg/$")
    public void я_как_пользователь_должен_зайти_на_сайт_https_nambafood_kg()  {
        driver.navigate().to("https://nambafood.kg/");


        
    }

    @Given("^Пользователь должен нажать на картинку  еда$")
    public void пользователь_должен_нажать_на_картинку_еда()  {
        Helper.scroollDownThePage();
        Helper.mouseClick(mainPage.food);
    
        
    }

    @Given("^Пользователь должен прокрутить страницу вниз$")
    public void пользователь_должен_прокрутить_страницу_вниз()  {
        Helper.scroollDownThePage();
    
        
    }

    @Given("^Пользователь должен увидеть все кухни$")
    public void пользователь_должен_увидеть_все_кухни()  {
        String cafes = driver.findElement(By.xpath("/html/body/div[2]/main/section[3]/h1")).getText();
        Assert.assertTrue(cafes.contains("250 лучших заведений города "));
    
        
    }



    @Given("^Пользователь должен увидеть такие кухни как национальная кухня, у национальной кухни должен быть \"([^\"]*)\"$")
    public void пользователь_должен_увидеть_такие_кухни_как_национальная_кухня_у_национальной_кухни_должен_быть(String expectedAmountOfCafe) {
        String actualAmountOfCafe = foodPage.nationalCusine84cafe.getText();
        Assert.assertEquals(expectedAmountOfCafe,actualAmountOfCafe);
    }

    @Given("^У европейской кухни должен быть \"([^\"]*)\"$")
    public void у_европейской_кухни_должен_быть(String expectedEuropeanCafe) {
        String actualEuropeanCafe = foodPage.europianCusine147cafe.getText();
        Assert.assertEquals(expectedEuropeanCafe,actualEuropeanCafe);
        
      
    }

    @Given("^У кока кола комбо должен быть \"([^\"]*)\"$")
    public void у_кока_кола_комбо_должен_быть(String expectedAmountOfCocaCola) {
        String actualAmountOfCocaCola = foodPage.cocaColaCombo13cafe.getText();
        Assert.assertEquals(expectedAmountOfCocaCola,actualAmountOfCocaCola);
      
    }

    @Given("^У китайской кухни должен быть \"([^\"]*)\"$")
    public void у_китайской_кухни_должен_быть(String expectedAmountOfChineseCafe) {
        String actualAmountOfChineseCafe = foodPage.chineseCuisine35Cafe.getText();
        Assert.assertEquals(expectedAmountOfChineseCafe,actualAmountOfChineseCafe);
        
      
    }

    @Given("^У суши должен быть \"([^\"]*)\"$")
    public void у_суши_должен_быть(String expectedSushiCafe) {
        String actualSushiCafe = foodPage.sushi42Cafe.getText();
        Assert.assertEquals(expectedSushiCafe,actualSushiCafe);
        
      
    }


}
