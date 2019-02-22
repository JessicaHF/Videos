package Videos;

import java.util.*;

public class Video {

	List<Tags> tagList = new ArrayList<>();

	private String url;
	private String title;
//CONSTRUCTORES	

	public Video(String title) {
		this.title = title;
	}

	public Video(String url, String title, List<Tags> tagList) throws Exception {
		if (url == null)
			throw new Exception();
		if (title == null)
			throw new Exception();
		if (tagList == null)
			throw new Exception();

		this.url = url;
		this.title = title;
		this.tagList = tagList;

	}

//METODOS DE LA CLASE VIDEO
	public void addTags(Tags tags) {		
		tagList.add(tags);
	}

	// setters

	public void setUrl(String url) {
		this.url = url;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// getters

	public String getUrl() {
		return this.url;
	}

	public String getTitle() {
		return this.title;
	}

	public List<Tags> getTagList() {
		return this.tagList;
	}

}