package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By oneQuestion = By.id("accordion__heading-0");
    private final By oneAnswer = By.id("accordion__panel-0");
    private final By twoQuestion = By.id("accordion__heading-1");
    private final By twoAnswer = By.id("accordion__panel-1");
    private final By threeQuestion = By.id("accordion__heading-2");
    private final By threeAnswer = By.id("accordion__panel-2");
    private final By fourQuestion = By.id("accordion__heading-3");
    private final By fourAnswer = By.id("accordion__panel-3");
    private final By fiveQuestion = By.id("accordion__heading-4");
    private final By fiveAnswer = By.id("accordion__panel-4");
    private final By sixQuestion = By.id("accordion__heading-5");
    private final By sixAnswer = By.id("accordion__panel-5");
    private final By sevenQuestion = By.id("accordion__heading-6");
    private final By sevenAnswer = By.id("accordion__panel-6");
    private final By eightQuestion = By.id("accordion__heading-7");
    private final By eightAnswer = By.id("accordion__panel-7");

    public void waitLoadPage() {
        WebElement element = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(eightQuestion));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getTextOneQuestion() {
        driver.findElement(oneQuestion).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(oneAnswer));
        return driver.findElement(oneAnswer).getText();
    }

    public String getTextTwoQuestion() {
        driver.findElement(twoQuestion).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(twoAnswer));
        return driver.findElement(twoAnswer).getText();
    }

    public String getTextThreeQuestion() {
        driver.findElement(threeQuestion).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(threeAnswer));
        return driver.findElement(threeAnswer).getText();
    }

    public String getTextFourQuestion() {
        driver.findElement(fourQuestion).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(fourAnswer));
        return driver.findElement(fourAnswer).getText();
    }

    public String getTextFiveQuestion() {
        driver.findElement(fiveQuestion).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(fiveAnswer));
        return driver.findElement(fiveAnswer).getText();
    }

    public String getTextSixQuestion() {
        driver.findElement(sixQuestion).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(sixAnswer));
        return driver.findElement(sixAnswer).getText();
    }

    public String getTextSevenQuestions() {
        driver.findElement(sevenQuestion).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(sevenAnswer));
        return driver.findElement(sevenAnswer).getText();
    }

    public String getTextEightQuestion() {
        driver.findElement(eightQuestion).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(eightAnswer));
        return driver.findElement(eightAnswer).getText();
    }
}
