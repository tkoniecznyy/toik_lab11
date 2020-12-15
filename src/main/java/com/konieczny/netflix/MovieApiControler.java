package com.konieczny.netflix;

import com.konieczny.netflix.interfaces.MovieRepository;
import com.konieczny.netflix.interfaces.MovieRepositoryImpl;
import com.konieczny.netflix.interfaces.MovieService;
import com.konieczny.netflix.interfaces.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MovieApiControler {

    @Autowired
    private MovieServiceImpl movieService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/movies", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Map<String, List<MovieDto>>> getMovies(){
        Map<String, List<MovieDto>> moviesMap = (Map<String, List<MovieDto>>) movieService.getMovieRepository();
        return new ResponseEntity<>(moviesMap, HttpStatus.OK);
    }
}
