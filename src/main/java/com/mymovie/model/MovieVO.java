package com.mymovie.model;

public class MovieVO {
	private String title;
	private String content;
	private String opening_date;
	private String movie_no;
	
	public String getMovie_no() {
		return movie_no;
	}
	public void setMovie_no(String movie_no) {
		this.movie_no = movie_no;
	}
	public void setOpening_date(String opening_date) {
		this.opening_date = opening_date;
	}
	public MovieVO() {
		super();
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
	public MovieVO(String title, String content, String opening_date, String movie_no) {
		super();
		this.title = title;
		this.content = content;
		this.opening_date = opening_date;
		this.movie_no = movie_no;
	}
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", content=" + content + ", opening_date=" + opening_date + ", movie_no="
				+ movie_no + "]";
	}
	
	
	
}

