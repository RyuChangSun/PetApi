package com.rest.api.member.model;

public class Member {

	private int seq_member;
	private String email;
	private String member_name;
	private String password;
	
	public int getSeq_member() {
		return seq_member;
	}
	public void setSeq_member(int seq_member) {
		this.seq_member = seq_member;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
