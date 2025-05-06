package com.leonel.TaskBoard.ui;


import com.leonel.TaskBoard.board.BoardService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MainUI {

    private final BoardService boardService;
    private final Scanner scanner;


    public MainUI(BoardService boardService, Scanner scanner) {
        this.boardService = boardService;
        this.scanner = scanner;
    }


    @PostConstruct
    public void start() {
        System.out.println("MainUI started");
        showMainMenu();
    }

    public void showMainMenu() {
        System.out.println("=====TaskBoard Main Menu=====");
        System.out.println("1. Criar novo Board");
        System.out.println("2. Selecionar Board");
        System.out.println("3. Excluir Board");
        System.out.println("0. Sair");

        System.out.println(boardService.findAll());
    }

    public void showCreateBoardMenu() {
        System.out.println("=====TaskBoard CreateBoardMenu=====");
    }
}
