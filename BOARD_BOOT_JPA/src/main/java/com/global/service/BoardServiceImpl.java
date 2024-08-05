package com.global.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.global.dto.BoardDto;
import com.global.entity.Board;
import com.global.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardRepository boardRepository;

	@Override
	@Transactional
	public void insert(BoardDto boardDto) {
		Board board = Board.builder()
				.title(boardDto.getTitle())
				.content(boardDto.getContent())
				.build();
		boardRepository.save(board);
	}
	
	public List<BoardDto> list() {
		return boardRepository.findAll().stream()
				.map(board -> BoardDto.builder()
						.seq(board.getSeq())
						.title(board.getTitle())
						.content(board.getContent())
						.createdate(board.getCreatedate())
						.build())
				.collect(Collectors.toList());
	}

}
