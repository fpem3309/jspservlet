package com.myboard.model;

public class BoardVO {
	private String board_no;
	private String board_title;
	private String board_content;
	private String board_date;
	private String board_hit;
	
	public BoardVO(String board_no, String board_title, String board_content, String board_date, String board_hit) {
		super();
		this.board_no = board_no;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_date = board_date;
		this.board_hit = board_hit;
	}
	public BoardVO() {
		super();
	}
	public String getBoard_no() {
		return board_no;
	}
	public void setBoard_no(String board_no) {
		this.board_no = board_no;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	public String getBoard_hit() {
		return board_hit;
	}
	public void setBoard_hit(String board_hit) {
		this.board_hit = board_hit;
	}
	@Override
	public String toString() {
		return "BoardVO [board_no=" + board_no + ", board_title=" + board_title + ", board_content=" + board_content
				+ ", board_date=" + board_date + ", board_hit=" + board_hit + "]";
	}
}

