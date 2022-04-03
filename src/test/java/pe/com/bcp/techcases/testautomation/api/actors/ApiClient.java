package pe.com.bcp.techcases.testautomation.api.actors;


import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.equalTo;

public class ApiClient {

    private Response response;
    private static final String contentType = "application/json";

    @Step
    public void readStatus(String url) {
        response = SerenityRest.given().contentType(contentType).when().get(url);
        response.
            then().assertThat().statusCode(200);
    }

    @Step
    public void readContent(String expectedMessage) {
        response.
            then().log().all().body("status", equalTo(expectedMessage));
    }
}
