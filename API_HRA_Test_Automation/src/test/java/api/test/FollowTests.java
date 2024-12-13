package api.test;

import org.testng.annotations.Test;

import api.endpoints.FollowEndPoints;
import api.payload_POJO.Follow;
import io.restassured.response.Response;

public class FollowTests {

	Follow follow;
	
	@Test
	public void testGetFollow()
	{
		Response response=FollowEndPoints.readFollowing("toggle-follow/671e87ee47aab4c6c2bfeec8");
		
	}
	
}
