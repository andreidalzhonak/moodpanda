package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class YourDashboardPage {
    private SelenideElement editButton = $(By.xpath("//div//section[contains(@class, 'column')]//ul[3]//li[1]"));


    public void clickEditProfileButton() {
        editButton.click();
    }
}