package apittask;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public abstract class BaseTest {

   private static final String URL = "https://jsonplaceholder.typicode.com/";
   public static RequestSpecification REQUEST_SPEC= new RequestSpecBuilder().setBaseUri(URL).setContentType(ContentType.JSON).build();

   public RequestSpecification given() {
      return io.restassured.RestAssured.given()
                                       .spec(REQUEST_SPEC)
                                       .log().all();

   }
}
