package com.library.mdct.dto;

public class PublisherVO {
	private String pub_no;
	private String pub_name;
	private String pub_addr;
	private String pub_tel;
	
	
	public String getPub_no() {
		return pub_no;
	}


	public String getPub_name() {
		return pub_name;
	}


	public String getPub_addr() {
		return pub_addr;
	}


	public String getPub_tel() {
		return pub_tel;
	}


	public void setPub_no(String pub_no) {
		this.pub_no = pub_no;
	}


	public void setPub_name(String pub_name) {
		this.pub_name = pub_name;
	}


	public void setPub_addr(String pub_addr) {
		this.pub_addr = pub_addr;
	}


	public void setPub_tel(String pub_tel) {
		this.pub_tel = pub_tel;
	}


	@Override
	public String toString() {
		return "publisherVO [pub_no=" + pub_no + ", pub_name=" + pub_name + ", pub_addr=" + pub_addr + ", pub_tel="
				+ pub_tel + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
