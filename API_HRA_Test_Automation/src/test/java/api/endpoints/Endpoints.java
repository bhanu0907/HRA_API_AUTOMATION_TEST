package api.endpoints;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Endpoints {
	public static final String BASE_URL = "https://your-api-base-url.com";
	public static final String POST_ENDPOINT = "/api/v1/your-endpoint";

	static {
		// Set Base URI
		RestAssured.baseURI = BASE_URL;
	}

	// POST Request
	public Response sendPostRequest(Object payload) {
		
		String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiI2NzFiOGQ2NzMwNDdkOWFhOGVjYTIyNjUiLCJpYXQiOjE3MzAwNTQyMjh9.2dgUeu_cnCO38mytZO4uUx2RLnzDuFMLJ2FbQ2Keiso";
		Response response= 
			given()
				.contentType(ContentType.JSON)
				//.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				 .header("Authorization", "Bearer " + token)
				.body(payload)
				.when()
				.post(POST_ENDPOINT);

		return response;
	}
	
}



