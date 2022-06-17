package com.spring.test01.Vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BoardVo {
	private int bnum;
	private String userid;
	private String title;
	private String content;
	private int count;
	private Date updatedate;
	private Date boarddate;
	

	//가상컬럼
	private String updatedate_String;
	private String boarddate_String;
	
}
