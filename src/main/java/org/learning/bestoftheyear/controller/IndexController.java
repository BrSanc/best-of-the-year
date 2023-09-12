package org.learning.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {

    @GetMapping("/")
    public String home(Model model){
        String nameUser = "Brad Sanchez";
        model.addAttribute("name",nameUser);
     return "home";
    }

    @GetMapping("/movies")
    public String movies(Model model){
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model){
        return "songs";
    }
}
