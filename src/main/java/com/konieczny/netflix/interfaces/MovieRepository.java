package com.konieczny.netflix.interfaces;

import com.konieczny.netflix.MovieDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface MovieRepository {

   public Map <String, List<MovieDto>> getMoviesRepoMap(List<String> lines);

}
