import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Page.HomePage;

public class HomePageTest extends Constans {

        WebDriver driver = new ChromeDriver();

        @Before
        public void goOrder(){
            driver.get(LINK_YANDEX);
            driver.findElement(By.id("rcc-confirm-button")).click();
        }

        @Test
        public void testFaqQuestionPrice(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextFaqQuestionPrice();
            Assert.assertEquals(FAQ_ANSWER_PRICE, text);
        }

        @Test
        public void testFaqQuestionMoreScooter(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextFaqQuestionMoreScooter();
            Assert.assertEquals(FAQ_ANSWER_MORE_SCOOTER, text);
        }

        @Test
        public void testFaqQuestionRentTime(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextFaqQuestionRentTime();
            Assert.assertEquals(FAQ_ANSWER_RENT_TIME, text);
        }

        @Test
        public void testFaqQuestionScooterToday(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextFaqQuestionScooterToday();
            Assert.assertEquals(FAQ_ANSWER_SCOOTER_TODAY, text);
        }

        @Test
        public void testFaqQuestionExtendOrder(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextFaqQuestionExtendOrder();
            Assert.assertEquals(FAQ_ANSWER_EXTEND_ORDER, text);
        }

        @Test
        public void testFaqQuestionCharging(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextFaqQuestionCharging();
            Assert.assertEquals(FAQ_ANSWER_CHARGING, text);
        }

        @Test
        public void  testFaqQuestionCancelOrder(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextFaqQuestionCancelOrder();
            Assert.assertEquals(FAQ_ANSWER_CANCEL_ORDER, text);
        }

        @Test
        public void testFaqQuestionMkad(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextFaqQuestionMkad();
            Assert.assertEquals(FAQ_ANSWER_MKAD, text);
        }

        @After
        public void teardown() {

            driver.quit();
        }
    }
