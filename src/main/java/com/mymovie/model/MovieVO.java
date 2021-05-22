package com.mymovie.model;

public class MovieVO {
	private String title;
	private String content;
	private String opening_date;
	
	public MovieVO() {
		super();
	}
	public MovieVO(String title, String content, String opening_date) {
		super();
		this.title = title;
		this.content = content;
		this.opening_date = opening_date;
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
	public String getOpening_date() {
		return opening_date;
	}
	public void setOpening_data(String opening_date) {
		this.opening_date = opening_date;
	}
	
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", content=" + content + ", opening_date=" + opening_date + "]";
	}
	
	
}

