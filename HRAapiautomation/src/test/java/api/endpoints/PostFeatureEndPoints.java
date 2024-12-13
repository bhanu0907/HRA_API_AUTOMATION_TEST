package api.endpoints;


//Created to perform CRUD requests with API 


import static io.restassured.RestAssured.*;

import java.nio.channels.AcceptPendingException;

import api.payload_POJO.PostContent;
import  io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostFeatureEndPoints 

{

	//Post
	public static Response cretePost(PostContent payload1) {

		Response response= 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload1)
				.when()
				.post(Roots.postUrl);

		return response;

	}

	//Get
	public static Response readPost(String getString ) {

		Response response= 	given()
				//			   .contentType(ContentType.JSON)
				//			   .accept(ContentType.JSON)
				//			     .body(payload1)

				.pathParam("stringget", getString)
				.when()
				.post(Roots.getUrl);///user/post?page=1&limit=10

		return response;

	}

	//PUT(Update)
	//public static Response cretePst(String putUpdate,Post payload1) {
	public static Response cretePut(PostContent payload2) {

		Response response= 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload2)
				//    .pathParam("stringupdate",putUpdate )
				.when()
				.put(Roots.updateUrl);

		return response;

	}
	
	public static Response deletePost(String getString ) {

		Response response= 	given()
				//			   .contentType(ContentType.JSON)
				//			   .accept(ContentType.JSON)
				//			     .body(payload1)

				.pathParam("stringget", getString)
				.when()
				.post(Roots.getUrl);///user/post?page=1&limit=10

		return response;

	}
	public static Response ReadPost(String deleteString ) {

		Response response= 	given()
			
				.pathParam("stringdelete", deleteString)
				
				.when()
				.delete(Roots.deleteUrl);
				
		return response;
	}


}
