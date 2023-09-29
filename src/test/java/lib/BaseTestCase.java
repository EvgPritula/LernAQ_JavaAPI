package lib;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

import static org.hamcrest.Matchers.hasKey;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BaseTestcase {
    protected String getHeader(@org.jetbrains.annotations.NotNull Response Response, String name) {
        Headers headers = Response.getHeaders();

        assertTrue(headers.hasHeaderWithName(name), "Response does not have header with name " + name);
        return headers.getValue(name);
    }

    protected int getIntFromJson(@NotNull Response Response, String name) {
        Response.then().assertThat().body("$", hasKey(name));
        return Response.jsonPath().getInt(name);
    }

}