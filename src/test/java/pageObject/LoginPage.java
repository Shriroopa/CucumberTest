package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
        WebDriver driver = new ChromeDriver();

    public void launchUrl(String url){
        driver.get(url);

            }

    public void setUserName(String uName){
        WebElement email = driver.findElement(By.id("Email"));
        email.clear();
        email.sendKeys(uName);
            }

            public void setPassword(String password){
                WebElement pass = driver.findElement(By.id("Password"));
                pass.clear();
                pass.sendKeys(password);
            }
            public void clickLogIn(){
        //WebElement login = driver.findElement(By.tagName("BUTTON"));
           //     WebElement login = driver.findElement(By.className("button-1 login-button"));
            //    WebElement login = driver.findElement(By.cssSelector(".button-1"));
            WebElement login = driver.findElement((By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")));
                login.click();
            }
          /*  public void clickBookLink(){
        WebElement book = driver.findElement(By.linkText("Books "));
        book.click();

            }*/
    public void clickLogOut() {
        WebElement logout = driver.findElement(By.linkText("Logout"));
        logout.click();
    }
}
