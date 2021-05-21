package com.mymovie.model;

public class MovieVO {
	private String title;
	private String content;
	private String opening_data;
	
	public MovieVO() {
		super();
	}
	public MovieVO(String title, String content, String opening_data) {
		super();
		this.title = title;
		this.content = content;
		this.opening_data = opening_data;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getOpening_data() {
		return opening_data;
	}
	public void setOpening_data(String opening_data) {
		this.opening_data = opening_data;
	}
	
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", content=" + content + ", opening_data=" + opening_data + "]";
	}
	
	
}

