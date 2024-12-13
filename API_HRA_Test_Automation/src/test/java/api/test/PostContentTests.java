package api.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.endpoints.PostContentEndPoints;
import api.payload_POJO.PostContent;
import api.payload_POJO.PostContent1;
import api.utilities.RandomSentences;
import api.utilities.RandomSentences.Length;
import io.restassured.response.Response;

public class PostContentTests {

	PostContent content;
	
	PostContent1 mediaContent;
	
	String id;
	
	public Logger logger;
	
	RandomSentences randomSentences;
	
	JSONObject requestBody;
	
	//Created for getting URL's from properties method
		static	ResourceBundle getSource(){

			ResourceBundle routes=ResourceBundle.getBundle("postcontentsource.properties");// Load properties file
			return routes;
		}
	
	@BeforeClass
	public void payloadData(){
		
		randomSentences=new RandomSentences();
		content=new PostContent();
		requestBody = new JSONObject();
		mediaContent=new PostContent1();
		
		
	//	String video="https://hra-storage.s3.ap-south-1.amazonaws.com/1725600235045-860b4726-c17d-4d79-8243-3e6cd0f0f749.mp4";

		
	//	content.setContent(randomSentences.generateRandomSentence(Length.LONG));
		
//	content.setVideo(video);
			//	content.setContent(getSource().getString("content"));
		/*URL url=null;
		try {
			url = new URL(getSource().getString("images"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		content.setImages(url);*/
	
	// Add the "images" array
  /*  requestBody.put("images", new String[] {
        "https://hra-storage.s3.ap-south-1.amazonaws.com/1729854010483-0847cfeb-bc5b-40c8-a0dc-973023ae88f2.webp"
    });*/
    
    // Add video, thumbnail, content, and tag fields
   // requestBody.put("video", "https://hra-storage.s3.ap-south-1.amazonaws.com/1725600235045-860b4726-c17d-4d79-8243-3e6cd0f0f749.mp4");
 //   requestBody.put("thumbnail", "https://hra-storage.s3.ap-south-1.amazonaws.com/1725600441162-9520fbda-0524-49b8-bbd7-356204e52d63.webp");
 //  requestBody.put("content","Dal is a freshwater lake in Srinagar, the summer capital of Jammu and Kashmir in Indian-administered Kashmir. It is an urban lake, the second largest lake in Jammu and Kashmir, and the most visited place in Srinagar by tourists and locals.");
  //  requestBody.put("tag", "Buy");
		
	mediaContent.setImages(Arrays.asList("https://hra-storage.s3.ap-south-1.amazonaws.com/1729854010483-0847cfeb-bc5b-40c8-a0dc-973023ae88f2.webp"));
   //     mediaContent.setVideo("https://hra-storage.s3.ap-south-1.amazonaws.com/1725600235045-860b4726-c17d-4d79-8243-3e6cd0f0f749.mp4");
   //     mediaContent.setThumbnail("https://hra-storage.s3.ap-south-1.amazonaws.com/1725600441162-9520fbda-0524-49b8-bbd7-356204e52d63.webp");
        mediaContent.setContent("Dal is a freshwater lake in Srinagar, the summer capital of Jammu and Kashmir in Indian-administered Kashmir. It is an urban lake, the second largest lake in Jammu and Kashmir, and the most visited place in Srinagar by tourists and locals.");
     //   mediaContent.setTag("Buy");

		
	}
	
	@Test
	public void testPostContent()
	{
		Response response=PostContentEndPoints.cretePost(mediaContent);
		response.then().log().all();
		id=response.path("post._id");
		System.out.println(id);
		
		Assert.assertEquals(response.getStatusCode(), 400);
	}
}
