import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

public class GetJson_Ex5 {

    @Test
    public void GetJson_Ex5() {
        JsonPath response = RestAssured
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();

        String secondMessageText = response.get("messages[1].message");
        System.out.println("Second message text: " + secondMessageText);
    }
}
