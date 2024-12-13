package apiautomation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


//https://reqres.in//api/users/2

//https://reqres.in//api/users



/*given()
 * pre-requiestes
 * 
 * 
 * 
 * when()
 * request
 * get(), post(),put, delete 
 * 
 * 
 * 
 * then()***
 * Validation status code, extract resopnse, extreact headers,   
 * 
 *
 *
 *
 *
 * */


public class HTTPRequests {
	
	int id;

	@Test
	void getUsers()
	{
		given()

		.when()
		.get("//https://reqres.in//api/users?page=2")

		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();
	}

	void createUser() {
		HashMap hashMap=new HashMap();
		
		hashMap.put("name", "pavan");
		hashMap.put("job", "Cunstlant");
		id= given()
		.contentType("application/json");
		
		.body(data)
		.when()
		post
		.get()
		
		.then()
		.statusCode(201)
		.
	}
	
}
