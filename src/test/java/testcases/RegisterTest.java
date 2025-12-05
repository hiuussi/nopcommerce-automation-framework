package testcases;

import base.BaseTest;
import pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void testUserRegistration() {
        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.register(
                "John",
                "Doe",
                "john" + System.currentTimeMillis() + "@mail.com",
                "Password123"
        );
    }
}
