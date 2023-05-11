package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {
    By userBy = By.cssSelector("");
    By pwdBy =By.cssSelector("");
    By loginbtnBy =By.cssSelector("");


    WebDriver driver = DriverManager.getDriver();

    public LoginPage openUrl (String url)
    {
        driver.get(url);
        return this;
    }

    public LoginPage enterUser (String username)
    {
        driver.findElement(userBy);
        return this;
    }

    public LoginPage enterPassword (String username)
    {
        driver.findElement(pwdBy);
        return this;
    }

    public Homepage clickLoginBtn ()
    {
        driver.findElement(loginbtnBy);
        return new Homepage();
    }

}
