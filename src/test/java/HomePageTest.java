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
        public void goOver(){
            driver.get(LINK_YANDEX);
            driver.findElement(By.id("rcc-confirm-button")).click();
        }

        @Test
        public void testOneQuestions(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextOneQuestion();
            Assert.assertEquals(ONE_ANSWER, text);
        }

        @Test
        public void testTwoQuestions(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextTwoQuestion();
            Assert.assertEquals(TWO_ANSWER, text);
        }

        @Test
        public void testThreeQuestion(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextThreeQuestion();
            Assert.assertEquals(THREE_ANSWER, text);
        }

        @Test
        public void testFourQuestion(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextFourQuestion();
            Assert.assertEquals(FOUR_ANSWER, text);
        }

        @Test
        public void testFiveQuestion(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextFiveQuestion();
            Assert.assertEquals(FIVE_ANSWER, text);
        }

        @Test
        public void testSixQuestion(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextSixQuestion();
            Assert.assertEquals(SIX_ANSWER, text);
        }

        @Test
        public void  testSevenQuestion(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextSevenQuestions();
            Assert.assertEquals(SEVEN_ANSWER, text);
        }

        @Test
        public void testEightQuestion(){
            HomePage homePage = new HomePage(driver);
            homePage.waitLoadPage();
            String text = homePage.getTextEightQuestion();
            Assert.assertEquals(EIGHT_ANSWER, text);
        }

        @After
        public void teardown() {
            driver.quit();
        }
    }
