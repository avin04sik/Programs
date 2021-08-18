import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// validate if add feature  api is working as expected
		RestAssured.baseURI="https://emsldk-daily01.highend.engg-services.com/ems/api/v5/features";
		given().header("Content-Type","application/json").header("Authorization","Basic YWRtaW46YWRtaW4=")
		.body("{
                    "feature": {
                    "namespace": {
                    "name": "TestNamespace"
                      },
                   "nameVersion": {
                   "name": "testFeature",
                   "version": "1.0"
                      }
                    }
                  }")
		when()
		then();
	}

}
