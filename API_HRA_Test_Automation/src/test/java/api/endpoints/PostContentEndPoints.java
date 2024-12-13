package api.endpoints;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import org.json.JSONObject;

import api.payload_POJO.PostContent;
import api.payload_POJO.PostContent1;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostContentEndPoints {
	
	//Created for getting URL's from properties method
	static	ResourceBundle getURL(){

		ResourceBundle routes=ResourceBundle.getBundle("routesURL");// Load properties file

		return routes;
	}
	
	
	public static Response cretePost(PostContent1 mediaContent) {
		//Token
		
		String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiI2NzFiOGQ2NzMwNDdkOWFhOGVjYTIyNjUiLCJpYXQiOjE3MzAwNTQyMjh9.2dgUeu_cnCO38mytZO4uUx2RLnzDuFMLJ2FbQ2Keiso";
		
		//URL
		String postURL=getURL().getString("createPostURL");
		Response response= given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				 .header("Authorization", "Bearer " + token)
			//	.header("Content-Type", "application/json")
				.body(mediaContent)
				.when()
				.post(postURL);
		
		return response;
	}

}

