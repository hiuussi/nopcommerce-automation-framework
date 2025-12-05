package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gender-male")
    WebElement genderMale;

    @FindBy(id = "FirstName")
    WebElement firstName;

    @FindBy(id = "LastName")
    WebElement lastName;

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @FindBy(id = "register-button")
    WebElement registerButton;

    public void register(String fn, String ln, String mail, String pw) {
        click(genderMale);
        type(firstName, fn);
        type(lastName, ln);
        type(email, mail);
        type(password, pw);
        type(confirmPassword, pw);
        click(registerButton);
    }
}
