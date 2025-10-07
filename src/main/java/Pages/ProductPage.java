package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    private final By productImage = By.cssSelector(".product-cover img");
    private final By addToCartBtn = By.cssSelector("button.add-to-cart");
    private final By continueShoppingBtn = By.xpath("//button[contains(text(),'Continue shopping')]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductImageDisplayed() {
        try {
            WebElement image = waitForVisibility(productImage,20);
            return image.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickAddToCart() {
        WebElement addBtn = waitForClickable(addToCartBtn,20);
        addBtn.click();
    }


    public void closeConfirmationPopup() {
        WebElement closeBtn = waitForClickable(continueShoppingBtn, 20);
        closeBtn.click();
    }



}
