import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class RestAssuredTest {

    @Test(groups = {"rest","api", "allTests"})
    public void RestAssuredTest(){

       given().baseUri("https://reqres.in/").basePath("/api/users?page=2")
               .get().then().assertThat().statusCode(200);

        int statusCode = given().baseUri("https://reqres.in/").basePath("/api/users").body("{\"name\":\"morpheus\",\"job\":\"leader\"}")
                .post().statusCode();
        assertThat("Creating API Users is not Successful",statusCode,equalTo(201));

    }
}
