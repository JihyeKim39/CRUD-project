package com.global.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardDto {
	
	private Long seq;
	private String title;
	private String content;
	private Date createdate;

}
