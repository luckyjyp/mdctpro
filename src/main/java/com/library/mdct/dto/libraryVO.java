package com.library.mdct.dto;

public class libraryVO {
	private String lib_no;
	private String lib_name;
	private String lib_addr;
	private String lib_tel;
	public String getLib_no() {
		return lib_no;
	}
	public String getLib_name() {
		return lib_name;
	}
	public String getLib_addr() {
		return lib_addr;
	}
	public String getLib_tel() {
		return lib_tel;
	}
	public void setLib_no(String lib_no) {
		this.lib_no = lib_no;
	}
	public void setLib_name(String lib_name) {
		this.lib_name = lib_name;
	}
	public void setLib_addr(String lib_addr) {
		this.lib_addr = lib_addr;
	}
	public void setLib_tel(String lib_tel) {
		this.lib_tel = lib_tel;
	}
	
	@Override
	public String toString() {
		return "libraryVO [lib_no=" + lib_no + ", lib_name=" + lib_name + ", lib_addr=" + lib_addr + ", lib_tel="
				+ lib_tel + "]";
	}
}
