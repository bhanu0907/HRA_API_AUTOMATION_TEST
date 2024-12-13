package api.test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import api.endpoints.LikeThePostEndPoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LikeThePostsTests {

	@BeforeTest
	public static void setUp() {
		RestAssured.baseURI=LikeThePostEndPoints.BASE_URI;
	}
	
	@Test(priority =1)
	public void testcreate() {
		LikeThePostEndPoints likePost=new LikeThePostEndPoints();
		Response response=likePost.likeThePost();
		
		response.then()
		.statusCode(201)// Adjust expected status code
		.log().all();
	//	.body("message", notNullValue()); // Example: Ensure a message is returned
		//.extract().response();
		
	}
	
/*Test(priority = 2)
	public  void testUnLikeThePost()
	{
		LikeThePostEndPoints likePost=new LikeThePostEndPoints();
		Response response=likePost.unlikeThePost();
		
		response.then()
		.statusCode(200)// Adjust expected status code
		.log().all();
		
	}*/
	
}
