package kh.lclass.db1.board.model.vo;


import lombok.Data;

@Data
public class BoardVo {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriteDate;
	private String mid;
	private int bref;
	private int breLevel;
	private int breStep;
	
}
