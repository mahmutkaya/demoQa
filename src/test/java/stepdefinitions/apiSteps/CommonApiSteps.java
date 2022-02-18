package stepdefinitions.apiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CommonApiSteps {

    public static String endpoint;
    public static Response response;

    public static Map<String, Object> requestBodyMap = new HashMap<>();

    private String uri = ConfigReader.getProperty("api_base_uri");

    @Given("The endpoint is {string}")
    public void the_endpoint_is(String endpoint) {
        CommonApiSteps.endpoint = uri+endpoint;
    }

    @When("I send POST request")
    public void i_send_post_request() {
        response = given().
                contentType(ContentType.JSON).
                body(requestBodyMap).
                when().
                post(endpoint);
    }

    @When("I send GET Request")
    public void i_send_get_request() {
        response = given().
                accept("application/json").
                when().
                get(endpoint);
    }

    @Then("Status code is {int}")
    public void status_code_is(Integer int1) {
        response.then().assertThat().statusCode(int1);
    }
}
