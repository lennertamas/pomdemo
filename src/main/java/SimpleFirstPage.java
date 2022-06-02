import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class SimpleFirstPage extends PageBase {


    private final String url = "https://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final By messageBox = By.xpath("//*[@id=\"user-message\"]");
    private final By showMessagaButton = By.xpath("//*[@id=\"get-input\"]/button");
    private final By resultLabel = By.xpath("//*[@id=\"display\"]");
    private final By getTotalButton = By.xpath("//*[@id=\"gettotal\"]/button");

    public SimpleFirstPage(WebDriver drv)
    {
        super(drv);
    }

    public void navigate()
    {
        driver.navigate().to(url);
    }

    public void setMessage(String message)
    {
        driver.findElement(messageBox).sendKeys(message);
    }

    public void clickOnMessageButton()
    {
        driver.findElement(showMessagaButton).click();
    }

    public void clickOnMessageButtonWithAction()
    {
          Actions actions = new Actions(driver);

          actions.moveToElement(driver.findElement(showMessagaButton)).contextClick().perform();
    }

    public String getResultMessage()
    {
        String result = driver.findElement(resultLabel).getText();

        return result;
    }

    public void scrollToGetTotalButton() throws InterruptedException {
        WebElement button=driver.findElement(getTotalButton);
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", button);
        Thread.sleep(500);
    }




}
