package api.payload;

import org.json.JSONObject;

import api.utilities.RandomSentences;
import api.utilities.RandomSentences.Length;

public class ContentPostPayload {

	//RandomSentences sentences;

	public static String createContentPayload() {

		String sentence=RandomSentences.generateRandomSentence(Length.MEDIUM);

		JSONObject payload = new JSONObject();

		/*   payload.put("images", new String[]{
            "https://hra-storage.s3.ap-south-1.amazonaws.com/1729854010483-0847cfeb-bc5b-40c8-a0dc-973023ae88f2.webp"
        });*/
       
		payload.put("video", "https://hra-storage.s3.ap-south-1.amazonaws.com/1725600235045-860b4726-c17d-4d79-8243-3e6cd0f0f749.mp4");
	//	payload.put("thumbnail", "https://hra-storage.s3.ap-south-1.amazonaws.com/1725600441162-9520fbda-0524-49b8-bbd7-356204e52d63.webp");
		// payload.put("content", "Dal is a freshwater lake in Srinagar, the summer capital of Jammu and Kashmir in Indian-administered Kashmir. It is an urban lake, the second largest lake in Jammu and Kashmir, and the most visited place in Srinagar by tourists and locals.");
		payload.put("content", sentence);
	//	payload.put("tag", "Sell");

		return payload.toString();
	} 
}
