package com.example.movieclub.web;

import com.example.movieclub.domain.movie.MovieRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;
import com.example.movieclub.domain.movie.MovieService;
import com.example.movieclub.domain.movie.dto.MovieDto;
import com.example.movieclub.domain.rating.RatingService;

import java.util.List;

@Controller
public class MovieController {
    private final MovieService movieService;
    private final RatingService ratingService;

    public MovieController(MovieService movieService, RatingService ratingService) {
        this.movieService = movieService;
        this.ratingService = ratingService;
    }

    @GetMapping("/film/{id}")
    public String getMovie(@PathVariable long id,
                           Model model,
                           Authentication authentication) {
        MovieDto movie = movieService.findMovieById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        model.addAttribute("movie", movie);
        //Jeżeli użytkownik jest zalogowany
        if (authentication != null) {
            String currentUserEmail = authentication.getName();
            //to wyszukujemy jego głos
            Integer rating = ratingService.getUserRatingForMovie(currentUserEmail, id).orElse(0);
            //i zapisujemy go w modelu
            model.addAttribute("userRating", rating);
        }
        return "movie";
    }
    @GetMapping("/top10")
    public String findTop10(Model model) {
        List<MovieDto> top10Movies = movieService.findTopMovies(10);
        model.addAttribute("heading", "Filmowe TOP 10");
        model.addAttribute("description", "Filmy najlepiej oceniane przez uczestników");
        model.addAttribute("movies", top10Movies);
        return "movie-listing";
    }
}