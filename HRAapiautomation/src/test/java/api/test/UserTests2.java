package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.endpoints.UserEndPoints2;
import api.payload_POJO.User;
import io.restassured.response.Response;

public class UserTests2 {


	Faker faker;

	User userPayload;
	
	public Logger logger;

	@BeforeClass

	void setUpData()
	{
		faker=new Faker();
		userPayload=new User();
		logger=LogManager.getLogger(this.getClass());

        //Creating the Radom 
		//Creating the Random Fake data for request payload to create the user
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUserName(faker.name().username());
		//userPayload.setUserName("Bhanu");
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassWord(faker.internet().password(8, 20));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
		
		

	}
	//Passing above generated data to post request
	@Test(priority = 1)
	public void tsetPostUser()
	{
		logger.info("**** Creating User ****");
		
		Response  response=	UserEndPoints2.creteUser(userPayload);
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(),200);
		System.out.println(userPayload.getUserName()+"    post");
		
		logger.info("**** User is Created ****");
		/*	response.statusLine();
	response.cookies();*/
		
		//WE can add more validation
	}

	@Test(priority = 2)
	public void testGetUserByName()
	{
		logger.info("****Reading User Info****");
		//userPayload=new User();
		System.out.println(userPayload.getUserName() +"Get1");		
		Response response=UserEndPoints2.readUser(this.userPayload.getUserName());
		//Response response=UserEndPoints.readUser("Bhanu");
	System.out.println(userPayload.getUserName());
		response.then().log().all();
		System.out.println(userPayload.getUserName());
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("**** User Info is displayed ****");
	}

	//Updating data by using payload
	@Test(priority = 3)
	public void testUpdateUserByName()
	{
		logger.info("**** Updating User ****");
		
		//these user detiles are regenrated
		userPayload.setFirstName("bhanu reddy");
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());

		Response response=UserEndPoints2.updateUser(this.userPayload.getUserName(),userPayload);
		response.then().log().body();
		response.then().log().status();
		response.then().log().cookies();
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
		
		logger.info("**** User is updated ****");


		//Checking data after update
	/*	Response responseAfterupdate=UserEndPoints2.readUser(this.userPayload.getUserName());
		Assert.assertEquals(responseAfterupdate.getStatusCode(), 200);*/


		//Can also add extra validation
	}

	@Test(priority = 4)
	public void testDeleteUserByName()
	{
		logger.info("**** Deleting  User ****");
		Response response=UserEndPoints2.deleteUser(this.userPayload.getUserName());
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("**** User is deleted ****");
	}


}

