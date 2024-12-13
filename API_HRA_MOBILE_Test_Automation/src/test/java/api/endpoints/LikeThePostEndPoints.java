package api.endpoints;

import static io.restassured.RestAssured.given;

import api.aendpointsutilities.PreRequisite;
import api.payload.LikeThePostPayload;
import io.restassured.response.Response;

public class LikeThePostEndPoints extends PreRequisite{

	String queryUri="like";
	
	LikeThePostPayload likePayload;
	
	public Response likeThePost() {
		
		likePayload=new LikeThePostPayload();
		
		Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)
				.body(likePayload.createLikePayload())
				
				.when()
				.post(queryUri);
		
		System.out.println(BASE_URI+queryUri);
		return response;
	} 
	/*public Response unlikeThePost() {
		
		Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)
				.body(likePayload.createUnLikePayload())
				.when()
				.delete(queryUri);
		return response;
	}*/
	
}
