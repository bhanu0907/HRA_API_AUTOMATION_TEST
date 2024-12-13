package api.endpoints;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.payload_POJO.PostContent;
import api.payload_POJO.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints2 {


	//Created for getting URL's from properties method
	static	ResourceBundle getURL(){

		ResourceBundle routes=ResourceBundle.getBundle("routes");// Load properties file

		return routes;
	}

	//Post
	public static Response creteUser(User payload1) {

		//Key of the URL in Prop file
		String postURL=getURL().getString("postUrl");
		Response response= 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload1)
				.when()
				.post(postURL);

		return response;

	}

	//Get
	public static Response readUser(String userName) {
		String getURL=getURL().getString("getUrl");
		
		Response response= 	given()
				.pathParam("username", userName)
				.when()
				.get(getURL);
		//System.out.println(Roots.getUrl  +"  this is url");

		return response;

	}

	//PUT(Update)
	public static Response updateUser(String userName, User payLoad) {
		//public static Response updateUser(User userName) {
		
		String updateURL=getURL().getString("updateUrl");

		Response response= 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payLoad)
				.pathParam("username",userName )
				.when()
				.put(updateURL);

		return response;

	}

	public static Response deleteUser(String userName) {
		//System.out.println(userName+"   delete check");
		//String url=Roots.deleteUrl+userName;
		//System.out.println(url+ "   url check");
		
		String deleteURL=getURL().getString("deleteUrl");
		Response response= 	given()
				.pathParam("username", userName)
				.when()
				.delete(deleteURL);

		return response;
	}

}
