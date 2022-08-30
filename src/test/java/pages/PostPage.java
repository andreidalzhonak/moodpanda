package pages;

import Constans.Urls;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;


public class PostPage {

    private SelenideElement inputField = $(By.xpath("//div[contains(@class, 'control')]//textarea[contains(@class, 'textarea is-smdall')]"));

    private SelenideElement updateButton = $(By.xpath("//div[contains(@class, 'container')]//a[contains(@class, 'is-warning')]"));


    private SelenideElement notificationMessage = $(By.xpath("//html/body/div[2]"));


    public void createPost() {
        inputField.sendKeys("#workPage");
        updateButton.click();
    }


    public String getTextNotification() {
        String notification = notificationMessage.getText();
        return notification;
    }

    public void openPage() {
        open(Urls.PAGE_URL);
    }

}

