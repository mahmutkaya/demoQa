package stepdefinitions.apiSteps;

import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class UserSteps {



    @Then("The request body for post user is like:")
    public void the_request_body_for_post_user_is_like(List<Map<String, Object>> dataTable) {
        Map<String,Object> reqBodyDt = dataTable.get(0);

        CommonApiSteps.requestBodyMap.put("id", reqBodyDt.get("id"));
        CommonApiSteps.requestBodyMap.put("username", reqBodyDt.get("username"));
        CommonApiSteps.requestBodyMap.put("firstName", reqBodyDt.get("firstName"));
        CommonApiSteps.requestBodyMap.put("lastName", reqBodyDt.get("lastName"));
        CommonApiSteps.requestBodyMap.put("email", reqBodyDt.get("email"));
        CommonApiSteps.requestBodyMap.put("password", reqBodyDt.get("password"));
        CommonApiSteps.requestBodyMap.put("phone", reqBodyDt.get("phone"));
        CommonApiSteps.requestBodyMap.put("userStatus", reqBodyDt.get("userStatus"));
     }

    @Then("response body of user post request is like:")
    public void response_body_of_user_post_request_is_like(List<Map<String, Object>> dataTable) {
        Map<String,Object> expectedBody = dataTable.get(0);

        JsonPath jsonPath= CommonApiSteps.response.jsonPath();
        Assert.assertEquals(expectedBody.get("code"), jsonPath.getString("code"));
        Assert.assertEquals(expectedBody.get("type"), jsonPath.getString("type"));
        Assert.assertEquals(expectedBody.get("message"),jsonPath.getString("message"));
    }

}
