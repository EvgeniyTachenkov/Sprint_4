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
    public void testButtonOneOrder() {
        NextPages nextPages = new NextPages(driver);
        NextPages.clickFirstButtonOneOrder();
        NextPages.login("Вася", "Васильев", "Промышленная 12", "89993451234");
        NextPages.setMetro();
        NextPages.clickNext();
        NextPages.loginRentalInfo();
        String textStatus = NextPages.getStatusView();
        Assert.assertEquals(BUTTONS_STATUS, textStatus);
    }

    @Test
    public void testSecondButtonOrder() {
        NextPages NextPages = new NextPages(driver);
        NextPages.clickSecondButtonOrder();
        NextPages.login("Илья", "Драгунский", "Фрунзенский бульвар", "89311234567");
        NextPages.setMetro();
        NextPages.clickNext();
        NextPages.loginRentalInfo();
        String textStatus = NextPages.getStatusView();
        Assert.assertEquals(BUTTONS_STATUS, textStatus);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
