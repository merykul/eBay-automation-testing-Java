package componentPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.BasePO;

public class HeaderComponent extends BasePO {

    @FindBy(xpath = "//a[href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F']")
    private WebElement signInLink;

    @FindBy(xpath = "//a[@data-sp='m570.l3188']")
    private WebElement DailyDealsLink;

    @FindBy(xpath = "//a[@data-sp='m570.l1545']")
    private WebElement HelpAndContactLink;

    @FindBy(xpath = "//a[@data-sp='m570.l47233']")
    private WebElement brandOutletLink;

    @FindBy(xpath = "//a[@data-sp='m570.l1528']")
    private WebElement sellLink;

    @FindBy(xpath = "//a[@title='My eBay']")
    private WebElement myEbayDropdownMenu;

    @FindBy(xpath = "//i[@id='gh-Alerts-i']")
    private WebElement notificationIcon;

    @FindBy(xpath = "//svg[@class='gh-cart-icon']")
    private WebElement basketItem;

    @FindBy(xpath = "//a[@id='gh-la']")
    private WebElement logo;

    @FindBy(xpath = "//i[@id='gh-shop-ei']")
    private WebElement shopByCategoryDropdownMenu;

    @FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
    private WebElement searchInputField;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }
}
