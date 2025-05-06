package com.leonel.TaskBoard.board;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity @Table(name = "blocks")
public class Block {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "block_id")
    public Long id;

    @Column(name = "block_reason")
    public String blockReason;

    @Column(name = "unblock_reason")
    public String unblockReason;

    @Column(name = "blocked_at")
    public OffsetDateTime blockedAt;

    @Column(name = "unblocked_at")
    public OffsetDateTime unblockedAt;

    @OneToOne @JoinColumn(name = "card_id", nullable = false)
    private Card card;
}
