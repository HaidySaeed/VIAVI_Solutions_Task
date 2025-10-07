package Pages;

import org.openqa.selenium.WebDriver;

public class PageManager {

    private WebDriver driver;

    private HomePage homePage;
    private ProductPage productPage;
    private CartPage cartPage;
    private LoginPage loginPage;
    private CreateAccountPage createAccountPage;


    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public CreateAccountPage getCreateAccountPage() {
        if (createAccountPage == null) {
            createAccountPage = new CreateAccountPage(driver);
        }
        return createAccountPage;
    }

    public ProductPage getProductPage() {
        if (productPage == null) {
            productPage = new ProductPage(driver);
        }
        return productPage;
    }

    public CartPage getCartPage() {
        if (cartPage == null) {
            cartPage = new CartPage(driver);
        }
        return cartPage;
    }
}
