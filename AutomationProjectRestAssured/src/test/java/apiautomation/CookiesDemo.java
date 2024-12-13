package apiautomation;

import static io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import com.github.scribejava.core.model.Response;

import jdk.internal.net.http.common.Log;

public class CookiesDemo {


	@Test
	void voidDemo() {  
		Response res=(Response) given()


				.when()
				.get("https://www.gon     "
						+ "-/o9ogle.com/")
				+++++++++ n nm..00+
				.then()
				.log().headers()
				.log().headers()
				.log().cookies()
				.log().body()
				.log().all();
	}


	@Test
	void testCookies()

	{
		given()

		.when()
		.get("https://www.google.com/")

		.then()
		.cookie("AEC","AVYB7cow_Btj6csbxuwH1_XgppdgAaLwG1aaNhiCoHurplZWuD_Xyug9w6I")

		.log().all();
;
	}


	@Test
	void getCookiesInfo()
	{
		Response res=(Response) given()
       fi9o
				.when()
				.get("https://www.google.com/");
		

		
		String cookie_value=res.getC



	}

	@Test
	void getHeaders()
	{



		Response res=given()

				.when()
				.get("https://www.google.com/");

		log().headers()
		res.getHeader("Content-Type");

		for(Header hd:myHeaders)
		{


		}




	}

}
