import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUp extends PageBase{

    By xButton = By.xpath("//*[@id=\"at-cv-lightbox-close\"]");

    public PopUp(WebDriver drv)
    {
        super(drv);
    }

    public void clickOnX()
    {
        driver.findElement(xButton).click();
    }

}
