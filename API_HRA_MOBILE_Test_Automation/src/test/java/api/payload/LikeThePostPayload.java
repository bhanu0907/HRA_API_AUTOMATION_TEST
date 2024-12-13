package api.payload;

import org.json.JSONObject;

import api.endpoints.ContentPostEndPoints;

public class LikeThePostPayload {

	public String createLikePayload() {
	
	JSONObject payload=new JSONObject();
	
	payload.put("likeableId", ContentPostEndPoints.postId);
	payload.put("likeableType", "Post");
	payload.put("isLiked",false);
	

	return payload.toString();
}
	
	
}