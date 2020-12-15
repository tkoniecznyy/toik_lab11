package com.konieczny.netflix.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements  MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public MovieRepository getMovieRepository() {
        return movieRepository;
    }
}
