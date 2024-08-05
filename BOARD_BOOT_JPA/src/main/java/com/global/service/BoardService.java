package com.global.service;

import java.util.List;

import com.global.dto.BoardDto;

public interface BoardService {

	public void insert(BoardDto board);
	public List<BoardDto> list();
}
