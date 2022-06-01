import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SimpleFirstPage extends PageBase {


    private final String url = "https://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final By messageBox = By.xpath("//*[@id=\"user-message\"]");
    private final By showMessagaButton = By.xpath("//*[@id=\"get-input\"]/button");
    private final By resultLabel = By.xpath("//*[@id=\"display\"]");

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

    public String getResultMessage()
    {
        String result = driver.findElement(resultLabel).getText();

        return result;
    }




}
