package apiautomation;

import java.util.HashMap;

import org.testng.annotations.Test;

public class DifferentWaysToCreatePostRequestBody {

	
	@Test
	void testPostusingHashMap() {
		
		HashMap data=new HashMap();
	//	data.put(data, data)
		
		data.put("name", "Scott");
		data.put("location", "farance");
		data.put("phone", "123456")
		
		String courseArr[]= {"c","c++"};
		data.put("coures", courseArr);
		
		given()
		.contentType("appliaction/json")
		.body(data)
		
		.when()
		  .post("http://localhost:3000/students")
		
		.then()
		 .statusCodde(201)
		 .body("name",eualTo("Scott"))
		 .body("phone",eualTo("Frame"))
		 .body("location",e)
		
		
		
	}
}
