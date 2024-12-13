package api.test;

import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import api.endpoints.LikeTheCommentEndPoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LikeTheCommentTests {

	@BeforeTest
	public static void setUp() {
		RestAssured.baseURI=LikeTheCommentEndPoints.BASE_URI;
	}
	
	@Test(priority =1)
	public void testcreateCommentLike() {
		LikeTheCommentEndPoints likeComment=new LikeTheCommentEndPoints();
		Response response=likeComment.likeTheComment();
		
		response.then()
		.statusCode(201)// Adjust expected status code
		.log().all()
		.body("message", notNullValue()); // Example: Ensure a message is returned
	
	}
		
}
