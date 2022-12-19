package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{


    public LeftNav()
    {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'Human Resources')]") // omer
    private WebElement humanRsrButton;

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c252-18 ng-star-inserted']") // omer
    private WebElement setupButtonUnderHuman;

    @FindBy(xpath = "//span[contains(text(),'Position Categories')]") // omer
    private WebElement positionCategories;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]") // Ali
    private WebElement Attestations;





    WebElement myElement;

    public void findAndClick(String Strlement) {
        switch (Strlement)
        {
            case "humanRsrButton":myElement=humanRsrButton;break;
            case "setupButtonUnderHuman":myElement=setupButtonUnderHuman;break;
            case "positionCategories":myElement=positionCategories;break;
            case "Attestations":myElement=Attestations;break;
        }
        clickFunction(myElement);
    }
}
