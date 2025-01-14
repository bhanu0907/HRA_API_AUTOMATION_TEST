package api.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import api.endpoints.ContentPostEndPoints;

public class ContentPostTests {

	public static	boolean postDeleted=false;

	@BeforeClass
	public static void setup() {
		RestAssured.baseURI = ContentPostEndPoints.BASE_URI;
	}

	@Test(priority = 1)
	public void testCreateContent() {
		Response response = ContentPostEndPoints.createPost();

		response.then()
		.statusCode(201) // Adjust expected status code
		
		.log().all()
		.body("message", notNullValue()) // Example: Ensure a message is returned
		.extract().response();
		
		
		ContentPostEndPoints.postId=response.path("post._id");
		//	System.out.println("Response Body: " + response.getBody().asString()); 
	}

	/*@Test(priority = 2)
	public void testReadContent() {

		Response response=ContentPostEndPoints.readPost();

		response.then()
		//.statusCode(200)
		.log().all();
		Assert.assertEquals(response.getStatusCode(), 200);

		//	System.out.println("Response Body: " + response.getBody().asString()); 
	}*/

	@Test(priority = 2)
	public void testReadllContent() {

		Response response=ContentPostEndPoints.readAllPost();

		response.then()
		.statusCode(200)
		//.body("message", notNullValue())
		//.extract().response()
		.log().all();

		//System.out.println("Response Body: " + response.getBody().asString()); 
	}

	@Test(priority = 3)
	public void testupdateContent() {

		Response response=ContentPostEndPoints.updatePost();

		response.then()
		.statusCode(200)
		.log().all();

		//System.out.println("Response Body: " + response.getBody().asString());
	}

	//@Test(priority = 4)
	public void testDeleteContent() {
		Response response=ContentPostEndPoints.deletePost();

		response.then()
		.statusCode(200)
		.log().all();
		
		// Check if the post is deleted
	/*	String message = response.jsonPath().getString("message");
	    boolean isDeleted = response.jsonPath().getBoolean("data.post.isDeleted");

	    // Update the flag if the response confirms deletion
	    if ("Post deleted successfully".equals(message) && isDeleted) {
	        postDeleted = true;
	    }*/

		//System.out.println("Response Body: " + response.getBody().asString()); 
	}

}
	

