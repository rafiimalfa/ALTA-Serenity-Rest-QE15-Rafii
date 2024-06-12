package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

public class ListUsersSteps {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Get list users with parameter page {int}")
    public void getListUsersWithParameterPage(int page) {
        reqresAPI.getListUsers(page);
    }

    @When("Send request get list users")
    public void sendRequestGetListUsers() {
        SerenityRest.when().get(ReqresAPI.LIST_USERS);
    }

    @Given("Get list users with parameter page {string}")
    public void getListUsersWithParameterPage(String page) {
        reqresAPI.getListUsersString(page);
    }


//
//    @Given("Get list users with parameter page {String}")
//    public void getListUsersWithParameterPagePage(String page) {
////        reqresAPI.getListUsers(Integer.parseInt(page));
//    }

}
