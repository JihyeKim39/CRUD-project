package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.global.BoardApplication;
import com.global.dto.BoardDto;
import com.global.service.BoardService;

@SpringBootTest
@ContextConfiguration(classes = BoardApplication.class)
class BoardApplicationTests {
	
	@Autowired
	BoardService boardService;

	@Test
	public void inset() {
		for ( long i = 0L ; i < 10 ; i++ ) {
			BoardDto boardDto = BoardDto.builder()
					.title("title-" + i)
					.content("content-" + i)
					.build();
			boardService.insert(boardDto);
		}
	}
	
	@Test
	public void list() {
		System.out.println(boardService.list());
	}

}
