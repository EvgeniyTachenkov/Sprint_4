import Page.NextPages;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestsOrderPage extends Constans{

    WebDriver driver = new FirefoxDriver();

    @Before
    public void goOrder() {
        driver.get(LINK_YANDEX);
        driver.findElement(By.id("rcc-confirm-button")).click();
    }

    @Test
    public void testButtonOrderSmall() {
        OrderPage orderPage = new OrderPage(driver);
        OrderPage.clickFirstButtonOrderSmall();
        OrderPage.login("Вася", "Васильев", "Промышленная 12", "89993451234");
        OrderPage.setMetro();
        OrderPage.clickNext();
        OrderPage.loginRentalInfo();
        String textStatus = OrderPage.getStatusView();
        Assert.assertEquals(BUTTONS_STATUS, textStatus);
    }

    @Test
    public void testButtonOrderMiddle() {
        OrderPage orderPage = new OrderPage(driver);
        OrderPage.clickSecondButtonOrderMiddle();
        OrderPage.login("Илья", "Драгунский", "Фрунзенский бульвар", "89311234567");
        OrderPage.setMetro();
        OrderPage.clickNext();
        OrderPage.loginRentalInfo();
        String textStatus = OrderPage.getStatusView();
        Assert.assertEquals(BUTTONS_STATUS, textStatus);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
