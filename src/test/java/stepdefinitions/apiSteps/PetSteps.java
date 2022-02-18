package stepdefinitions.apiSteps;

import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import java.util.List;
import java.util.Map;


public class PetSteps {

    @Then("Response body is like:")
    public void response_body_is_like(List<Map<String,Object>> dataTable) {
        Map<String,Object> expectedBody = dataTable.get(0);
        JsonPath jsonPath = CommonApiSteps.response.jsonPath();

        Assert.assertEquals(expectedBody.get("id"), jsonPath.getString("id"));
        Assert.assertEquals(expectedBody.get("name"),jsonPath.getString("name"));
        Assert.assertEquals(expectedBody.get("status"),jsonPath.getString("status"));
    }


}
