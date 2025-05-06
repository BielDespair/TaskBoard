CREATE TABLE boards (
    board_id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255)
);



CREATE TABLE boards_columns (
    board_column_id BIGSERIAL PRIMARY KEY,
    board_id BIGINT NOT NULL,
    name VARCHAR(255),
    position_order INT,
    kind VARCHAR(7),
    CONSTRAINT boards__boards_columns_fk FOREIGN KEY (board_id) REFERENCES boards(board_id) ON DELETE CASCADE,
    CONSTRAINT unique_board_id_order UNIQUE (board_id, position_order)
);

CREATE TABLE cards(
    card_id BIGSERIAL PRIMARY KEY,
    board_column_id BIGINT NOT NULL,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    CONSTRAINT boards_columns__cards_fk FOREIGN KEY (board_column_id) REFERENCES boards_columns(board_column_id) ON DELETE CASCADE
);


CREATE TABLE blocks(
    block_id BIGSERIAL PRIMARY KEY,
    card_id BIGINT NOT NULL,
    block_reason VARCHAR(255) NOT NULL,
    unblock_reason VARCHAR(255) NOT NULL,
    blocked_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    unblocked_at TIMESTAMP,
    CONSTRAINT cards__blocks_fk FOREIGN KEY (card_id) REFERENCES cards(card_id) ON DELETE CASCADE
);