package com.teamnexters.dto;

import org.springframework.stereotype.Component;

@Component
public class BoardDTO {

	private int boardNo;
	private String boardName;
	private String boardDir;
	
	public void setBoardNo(int boardNo){
		this.boardNo=boardNo;
	}
	public int getBoardNo(){
		return boardNo;
	}
	public void setBoardName(String boardName){
		this.boardName=boardName;
	}
	public String getBoardName(){
		return boardName;
	}
	public void setBoardDir(String boardDir){
		this.boardDir=boardDir;
	}
	public String getBoardDir(){
		return boardDir;
	}
}
