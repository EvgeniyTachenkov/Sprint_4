package page;

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

    private final By faqQuestionPrice = By.xpath(".//div[text()='Сколько это стоит? И как оплатить?']");

    private final By faqAnswerPrice = By.xpath(".//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");

    private final By faqQuestionMoreScooter = By.xpath(".//div[text()='Хочу сразу несколько самокатов! Так можно?']");

    private final By faqAnswerMoreScooter = By.xpath(".//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    private final By faqQuestionRentTime = By.xpath(".//div[text()='Как рассчитывается время аренды?']");

    private final By faqAnswerRentTime = By.xpath(".//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");

    private final By faqQuestionScooterToday = By.xpath(".//div[text()='Можно ли заказать самокат прямо на сегодня?']");

    private final By faqAnswerScooterToday = By.xpath(".//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");

    private final By faqQuestionExtendOrder = By.xpath(".//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");

    private final By faqAnswerExtendOrder = By.xpath(".//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");

    private final By faqQuestionCharging = By.xpath(".//div[text()='Вы привозите зарядку вместе с самокатом?']");

    private final By faqAnswerCharging = By.xpath(".//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");

    private final By faqQuestionCancelOrder = By.xpath(".//div[text()='Можно ли отменить заказ?']");

    private final By faqAnswerCancelOrder = By.xpath(".//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    private final By faqQuestionMkad = By.xpath(".//div[text()='Я жизу за МКАДом, привезёте?']");
    private final By faqAnswerMkad = By.xpath(".//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");

    public void waitLoadPage() {
        WebElement element = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(faqQuestionMkad));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getTextFaqQuestionPrice() {
        driver.findElement(faqQuestionPrice).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerPrice));
        return driver.findElement(faqAnswerPrice).getText();
    }

    public String getTextFaqQuestionMoreScooter() {
        driver.findElement(faqQuestionMoreScooter).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerMoreScooter));
        return driver.findElement(faqAnswerMoreScooter).getText();
    }

    public String getTextFaqQuestionRentTime() {
        driver.findElement(faqQuestionRentTime).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerRentTime));
        return driver.findElement(faqAnswerRentTime).getText();
    }

    public String getTextFaqQuestionScooterToday() {
        driver.findElement(faqQuestionScooterToday).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerScooterToday));
        return driver.findElement(faqAnswerScooterToday).getText();
    }

    public String getTextFaqQuestionExtendOrder() {
        driver.findElement(faqQuestionExtendOrder).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerExtendOrder));
        return driver.findElement(faqAnswerExtendOrder).getText();
    }

    public String getTextFaqQuestionCharging() {
        driver.findElement(faqQuestionCharging).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerCharging));
        return driver.findElement(faqAnswerCharging).getText();
    }

    public String getTextFaqQuestionCancelOrder() {
        driver.findElement(faqQuestionCancelOrder).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerCancelOrder));
        return driver.findElement(faqAnswerCancelOrder).getText();
    }

    public String getTextFaqQuestionMkad() {
        driver.findElement(faqQuestionMkad).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(faqAnswerMkad));
        return driver.findElement(faqAnswerMkad).getText();
    }
}
