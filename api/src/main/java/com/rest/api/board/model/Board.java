package com.rest.api.board.model;

public class Board {

	private int seq_board;
	private int seq_member;
	private int seq_group;
	private int seq_category;
	private String member_image_url;
	private String title;
	private String contents;
	private int read_count;
	private String tags;
	private String like_cnt;
	private String image_url;
	
	public int getSeq_board() {
		return seq_board;
	}
	public void setSeq_board(int seq_board) {
		this.seq_board = seq_board;
	}
	public int getSeq_member() {
		return seq_member;
	}
	public void setSeq_member(int seq_member) {
		this.seq_member = seq_member;
	}
	public int getSeq_group() {
		return seq_group;
	}
	public void setSeq_group(int seq_group) {
		this.seq_group = seq_group;
	}
	public int getSeq_category() {
		return seq_category;
	}
	public void setSeq_category(int seq_category) {
		this.seq_category = seq_category;
	}
	public String getMember_image_url() {
		return member_image_url;
	}
	public void setMember_image_url(String member_image_url) {
		this.member_image_url = member_image_url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getRead_count() {
		return read_count;
	}
	public void setRead_count(int read_count) {
		this.read_count = read_count;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getLike_cnt() {
		return like_cnt;
	}
	public void setLike_cnt(String like_cnt) {
		this.like_cnt = like_cnt;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	
	@Override
	public String toString() {
		return "Board [seq_board=" + seq_board + ", seq_member=" + seq_member + ", seq_group=" + seq_group
				+ ", seq_category=" + seq_category + ", member_image_url=" + member_image_url + ", title=" + title
				+ ", contents=" + contents + ", read_count=" + read_count + ", tags=" + tags + ", like_cnt=" + like_cnt
				+ ", image_url=" + image_url + "]";
	}

}
