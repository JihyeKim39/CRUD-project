package com.global.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.dto.BoardDto;
import com.global.service.BoardService;

@RestController
@RequestMapping("/api/v1/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/list")
	public List<BoardDto> list() {
		return boardService.list();
	}

}
