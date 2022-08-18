package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NextPages {
    static WebDriver driver;
    private static final By buttonOneOrder = By.className("Button_Button__ra12g");
    private final By secondButtonOrder = By.xpath("//button[contains(@class,'Button_Middle__1CSJM')]");
    private static final By nameField = By.xpath("//input[@placeholder = '* Имя']");
    private static final By surnameField = By.xpath(".//input[@placeholder = '* Фамилия']");
    private static final By addressField = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private static final By station = By.xpath(".//input[@placeholder = '* Станция метро']");
    private static final By selectMetroField = By.xpath("//div[@class='select-search__select']/ul//li/button[@value='20']");
    private static final By phoneField = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    private static final By buttonNext = By.xpath(".//button[text() = 'Далее']");
    private static final By dataField = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    private static final By date = By.xpath("//*[text() = '10']");
    private static final By rentDate = By.className("Dropdown-control");
    private static final By rentDateElement = By.xpath(".//*[text() = 'двое суток']");
    private static final By colourCheckbox = By.xpath(".//input[@id = 'black']");
    private final By commentField = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    private static final By buttonOrder = By.xpath("//button[contains(@class, 'Button_Middle__1CSJM')][text() = 'Заказать']");
    private static final By buttonYes = By.xpath(".//button[text() = 'Да']");
    private static final By viewWindow = By.xpath("//button[text()='Посмотреть статус']");

    public NextPages(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickFirstButtonOneOrder() {
        driver.findElement(buttonOneOrder).click();
    }

    public void clickSecondButtonOrder() {
        driver.findElement(secondButtonOrder).click();
    }

    public static void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public static void setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    public static void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public static void setMetro() {
        driver.findElement(station).click();
        driver.findElement(selectMetroField).click();
    }

    public static void setPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public static void clickNext() {
        driver.findElement(buttonNext).click();
    }

    public static void login(String name, String surname, String address, String phone) {
        setName(name);
        setSurname(surname);
        setAddress(address);
        setPhone(phone);
        clickNext();
    }

    public static void clickDate() {
        driver.findElement(dataField).click();
    }

    public static void clickChooseDate() {
        driver.findElement(date).click();
    }

    public static void clickRentDate() {
        driver.findElement(rentDate).click();
    }

    public static void clickRentElement() {
        driver.findElement(rentDateElement).click();
    }

    public static void clickCheckbox() {
        driver.findElement(colourCheckbox).click();
    }

    public void Comments() {
        driver.findElement(commentField).sendKeys("Прошу привезти быстрее");
    }

    public static void clickOrder() {
        driver.findElement(buttonOrder).click();
    }

    public static void clickYesButton() {
        driver.findElement(buttonYes).click();
    }

    public static void loginRentalInfo() {
        clickDate();
        clickChooseDate();
        clickRentDate();
        clickRentElement();
        clickCheckbox();
        clickOrder();
        clickYesButton();
    }

    public static String getStatusView() {
        return driver.findElement(viewWindow).getText();
    }
}
