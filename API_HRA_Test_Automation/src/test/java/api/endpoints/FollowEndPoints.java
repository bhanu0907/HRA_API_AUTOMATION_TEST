package api.endpoints;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.payload_POJO.Follow;
import api.payload_POJO.PostContent1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class FollowEndPoints {
	
static	String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiI2NzFiOGQ2NzMwNDdkOWFhOGVjYTIyNjUiLCJpYXQiOjE3MzAwNTQyMjh9.2dgUeu_cnCO38mytZO4uUx2RLnzDuFMLJ2FbQ2Keiso";
	
	static	ResourceBundle getURL(){

		ResourceBundle routes=ResourceBundle.getBundle("followURL");// Load properties file

		return routes;
	}
	
	/*public static Response cretePost(Follow fallowUser) {
		//Token
		
		
		//URL
		String postURL=getURL().getString("createPostURL");
		Response response= given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				 .header("Authorization", "Bearer " + token)
			//	.header("Content-Type", "application/json")
				.body(fallowUser)
				.when()
				.post(postURL);
		
		return response;
	}*/
	
	public static Response readFollowing(String fallowUserID) {
String getURL=getURL().getString("readGetURL");
		
		Response response= 	given()
	
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				 .header("Authorization", "Bearer " + token)
				//.pathParam("id", fallowUserID)
				.when()
				.get(getURL+fallowUserID);
				//.get(getURL);
		//System.out.println(Roots.getUrl  +"  this is url");

		return response;
	}
	
}
