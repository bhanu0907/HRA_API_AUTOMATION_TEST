package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.PostFeatureEndPoints;
import api.payload_POJO.PostContent;
import io.restassured.response.Response;

public class PostContentTests {

	Faker faker;

	PostContent postContentPayload;

	@BeforeClass
	public void	setUpData()
	{
		//faker.con
		
		faker=new Faker();
		postContentPayload=new PostContent();
		
	

	}
	@Test
	public void testPostUser() {
		Response response=PostFeatureEndPoints.cretePost(postContentPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
		
		
		
		
	}
	
//	public void tes

}
