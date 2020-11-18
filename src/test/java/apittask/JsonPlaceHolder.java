package apittask;

import org.junit.jupiter.api.Test;

public class JsonPlaceHolder extends BaseTest {


   @Test
   public void sampleTest(){
      given()
         .queryParam("id", 10)
         .get("/photos")
         .then()
         .statusCode(200)
         .log().all();
   }

}
