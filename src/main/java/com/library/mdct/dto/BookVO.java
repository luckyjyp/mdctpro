package com.library.mdct.dto;

public class BookVO {
	private String book_no;
	private String book_name;
	private String writer;
	private String genre;
	private String price;
	private String pub_no;
	
	
	public String getPub_no() {
		return pub_no;
	}
	public void setPub_no(String pub_no) {
		this.pub_no = pub_no;
	}
	public String getBook_no() {
		return book_no;
	}
	public String getBook_name() {
		return book_name;
	}
	public String getWriter() {
		return writer;
	}
	public String getGenre() {
		return genre;
	}
	public String getPrice() {
		return price;
	}
	public void setBook_no(String book_no) {
		this.book_no = book_no;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookVO [book_no=" + book_no + ", book_name=" + book_name + ", writer=" + writer + ", genre=" + genre
				+ ", price=" + price + ", pub_no=" + pub_no + "]";
	}
	
	
	
}
