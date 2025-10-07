package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartPage extends BasePage {

    private final By cartIcon = By.xpath("//span[text()='Cart']");
    private final By cartItems = By.xpath("//ul[@class='cart-items']/li");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickCartIcon() {
        waitForClickable(cartIcon,10).click();
    }

    public int getNumberOfProductsInCart() {
        waitForVisibility(cartItems,20);
        List<WebElement> products = driver.findElements(cartItems);
        return products.size();
    }
}
