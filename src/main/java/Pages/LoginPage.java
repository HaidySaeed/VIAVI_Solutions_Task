package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By createAccountLink = By.xpath("//a[contains(text(),'Create one') or contains(text(),'No account')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openCreateAccountForm() {
        click(createAccountLink);
    }
}
