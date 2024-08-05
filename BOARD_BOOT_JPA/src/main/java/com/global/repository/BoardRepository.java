package com.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.global.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{
}
