package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrestaShop extends BaseTest {

    @Test
    public void testCreateAccount() throws InterruptedException {
        PageManager page = new PageManager(driver);
        page.getHomePage().switchToShopFrame();
        page.getHomePage().clickSignIn();
        page.getLoginPage().openCreateAccountForm();
        page.getCreateAccountPage().selectSocialTitle("Mrs");
        page.getCreateAccountPage().fillForm("Haidy", "Said", "haidy"+System.currentTimeMillis()+"@mail.com", "Testt@123456");
        page.getCreateAccountPage().setCheckBox();
        page.getCreateAccountPage().submitForm();
        page.getHomePage().searchAndSelectFirst("notebook");
        Assert.assertTrue(
                page.getProductPage().isProductImageDisplayed(),
                "Product image is not displayed"
        );
        Thread.sleep(2000);
        page.getProductPage().clickAddToCart();
        page.getProductPage().closeConfirmationPopup();
        page.getCartPage().clickCartIcon();
        page.getCartPage().getNumberOfProductsInCart();
        int productsCount = page.getCartPage().getNumberOfProductsInCart();
        Assert.assertTrue(productsCount > 0, "No products were added to the cart");
    }
}
