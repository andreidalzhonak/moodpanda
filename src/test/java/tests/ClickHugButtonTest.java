package tests;

import Constans.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class ClickHugButtonTest extends BaseTest {
    @Test
    public void clickHugTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickHugButton();

        Assert.assertEquals(mainPage.getTextHugClick(), "Andrei D");
    }
}
