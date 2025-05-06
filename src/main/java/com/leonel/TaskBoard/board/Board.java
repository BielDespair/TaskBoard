package com.leonel.TaskBoard.board;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity @Table(name = "boards")
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "board_id")
    private Long id;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BoardColumn> board_columns = new ArrayList<>();

}
