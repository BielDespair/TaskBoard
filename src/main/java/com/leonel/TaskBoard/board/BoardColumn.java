package com.leonel.TaskBoard.board;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity @Table(name = "boards_columns")
public class BoardColumn {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "board_column_id")
    private Long id;
    private String name;

    @Column(name = "position_order")
    private Integer positionOrder;
    private String kind;

    @ManyToOne @JoinColumn(name = "board_id", nullable = false)
    private Board board;


    @OneToMany(mappedBy = "boardColumn", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Card> board_columns = new ArrayList<>();
}
