package crudapp;

import config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;


public class CrudAppTestSuite {
    private static final String BASE_URL = "https://msajkiewicz.github.io/";
    private WebDriver driver;
    private Random generator;


    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//input[@name = \"title\"]";
        final String XPATH_TASK_CONTENT = "//textarea[@name = \"content\"]";
        final String XPATH_ADD_BUTTON = "//button[@type = \"submit\"]";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL="https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("marcinsajkiewicz91@gmail.com");
        Thread.sleep(2000);
        driverTrello.findElement(By.id("login")).click();
        Thread.sleep(2000);
        driverTrello.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
        driverTrello.findElement(By.id("password")).sendKeys("Emwyby8t!");
        driverTrello.findElement(By.id("login-submit")).click();

        Thread.sleep(5000);

        driverTrello.findElement(By.xpath(".//div[@title=\"Kodilla Application\"]")).click();

        Thread.sleep(5000);

        result=driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan->theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size()>0;

        driverTrello.close();

        return result;
    }
    private void deleteTestTaskInCrudApp(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//section[2]")).isDisplayed());

        driver.findElements(By.xpath("//div[@class=\"datatable__tasks-container\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .filter(theForm -> theForm.findElement(By.xpath(".//button[contains(@class, \"datatable__button\")]")).getText().equals("Delete"))
                .forEach(theForm -> theForm.findElement(By.xpath("//div[@class=\"datatable__row-section-wrapper\"]/fieldset[1]/button[4]")).click());

        Thread.sleep(5000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        deleteTestTaskInCrudApp(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
    }
}
