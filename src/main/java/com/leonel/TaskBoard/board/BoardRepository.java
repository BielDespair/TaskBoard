package com.leonel.TaskBoard.board;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository @Table(name = "boards")
public interface BoardRepository extends JpaRepository<Board, Long> {
}
