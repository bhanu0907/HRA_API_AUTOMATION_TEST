package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload_POJO.PostContent;
import api.payload_POJO.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints {


	//Post
	public static Response creteUser(User payload1) {

		Response response= 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload1)
				.when()
				.post(Roots.postUrl);

		return response;

	}

	//Get
	public static Response readUser(String userName) {

		Response response= 	given()
			
				.pathParam("username", userName)
				.when()
				.get(Roots.getUrl);
		//System.out.println(Roots.getUrl  +"  this is url");

		return response;

	}

	//PUT(Update)
	public static Response updateUser(String userName, User payLoad) {
		//public static Response updateUser(User userName) {

		Response response= 	given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payLoad)
				.pathParam("username",userName )
				.when()
				.put(Roots.updateUrl);

		return response;

	}
	public static Response deleteUser(String userName) {
		//System.out.println(userName+"   delete check");
		//String url=Roots.deleteUrl+userName;
		//System.out.println(url+ "   url check");
		Response response= 	given()
				.pathParam("username", userName)
				.when()
				
				.delete(Roots.deleteUrl);
		
		return response;
	}


	
	/*public static Response ReadPost(String userName) {

		Response response= 	given()

				.pathParam("stringdelete", userName)
				.when()
				.delete(Roots.deleteUrl);

		return response;
	}*/
//https://petstore.swagger.io/v2/user/juan.schinner  (delete)

}
