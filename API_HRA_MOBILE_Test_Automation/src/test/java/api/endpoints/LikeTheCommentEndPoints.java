package api.endpoints;

import static io.restassured.RestAssured.given;

import api.aendpointsutilities.PreRequisite;
import api.payload.LikeTheCommentPayLoad;
import io.restassured.response.Response;

public class LikeTheCommentEndPoints extends PreRequisite {

	String queryUri="like";
	
	LikeTheCommentPayLoad likePayload;
	public Response likeTheComment() {
		
		likePayload=new LikeTheCommentPayLoad();
		
		Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)
				.body(likePayload.createLikePayload())
				
				.when()
				.post(queryUri);
		return response;
	}
}
