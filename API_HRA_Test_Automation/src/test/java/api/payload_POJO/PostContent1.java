package api.payload_POJO;

import java.util.List;

public class PostContent1 {
    private List<String> images;
    private String video;
    private String thumbnail;
    private String content;
    public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTag() {
		return tag;
	}

//	public void setTag(String tag2) {
	public void setTag(String tag) {
		this.tag = tag;
	}

	private String tag;

    // Getters and Setters
  /*  public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }*/

    @Override
    public String toString() {
        return "MediaContent{" +
                "images=" + images +
                ", video='" + video + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", content='" + content + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }

 
	
}

