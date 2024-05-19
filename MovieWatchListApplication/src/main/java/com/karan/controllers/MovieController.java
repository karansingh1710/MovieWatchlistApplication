package com.karan.controllers;

import com.karan.dao.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MovieController {
    @GetMapping("/watchListItemForm")
    public String getWatchListForm(Model model){
        System.out.println("Inside getWatchListItemForm");
        model.addAttribute("watchListItem",new Movie());
        return "watchListItemForm";
    }
}
