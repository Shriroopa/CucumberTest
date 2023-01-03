package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPage;

public class StepsNew {
    WebDriver driver;
    LoginPage lp;

    @Given("user launch chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
        driver = new ChromeDriver();

        lp=new LoginPage();

    }
    @When("when user opens url {string}")
    public void when_user_opens_url(String url) {
        lp.launchUrl(url);

    }
    @When("when user enters email as {string} and password as {string}")
    public void when_user_enters_email_as_and_password_as(String name, String ps) {
        lp.setUserName(name);
        lp.setPassword(ps);

    }



    @When("user clicks on login button")
    public void user_clicks_on_login_button()  {
        lp.clickLogIn();


    }
   /* @When("click on books link")
    public void click_on_books_link()  {
        lp.clickBookLink();


    }
    @Then("page title should be {string}")
    public void page_title_should_be(String title) {

        Assert.assertEquals(title,driver.getTitle());

    }*/
    @When("user clicks on log out link")
    public void user_clicks_on_log_out_link() {
        lp.clickLogOut();

    }
    @Then("close browser")
    public void close_browser() {
        driver.close();

    }

}


