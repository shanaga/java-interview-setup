package com.real.interview.service;

import com.real.interview.entity.Movie;
import com.real.interview.exception.MovieNotFoundException;
import com.real.interview.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found"));
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        if (!movieRepository.existsById(id)) throw new MovieNotFoundException("Movie not found");
            movieRepository.deleteById(id);
    }

    public void updateMovie(Movie movie) {
        movieRepository.save(movie);
    }



}
