package api.endpoints;

import static io.restassured.RestAssured.given;

import api.aendpointsutilities.PreRequisite;
import api.payload.CommentOnPostPayload;
import api.payload.ContentPostPayload;
import io.restassured.response.Response;

public class CommentOnPostEndpoints extends PreRequisite {

//   https://api.hraindia.org/api/v1/posts/673d9028a1acfd01e7ba286c/comments
	/*  https://api.hraindia.org/api/v1/posts/673c8968a1acfd01e7ba272e/comments

https://api.hraindia.org/api/v1

	/comments/673d5ccba1acfd01e7ba275d/reply */

	public static String commentId;
	
	public static Response createComment()
	{

		String queryUrl="posts/"+ContentPostEndPoints.postId+"/comments";
		//System.out.println(queryUrl);
		
		
		Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)
				.body(CommentOnPostPayload.createCommentPayload())

				.when()
				.post(queryUrl);
				
				
		return response;
	}
	
	/*public static Response readComment()
	{	
		String queryUrl="posts/"+commentId+"/comments";
		Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)
				.when()
				.get(queryUrl);
		
		return response;
	}*/
	
	public static Response readAllComment() {
		String queryUrl="posts/"+ContentPostEndPoints.postId+"/comments?page=1&limit=10";
		
		
		Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)
				.when()
				.get(queryUrl);
		
		return response;
			
	}
	
	public static Response replayOnComment() {
		String queryUrl="comments/"+CommentOnPostEndpoints.commentId+"/reply";
				Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)
				.body(CommentOnPostPayload.createCommentPayload())
				.when()
				.post(queryUrl);
		
		return response;
	}
	
	/*public static Response getReplayComment() {
		
	}*/
	
	public static Response deleteComment() {
		
		String queryUrl="comments/"+commentId;
		
		Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)
				.when()
				.delete(queryUrl);
		
		return response;
	}

	
}