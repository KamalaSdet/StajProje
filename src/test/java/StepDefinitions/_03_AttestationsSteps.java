package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _03_AttestationsSteps {
    DialogContent dc=new DialogContent();
    LeftNav lv=new LeftNav();
    @When("User add {string} in Attestations Categories")
    public void userAddInAttestationsCategories(String name) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndClick("saveButton");
    }

    @And("Naviagate to Attestations Categories")
    public void naviagateToAttestationsCategories() {
        lv.findAndClick("humanRsrButton");
        lv.findAndClick("setupButtonUnderHuman");
        lv.findAndClick("Attestations");
    }
}
