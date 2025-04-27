package api.qa.cashwise.stepdefinitions;

import api.qa.cashwise.endpoints.EP_Clients;
import io.cucumber.java.en.Then;

public class SD_ClientsSteps {
    EP_Clients epClients = new EP_Clients();

    @Then("User validates {string}, {string}, {string} and {string} from end-point")
    public void user_validates_and_from_end_point(String expectedCompanyName, String expectedNameTag, String expectedTagCompanyName, String expectedEmail) {
        epClients.validateCreateClientData(expectedCompanyName, expectedNameTag, expectedTagCompanyName, expectedEmail);
    }

    @Then("User validates {string}, {string}, {string} and {string} from end-point Get")
    public void user_validates_and_from_end_point_get(String expectedCompanyName, String expectedNameTag, String expectedTagCompanyName, String expectedEmail) {
        epClients.validateGetClientInformation(expectedCompanyName, expectedNameTag, expectedTagCompanyName, expectedEmail);

    }

    @Then("User validates {string}, {string}, {string} and {string} from end-point Put")
    public void user_validates_and_from_end_point_put(String expectedCompanyName, String expectedNameTag, String expectedTagCompanyName, String expectedEmail) {
        epClients.validateUpdateClientInformation(expectedCompanyName, expectedNameTag, expectedTagCompanyName, expectedEmail);
    }

    @Then("User validates {string}, {string}, {string} and {string} from end-point Delete")
    public void user_validates_and_from_end_point_delete(String expectedCompanyName, String expectedNameTag, String expectedTagCompanyName, String expectedEmail) {
        epClients.validateDeleteClient(expectedCompanyName, expectedNameTag, expectedTagCompanyName, expectedEmail);
    }

    @Then("User validates {string} and {string} from end-point Get")
    public void user_validates_and_from_end_point_get(String expectedMessage, String expectedDetailsMessage) {
        epClients.validateDeletedClient(expectedMessage, expectedDetailsMessage);
    }



}
