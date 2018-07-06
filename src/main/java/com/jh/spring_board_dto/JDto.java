package com.jh.spring_board_dto;

import java.sql.Timestamp;

public class JDto {
	// about 게시판 글
	int jId,jHit,jGroup,jStep,jIndent; 
	String jName, jTitle, jContent;
	Timestamp jDate;
	
	public JDto() {
		// TODO Auto-generated constructor stub
	}
	
	public JDto(int jId, int jHit, int jGroup, int jStep, int jIndent, String jName, String jTitle,String jContent, Timestamp jDate) {
		super();
		this.jId = jId;
		this.jHit = jHit;
		this.jGroup = jGroup;
		this.jStep = jStep;
		this.jIndent = jIndent;
		this.jName = jName;
		this.jTitle = jTitle;
		this.jContent = jContent;
		this.jDate = jDate;
	}
	public int getjId() {
		return jId;
	}
	public void setjId(int jId) {
		this.jId = jId;
	}
	public int getjHit() {
		return jHit;
	}
	public void setjHit(int jHit) {
		this.jHit = jHit;
	}
	public int getjGroup() {
		return jGroup;
	}
	public void setjGroup(int jGroup) {
		this.jGroup = jGroup;
	}
	public int getjStep() {
		return jStep;
	}
	public void setjStep(int jStep) {
		this.jStep = jStep;
	}
	public int getjIndent() {
		return jIndent;
	}
	public void setjIndent(int jIndent) {
		this.jIndent = jIndent;
	}
	public String getjName() {
		return jName;
	}
	public void setjName(String jName) {
		this.jName = jName;
	}
	public String getjTitle() {
		return jTitle;
	}
	public void setjTitle(String jTitle) {
		this.jTitle = jTitle;
	}
	
	public String getjContent() {
		return jContent;
	}
	public void setjContent(String jContent) {
		this.jContent = jContent;
	}
	
	public Timestamp getjDate() {
		return jDate;
	}
	
	public void setjDate(Timestamp jDate) {
		this.jDate = jDate;
	}
}
