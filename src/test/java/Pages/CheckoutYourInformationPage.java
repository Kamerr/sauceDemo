package Pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;
import utilities.Driver;

public class CheckoutYourInformationPage extends BasePage{

    @FindBy(id = "first-name")
    public WebElement firstNameInputBar;

    public void fillInfoForm(String firstName, String lastName, String postalCode){
        Actions actions=new Actions(Driver.get());
        actions.click(firstNameInputBar)
                .sendKeys(firstName+Keys.TAB)
                .sendKeys(lastName+ Keys.TAB)
                .sendKeys(postalCode).perform();
        BrowserUtils.waitFor(2);
    }

    public void fillInfoForm(String firstName, String lastName, Integer zipCode){
        Actions actions=new Actions(Driver.get());
        actions.click(firstNameInputBar)
                .sendKeys(firstName+Keys.TAB)
                .sendKeys(lastName+ Keys.TAB)
                .sendKeys(zipCode.toString()).perform();
        BrowserUtils.waitFor(2);
    }

}
