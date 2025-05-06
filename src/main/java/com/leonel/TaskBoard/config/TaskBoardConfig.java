package com.leonel.TaskBoard.config;


import com.leonel.TaskBoard.board.BoardService;
import com.leonel.TaskBoard.ui.MainUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Scanner;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@Configuration
public class TaskBoardConfig {

    @Bean @Scope(SCOPE_SINGLETON)
    public Scanner scanner() {return new Scanner(System.in);}

}
