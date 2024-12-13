package api.payload;

import org.json.JSONObject;

import api.endpoints.ContentPostEndPoints;
import api.utilities.RandomSentences;
import api.utilities.RandomSentences.Length;

public class CommentOnPostPayload {

	public static String createCommentPayload()
	{
		String sentence=RandomSentences.generateRandomSentence(Length.LONG);
		
		JSONObject payload = new JSONObject();

		payload.put("content", sentence);
		payload.put("postId", ContentPostEndPoints.postId);

		return payload.toString();

	}
	
}
