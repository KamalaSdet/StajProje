package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent()
    {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(css = "button[class='consent-give']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button") // omer
    private WebElement addButton; // ortak Locator

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input") // omer
    private WebElement nameInput; // ortak Locator

    @FindBy(xpath = "//span[contains(text(),'Save')]") // omer
    private WebElement saveButton; // ortak Locator

    @FindBy(xpath = "//span[contains(text(),'Search')]") // omer
    private WebElement searchButton; // ortak Locator

    @FindBy(xpath = "//input[@data-placeholder='Name']") // omer
    private WebElement searchInput; // ortak Locator

    @FindBy(xpath = "//ms-delete-button//button") // omer
    private WebElement deleteButton; // ortak Locator

    @FindBy(xpath = "//span[contains(text(),' Delete ')]") // omer
    private WebElement deleteDialogButton; // ortak Locator

    @FindBy(xpath = "//input[@data-placeholder='Short Name']") // omer
    private WebElement shortNameInput;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]") // omer
    private WebElement locationsTypes;

    @FindBy(xpath = "//span[contains(text(),'Other')]") // omer
    private WebElement otherTypes;

    @FindBy(xpath = "//input[@data-placeholder='Capacity']") // omer
    private WebElement capasityInput;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']") // omer
    private WebElement toggleBar;



    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;


    @FindBy(xpath = "//ms-add-button['tooltip=GENERAL.BUTTON.ADD']//button")
    private WebElement addButton2;  //kamala














    WebElement myElement;

    public void findAndSend(String strlement, String value) {
        switch (strlement)
        {
            case "username" : myElement=username;break;
            case "password" : myElement=password;break;
            case "nameInput" : myElement=nameInput;break;
            case "codeInput" : myElement=codeInput;break;
            case "searchInput" : myElement=searchInput;break;
            case "shortNameInput" : myElement=shortNameInput;break;
            case "capasityInput" : myElement=capasityInput;break;


        }
            sendKeysFunction(myElement,value);
    }

    public void findAndClick(String Strlement) {
        switch (Strlement)
        {
            case "loginButton" : myElement=loginButton;break;
            case "addButton" : myElement=addButton;break;
            case "saveButton" : myElement=saveButton;break;
            case "searchButton" : myElement=searchButton;break;
            case "deleteButton" : myElement=deleteButton;break;
            case "deleteDialogButton" : myElement=deleteDialogButton;break;
            case "acceptCookies" : myElement=acceptCookies;break;
            case "locationsTypes" : myElement=locationsTypes;break;
            case "otherTypes" : myElement=otherTypes;break;
            case "toggleBar" : myElement=toggleBar;break;
            case "addButton2" : myElement=addButton2;break;


        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strlement, String text) {
        switch (strlement)
        {
            case "txtTechnoStudy" : myElement=txtTechnoStudy;break;
            case "successMessage" : myElement=successMessage;break;

        }
        verifyContainsTextFunction(myElement,text);
    }
    public void findAndDelete(String searchText) {
        findAndSend("searchInput", searchText);  // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

        waitUntilLoading(); // progressbar ın çocukları 0 olana kadar bekle

        findAndClick("deleteButton"); // silme butonua bas, çöp kutusu
        findAndClick("deleteDialogButton"); // dilogdaki silme butonuna bas

    }
    public void findAndDelete2(){
        findAndClick("deleteButton"); // silme butonua bas, çöp kutusu
        waitUntilLoading(); // progressbar ın çocukları 0 olana kadar bekle
        findAndClick("deleteDialogButton"); // dilogdaki silme butonuna bas
    }
}
