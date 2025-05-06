package com.leonel.TaskBoard;

import com.leonel.TaskBoard.config.TaskBoardConfig;
import com.leonel.TaskBoard.ui.MainUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TaskBoardApplication {

    private MainUI mainUI;
    public TaskBoardApplication(MainUI mainUI) {}

    public static void main(String[] args) {
        SpringApplication.run(TaskBoardApplication.class, args);
    }

}