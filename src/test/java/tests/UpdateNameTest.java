package tests;

import com.codeborne.selenide.WebDriverRunner;
import constants.Credentials;
import constants.NameUpdate;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EditProfilePage;
import pages.LoginPage;
import pages.MainPage;
import pages.YourDashboardPage;

import static com.codeborne.selenide.Selenide.open;

public class UpdateNameTest extends BaseTest {

    @BeforeMethod
    public  void setUp() {
        open();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverRunner.driver().close();
    }

    @Test
    public void updateFirstNameTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickYourDaschboardButton();
        YourDashboardPage yourDashboardPage = new YourDashboardPage();
        yourDashboardPage.clickEditProfileButton();
        EditProfilePage editProfilePage = new EditProfilePage();
        editProfilePage.updateFirstName(NameUpdate.FIRST_NAME);
        Assert.assertEquals(editProfilePage.getTextUpdateName(), "Alexandr D");
    }

    @Test
    public void updateLastInitialNameTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickYourDaschboardButton();
        YourDashboardPage yourDashboardPage = new YourDashboardPage();
        yourDashboardPage.clickEditProfileButton();
        EditProfilePage editProfilePage = new EditProfilePage();
        editProfilePage.updateLastInitialName(NameUpdate.LAST_NAME_INITIAL);
        Assert.assertEquals(editProfilePage.getTextUpdateName(), "Andrei S");

    }




}


