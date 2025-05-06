package com.leonel.TaskBoard.board;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity @Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "card_id")
    public Long id;
    public String title;
    public String description;

    @ManyToOne @JoinColumn(name = "board_column_id", nullable = false)
    private BoardColumn boardColumn;

    @OneToOne(mappedBy = "card", cascade = CascadeType.ALL, orphanRemoval = true)
    private Block block;
}
