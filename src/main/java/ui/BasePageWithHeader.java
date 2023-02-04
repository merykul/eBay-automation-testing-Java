package ui;

import componentPO.HeaderComponent;
import org.openqa.selenium.WebDriver;
import ui.BasePO;

public class BasePageWithHeader extends HeaderComponent {

    public BasePageWithHeader(WebDriver driver) {
        super(driver);
    }
}