package com.library.mdct.dto;

public class BorrowerVO {
	private String bor_no;
	private String bor_name;
	private String bor_tel;
	private String bor_addr;
	public String getBor_no() {
		return bor_no;
	}
	public String getBor_name() {
		return bor_name;
	}
	public String getBor_tel() {
		return bor_tel;
	}
	public String getBor_addr() {
		return bor_addr;
	}
	public void setBor_no(String bor_no) {
		this.bor_no = bor_no;
	}
	public void setBor_name(String bor_name) {
		this.bor_name = bor_name;
	}
	public void setBor_tel(String bor_tel) {
		this.bor_tel = bor_tel;
	}
	public void setBor_addr(String bor_addr) {
		this.bor_addr = bor_addr;
	}
	@Override
	public String toString() {
		return "borrowerVO [bor_no=" + bor_no + ", bor_name=" + bor_name + ", bor_tel=" + bor_tel + ", bor_addr="
				+ bor_addr + "]";
	}
	
	
}
