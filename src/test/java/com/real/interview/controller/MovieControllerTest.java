package com.real.interview.controller;

import com.real.interview.entity.Movie;
import com.real.interview.service.MovieService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

//@WebMvcTest(MovieController.class)
//class MovieControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Mock
//    private MovieService movieService;
//
//    @Test
//    public void testGetAllMovies() throws Exception {
//        List<Movie> movies = List.of(new Movie(1L, "PacMan", "2024"));
//        Mockito.when(movieService.getAllMovies()).thenReturn(movies);
//    }
//}