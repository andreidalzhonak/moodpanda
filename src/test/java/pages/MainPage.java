package pages;

import Constans.Timeouts;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement postUpdateButton = $(new ByText("Post update"));

    private SelenideElement hugButton = $(By.xpath("//div[contains(., 'Bobbi X') and contains(@class, 'card')]//footer[contains(@class, 'card-footer')]//a[text()='Hug']"));

    private SelenideElement peopleHugClick = $(By.xpath("//div[contains(., 'Bobbi X') and contains(@class, 'card')]//parent::div//section//div[contains(@class, 'tags has-addons')]//a"));

    private SelenideElement yourDaschboardButton = $(By.xpath("//div[contains(@class, 'navbar-start')]//a[text()=' Your dashboard ']"));

    private SelenideElement dropDownButton = $(By.xpath("//div[contains(., 'Andrei D') and contains(@class, 'card')]//div[contains(@class, 'card-footer-item')]"));

    private SelenideElement deleteButton = $(By.xpath("//div[contains(., 'Andrei D') and contains(@class, 'card')]//div[contains(@class, 'card-footer-item')]//parent::div//div[contains(@class, 'dropdown-content')]//a[2]"));

    private SelenideElement homeButton = $(By.xpath("//div[contains(@class, 'navbar-start')]//a[text()=' Home ']"));

    private SelenideElement postAnUpdateButton = $(By.xpath("//div[contains(@class, 'field mt-3')]//a[contains(@class, 'is-hidden-touch')]"));

    public boolean isPostUpdateDisplayed() {
        postUpdateButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return postUpdateButton.isDisplayed();
    }

    public void clickHugButton() {
        hugButton.click();
    }

    public String getTextHugClick() {
        String namePeople = peopleHugClick.getText();
        return namePeople;
    }

    public void clickYourDaschboardButton() {
        yourDaschboardButton.click();
    }

    public void clickPostUpdateButton() {
        postUpdateButton.click();
    }

    public void clickDropDownButton() {
        dropDownButton.click();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }


    public void elementDropDownIsDisplayed() throws InterruptedException {
        int i = 0;
        while (!dropDownButton.isDisplayed()) {
            Selenide.refresh();
            i++;
            Thread.sleep(1000);
            if (i == Timeouts.TEST_TIMEOUTS) {
                throw new TimeoutException(("Timed out after waiting for " + i + " attempt"));
            }
        }
    }
}