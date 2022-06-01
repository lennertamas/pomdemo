import org.openqa.selenium.WebDriver;

public class PageFactory {

    public static PageBase Create(String name, WebDriver driver)
    {
        switch (name)
        {
            case "SimpleFirst":
                return  new SimpleFirstPage(driver);
            case "CheckBox":
                return  new CheckBoxPage(driver);
            default:
                return null;
        }
    }
}
