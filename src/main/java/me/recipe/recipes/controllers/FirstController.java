package me.recipe.recipes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
    @GetMapping
    public String homework (){
        return "Приложение запущено";
    }
    @GetMapping("/info")
    public String homeworkTask (){
        return "Имя студента: Пётр Иванов;<br> " +
                "Название проекта: курсы; <br>" +
                "Дата созадания проекта: 11.12.2022;<br>  " +
                "Описание проекта: изучение новых направлений в науке и технике.";
    }
}

