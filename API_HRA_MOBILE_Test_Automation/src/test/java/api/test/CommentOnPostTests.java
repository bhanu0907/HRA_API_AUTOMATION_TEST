package api.test;

import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.endpoints.CommentOnPostEndpoints;
import api.endpoints.ContentPostEndPoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CommentOnPostTests {

	@BeforeClass
	public static void setup() {
		RestAssured.baseURI = CommentOnPostEndpoints.BASE_URI;
	}

	@Test(priority = 1)
	public void testCreateComment() {
		if(ContentPostTests.postDeleted) {
			System.out.println("Post is deleted can't create Comment for it");

		}
		else {
			Response response=CommentOnPostEndpoints.createComment();

			response.then()
			.statusCode(201)
			.log().all()
			.body("message", notNullValue());

			CommentOnPostEndpoints.commentId=response.path("comment._id");
		}
	}

	/*@Test(dependsOnMethods = "testCreateComment")
	public void testReadComment() {
		Response response=CommentOnPostEndpoints.readComment();

		response.then()
		.statusCode(200)
		.log().all();

	}*/

	@Test(dependsOnMethods = "testCreateComment")
	public void testReadAllComment() {
		Response response=CommentOnPostEndpoints.readAllComment();

		response.then()
		.statusCode(200);
		//.log().all();		
	}

	@Test(dependsOnMethods = "testCreateComment")
	public void testCreateReplayComment() {
		Response response=CommentOnPostEndpoints.replayOnComment();
		response.then()
		.statusCode(200)
		.log().all();
	}

	//@AfterClass
	//@Test(dependsOnMethods= {"testCreateComment","testReadAllComment","testCreateReplayComment"} )
	@Test(dependsOnMethods= {"testReadAllComment","testCreateReplayComment"})
	public void testDeleteComment() {

		Response response=CommentOnPostEndpoints.deleteComment();

		response.then()
		.statusCode(200)
		.log().all();		
	}
	
}
