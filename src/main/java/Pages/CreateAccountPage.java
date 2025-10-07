package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

    private final By mrTitle = By.id("field-id_gender-1");
    private final By mrsTitle = By.id("field-id_gender-2");
    private final By firstName = By.name("firstname");
    private final By lastName = By.name("lastname");
    private final By email = By.name("email");
    private final By password = By.name("password");
    private final By CheckBox1 = By.name("optin");
    private final By CheckBox2 = By.name("psgdpr");
    private final By CheckBox3 = By.name("newsletter");
    private final By CheckBox4 = By.name("customer_privacy");
    private final By saveBtn = By.xpath("//button[@data-link-action='save-customer']");

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void selectSocialTitle(String title) {
        if (title.equalsIgnoreCase("Mr")) {
            click(mrTitle);
        } else if (title.equalsIgnoreCase("Mrs")) {
            click(mrsTitle);
        }
    }

    public void fillForm(String fName, String lName, String mail, String pass) {
        type(firstName, fName);
        type(lastName, lName);
        type(email, mail);
        type(password, pass);
    }

    public void setCheckBox()
    {
        click(CheckBox1);
        click(CheckBox2);
        click(CheckBox3);
        click(CheckBox4);
    }

    public void submitForm() {
        click(saveBtn);
    }
}
