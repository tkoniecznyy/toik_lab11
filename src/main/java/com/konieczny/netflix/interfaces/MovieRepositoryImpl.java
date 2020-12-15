package com.konieczny.netflix.interfaces;

import com.konieczny.netflix.MovieDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

    MovieDto movie1 = new MovieDto(1,"Piraci z krzemowej doliny",1999,"https://fwcdn.pl/fpo/30/02/33002/6988507.6.jpg");
    MovieDto movie2 = new MovieDto(2,"Ja, robot",2004,"https://fwcdn.pl/fpo/54/92/95492/7521206.6.jpg");
    MovieDto movie3 = new MovieDto(3,"Kod nieśmiertelności",2011,"https://fwcdn.pl/fpo/89/67/418967/7370853.6.jpg");
    MovieDto movie4 = new MovieDto(4,"Ex Machina",2015,"https://fwcdn.pl/fpo/64/19/686419/7688121.6.jpg");

    public MovieDto getMovie1() {
        return movie1;
    }

    public MovieDto getMovie2() {
        return movie2;
    }

    public MovieDto getMovie3() {
        return movie3;
    }

    public MovieDto getMovie4() {
        return movie4;
    }

    @Override
    public Map<String, List<MovieDto>> getMoviesRepoMap(List<String> lines) {
        List<MovieDto> movies = new ArrayList<>();
        movies.add(getMovie1());
        movies.add(getMovie2());
        movies.add(getMovie3());
        movies.add(getMovie4());

        Map <String, List<MovieDto>> mapMovies = new HashMap<>();
        mapMovies.put("movies",movies);

        return mapMovies;
    }
}
