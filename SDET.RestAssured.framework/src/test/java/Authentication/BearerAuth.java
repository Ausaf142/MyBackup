package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class BearerAuth {
@Test
public void bearerToken() {
	baseURI="http://api.github.com";
	JSONObject jobj=new JSONObject();
	jobj.put("name", "SDET-Rest");
	jobj.put("description", "Hybrid");
	
	given()
	.auth()
	.oauth2("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")
	.body(jobj)
	.contentType(ContentType.JSON)
	.when()
	.post("user/repos")
	.then()
	.log().all();
		
		
		
		
	
	
	
}
}
