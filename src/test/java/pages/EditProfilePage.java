package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EditProfilePage {

    private SelenideElement firstNameField = $(By.xpath("//div[contains(@class, 'bosx')]//label[text()='First name']//parent::div//input"));

    private SelenideElement lastNameInitialField = $(By.xpath("//div[contains(@class, 'bosx')]//label[text()='Last name initial']//parent::div//input"));

    private SelenideElement saveIdentity = $(By.xpath("//div[contains(@class, 'bosx')]//button[text()=' Save identity ']"));

    private SelenideElement updateName = $(By.xpath("//div[contains(@class, 'media-content')]//p[1]"));


    public void updateFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void updateLastInitialName(String lastNameInitial) {
        lastNameInitialField.clear();
        lastNameInitialField.sendKeys(lastNameInitial);
    }

    public String getTextUpdateName() {
        String nameUpdate = updateName.getText();
        return nameUpdate;
    }

}


