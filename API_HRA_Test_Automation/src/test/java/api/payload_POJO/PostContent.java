package api.payload_POJO;

import java.net.URL;

import com.github.javafaker.Faker;

import api.utilities.RandomSentences;
import api.utilities.RandomSentences.Length;

public class PostContent {

	/*String sentence;
	String image;*/

	/*static	RandomSentences random;
static Faker faker;*/

	/*public static void main(String[] args) {

		random=new RandomSentences();
		System.out.println(random.generateRandomSentence(Length.LONG));
		String image=faker.internet().image();

	//	System.out.println();
	}*/

	//	"userId": "671b8d673047d9aa8eca2265",

	/*URL	  video= "https://hra-storage.s3.ap-south-1.amazonaws.com/1725600235045-860b4726-c17d-4d79-8243-3e6cd0f0f749.mp4";
	URL	thumbnail= "https://hra-storage.s3.ap-south-1.amazonaws.com/1725600441162-9520fbda-0524-49b8-bbd7-356204e52d63.webp";*/
	//		"content": null,

	URL images;
	String	 video;
	URL	thumbnail;
	String content;
	
	public URL getImages() {
		return images;
	}
	public void setImages(URL images) {
		this.images = images;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public URL getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(URL thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	/*public void setVideo(String video2) {
		// TODO Auto-generated method stub
		
	}*/

}
