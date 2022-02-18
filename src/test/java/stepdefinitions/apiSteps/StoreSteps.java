package stepdefinitions.apiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class StoreSteps {

    @Given("The request body for post store order is like:")
    public void the_request_body_for_post_store_order_is_like(List<Map<String, Object>> dataTable) {
        Map<String, Object> reqBodyDt = dataTable.get(0);

        CommonApiSteps.requestBodyMap.put("id", reqBodyDt.get("id"));
        CommonApiSteps.requestBodyMap.put("petId", reqBodyDt.get("petId"));
        CommonApiSteps.requestBodyMap.put("quantity", reqBodyDt.get("quantity"));
        CommonApiSteps.requestBodyMap.put("shipDate", reqBodyDt.get("shipDate"));
        CommonApiSteps.requestBodyMap.put("status", reqBodyDt.get("status"));
        CommonApiSteps.requestBodyMap.put("complete", reqBodyDt.get("complete"));
    }

    @Then("Response body for post store order is like:")
    public void response_body_for_post_store_order_is_like(List<Map<String, Object>> dataTable) {
        Map<String, Object> expectedBody = dataTable.get(0);

        JsonPath jsonPath = CommonApiSteps.response.jsonPath();
        Assert.assertEquals(expectedBody.get("id"), jsonPath.getString("id"));
        Assert.assertEquals(expectedBody.get("petId"), jsonPath.getString("petId"));
        Assert.assertEquals(expectedBody.get("status"), jsonPath.getString("status"));
        Assert.assertEquals(expectedBody.get("complete"), jsonPath.getString("complete"));
    }


}
