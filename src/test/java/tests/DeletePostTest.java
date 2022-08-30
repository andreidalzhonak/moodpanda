package tests;

import Constans.Credentials;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.PostPage;

public class DeletePostTest extends BaseTest {
    @BeforeMethod
    public void createMyPost() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickPostUpdateButton();
        PostPage postPage = new PostPage();
        postPage.createPost();
        postPage.openPage();
        mainPage.elementDropDownIsDisplayed();


    }

    @Test
    public void deleteMyPostTest() {
        MainPage mainPage = new MainPage();
        mainPage.clickDropDownButton();
        mainPage.clickDeleteButton();
        PostPage postPage = new PostPage();
        Assert.assertEquals(postPage.getTextNotification(), "Your post was deleted. It may take a minute or so to update the feeds");
    }

}
