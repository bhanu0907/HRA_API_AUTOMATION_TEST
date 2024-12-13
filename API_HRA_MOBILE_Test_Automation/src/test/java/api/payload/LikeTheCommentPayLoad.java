package api.payload;

import org.json.JSONObject;

import api.endpoints.CommentOnPostEndpoints;

public class LikeTheCommentPayLoad {

	public  String createLikePayload() {
	
	JSONObject payload=new JSONObject();
	
	payload.put("likeableId", CommentOnPostEndpoints.commentId);
	payload.put("likeableType", "Comment");
	payload.put("isLiked",false);
	
	return payload.toString();
}
	
}
