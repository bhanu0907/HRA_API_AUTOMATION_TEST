package apiautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class ParsingJsonResponseData {


	@Test
	void testJsonResponse()
	{
		
		RestAssured
		given()
		.contentType("ContentType.JASON")


		.when()
		.get("http://localhost:3000/  ")


		.then()
		.statusCode(200)
		//	.header("Content-Type", "application/jason;charset=utf-8")
		.body("students[3].name",equalTo("JohnBabai"));
		
		


	}

	@Test
	void storeInVariable() {

		Response res=given()
				.contentType(ContentType.JSON)

				.when()
				.get("http://localhost:3000/  ");
		//res.getStatusCode();

		Assert.assertEquals(res.getStatusCode(),200);

		//	Assert.assertEquals(res.header("Content-Type"),"");	

		String name=	res.jsonPath().get("students[3].name").toString();
		Assert.assertEquals("\"students[3].name\"", name);
		
		
		

	}

	@Test
	void validateWithJSONObject()
	{
	Response response=	given()
		.contentType("")
		
		.when()
		
		.get("http://localhost:3000/");
		
		JSONObject jsonObject=new JSONObject(response.toString());
		
		for(int i=0;i<jo.getJASON) {
			
		}
		
		
		
	}
}
