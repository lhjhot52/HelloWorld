package homework;

import java.util.Objects;

public class Board {
// 게시글번호,제목,내용,작성자,작성일시
	private int boardNo;
	private String title;
	private String content;
	private String writer;
    private String day;

    
    public Board(int boardNo,String title,String content, String writer,String day) {
    	super();
    	this.boardNo = boardNo;
    	this.title = title;
    	this.content = content;
    	this.writer = writer;
    	this.day = day;
    	
    }
    public Board(String title,String content, String writer) {
    	super();
    	
    	this.title = title;
    	this.content = content;
    	this.writer = writer;
    }
    

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	

   


}


