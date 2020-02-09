package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String WEBSITE = "https://www.facebook.com/";
    public static final String XPATH_NAMEAREA = "//input[@name = \"firstname\"]";
    public static final String XPATH_LASTNAMEAREA = "//input[@name = \"lastname\"]";
    public static final String XPATH_EMAILAREA = "//input[@name = \"reg_email__\"]";
    public static final String XPATH_EMAILCONFIRMATIONAREA = "//input[@name = \"reg_email_confirmation__\"]";
    public static final String XPATH_PASSWORD = "//input[@name = \"reg_passwd__\"]";
    public static final String XPATH_SELECTDAY = "//select[@name = \"birthday_day\"]";
    public static final String XPATH_SELECTMONTH = "//select[@name = \"birthday_month\"]";
    public static final String XPATH_SELECTYEAR = "//select[@name = \"birthday_year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(WEBSITE);

        WebElement nameField = driver.findElement(By.xpath(XPATH_NAMEAREA));
        nameField.sendKeys("Marcin");

        WebElement lastnameField = driver.findElement(By.xpath(XPATH_LASTNAMEAREA));
        lastnameField.sendKeys("Sajkiewicz");

        WebElement emailField = driver.findElement(By.xpath(XPATH_EMAILAREA));
        emailField.sendKeys("exampleemail@gmail.com");

        while (!driver.findElement(By.xpath(XPATH_EMAILCONFIRMATIONAREA)).isDisplayed());

        WebElement emailconfirmationField = driver.findElement(By.xpath(XPATH_EMAILCONFIRMATIONAREA));
        emailconfirmationField.sendKeys("exampleemail@gmail.com");

        WebElement passField = driver.findElement(By.xpath(XPATH_PASSWORD));
        passField.sendKeys("pass");

        WebElement bDay = driver.findElement(By.xpath(XPATH_SELECTDAY));
        Select selectDay = new Select(bDay);
        selectDay.selectByValue("28");

        WebElement bMonth = driver.findElement(By.xpath(XPATH_SELECTMONTH));
        Select selectMonth = new Select(bMonth);
        selectMonth.selectByValue("9");

        WebElement bYear = driver.findElement(By.xpath(XPATH_SELECTYEAR));
        Select selectYear = new Select(bYear);
        selectYear.selectByValue("1991");

    }


}
