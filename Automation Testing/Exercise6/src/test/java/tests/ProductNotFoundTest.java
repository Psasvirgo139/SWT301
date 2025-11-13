package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("KopiCoffee Product Not Found Test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductNotFoundTest extends BaseTest {

    static WebDriverWait wait;

    @BeforeAll
    static void initWait() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    @Order(1)
    @DisplayName("Should show Not Found and navigate back to products")
    void testProductNotFoundAndBack() {
        // Navigate to a very large product id to trigger NotFound
        driver.get("http://localhost:3000/products/detail/99999999");

        // Wait for the Not Found text
        By notFoundText = By.xpath("//p[normalize-space()='Product Not Found']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(notFoundText));
        assertTrue(driver.findElement(notFoundText).isDisplayed(), "Not Found text not visible");

        // Click the Back to Products button
        By backButton = By.xpath("//button[normalize-space()='Back to Products']");
        wait.until(ExpectedConditions.elementToBeClickable(backButton)).click();

        // Verify we navigated to /products
        wait.until(ExpectedConditions.urlContains("/products"));
        assertTrue(driver.getCurrentUrl().contains("/products"), "Did not navigate back to /products");
    }
}


