package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.model.Movies;
import org.learning.bestoftheyear.model.Songs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

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
        ArrayList<Movies> bestMovies = getBestMovies();
        model.addAttribute("bestMovies",bestMovies);
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model){
        ArrayList<Songs> bestSongs = getBestSongs();
        model.addAttribute("bestSongs",bestSongs);
        return "songs";
    }

    private ArrayList<Movies> getBestMovies(){
        ArrayList<Movies> bestMovies = new ArrayList<>();
        bestMovies.add(new Movies(1,"Film1"));
        bestMovies.add(new Movies(2,"Film2"));
        bestMovies.add(new Movies(3,"Film3"));
        bestMovies.add(new Movies(4,"Film4"));
        return bestMovies;
    }
    private ArrayList<Songs> getBestSongs(){
        ArrayList<Songs> bestSongs = new ArrayList<>();
        bestSongs.add(new Songs(1,"Song1"));
        bestSongs.add(new Songs(2,"Song2"));
        bestSongs.add(new Songs(3,"Song3"));
        bestSongs.add(new Songs(4,"Song4"));
        return bestSongs;
    }
}
