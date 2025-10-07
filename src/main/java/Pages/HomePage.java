package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private final By signInBtn = By.xpath("//a[contains(@href,'my-account')]");
    private final By searchInput = By.name("s");
    private final By frameLive = By.id("framelive");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void switchToShopFrame() {
        waitForFrameAndSwitch(frameLive);
    }

    public void clickSignIn() {
        //WebElement signIn = waitForClickable(signInBtn, 10);
        click(signInBtn);
    }

    public void searchAndSelectFirst(String text) {
        type(searchInput, text);
        WebElement firstSuggestion = waitForVisibility(
                By.cssSelector("ul.ui-autocomplete li.ui-menu-item a span.product"),20);
        firstSuggestion.click();
    }

}
