package com.real.interview.service;

import com.real.interview.entity.Movie;
import com.real.interview.repository.MovieRepository;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MovieServiceTest {

    @InjectMocks
    MovieService movieService;

    @MockitoBean
    MovieRepository movieRepository;

    @Test
    void getAllMovies() {
        List<Movie> movies = List.of(new Movie(1L, "PacMan", "2024"));
        Mockito.when(movieRepository.findAll()).thenReturn(movies);
    }

    @Test
    void getMovieById() {
    }

    @Test
    void createMovie() {
    }

    @Test
    void deleteMovie() {
    }
}