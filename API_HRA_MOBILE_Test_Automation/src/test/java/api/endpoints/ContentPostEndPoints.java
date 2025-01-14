package api.endpoints;

import static io.restassured.RestAssured.given;

import api.aendpointsutilities.PreRequisite;
import api.payload.ContentPostPayload;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ContentPostEndPoints //extends PreRequisite
{

	private static  String	bearer_Token =PreRequisite.bearer_Token;

	//https://api.hraindia.org/api/v1/user/post

	public static  String BASE_URI = "https://api.hraindia.org/api/v1/user/post"; // Replace with actual base URL
	//public static  String CREATE_CONTENT = "/user/post"; // Replace with actual endpoint

	static public String postId;

	//RequestSpecification reqSpecification=new RequestSpecBuilder();

	static RequestSpecification requestSpec;

	public static Response createPost() {
		//	String postEndpoint="user/post";

	/*	RequestSpecBuilder requestSpec = new RequestSpecBuilder();
		requestSpec.setBaseUri("https://api.example.com");
		requestSpec.addHeader("Authorization", "Bearer your_token");
		//requestSpec.addPathParams(null)
		requestSpec.build();*/

		given()
		.header("Content-Type", "application/json")
		.header("Authorization", "Bearer " + bearer_Token)
		.body(ContentPostPayload.createContentPayload())

		.when()
		.post();

		return response;
	}

	/*	public static Response readPost() {
		String queryUri="?page=1/";

		Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)

				.when()
				.get(queryUri+postId);

		System.out.println(queryUri+postId+" url for get check ");

		return response;				
	}*/

	public static Response readAllPost() {
		String queryUrI="?page=1/&limit=10";

		Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)

				.when()
				.get(queryUrI);

		return response;
	}

	public static Response updatePost() {

		Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)
				.body(ContentPostPayload.createContentPayload())

				.when()
				.put(postId);

		return response;
	}

	public static Response deletePost()
	{
		Response response=
				given()
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + bearer_Token)

				.when()
				.delete(postId);


		return response;
	}

}

