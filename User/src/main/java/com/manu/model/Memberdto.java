package com.manu.model;

public class Memberdto {
	
	//id
	private String id;
	
	//이름
	private String memberName;
	
	//비밀번호
	private String memberPassword;
	
	//관리자구분
	private int adminCK;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName=memberName;
	}
	
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword=memberPassword;
	}
	
	public int getAdminCK() {
		return adminCK;
	}
	
	public void setAdminCK(int adminCK) {
		this.adminCK=adminCK;
	}
	
	@Override
	public String toString() {
		return "Memberdto [id=" + id + ", memberName=" + memberName + ", memberPassword=" + memberPassword
				+ ", adminCK=" + adminCK + "]";
	}

}
