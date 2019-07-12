package com.advyteam.microservices.movieinfoservice.ressources;

import com.advyteam.microservices.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/movies")
public class movieinfoRessource {



        @GetMapping("/{movieId}")
        public Movie getMovieInfo (@PathVariable("movieId") String movieId){

            return new Movie( movieId,"Transformers");
        }


}
