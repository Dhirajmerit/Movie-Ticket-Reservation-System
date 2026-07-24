package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import convertor.MovieConvertor;
import entities.Movie;
import exceptions.MovieAlreadyExist;
import exceptions.MovieDoesNotExists;
import repositories.MovieRepository;
import request.MovieRequest;
import response.MovieResponse;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public String addMovie(MovieRequest movieRequest) {
        Movie movieByName = movieRepository.findByMovieName(movieRequest.getMovieName());

        if (movieByName != null && movieByName.getLanguage().equals(movieRequest.getLanguage())) {
            throw new MovieAlreadyExist();
        }

        Movie movie = MovieConvertor.movieDtoToMovie(movieRequest);

        movieRepository.save(movie);
        return "The movie has been added successfully";
    }

    public List<MovieResponse> getAllMovies() {
        return movieRepository.findAll().stream()
                .map(movie -> new MovieResponse(movie.getId(), movie.getMovieName(), movie.getDuration(),
                        movie.getRating(), movie.getReleaseDate(), movie.getGenre(), movie.getLanguage()))
                .toList();
    }

    public String updateMovie(Integer movieId, MovieRequest movieRequest) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(MovieDoesNotExists::new);
        movie.setMovieName(movieRequest.getMovieName());
        movie.setDuration(movieRequest.getDuration());
        movie.setRating(movieRequest.getRating());
        movie.setReleaseDate(movieRequest.getReleaseDate());
        movie.setGenre(movieRequest.getGenre());
        movie.setLanguage(movieRequest.getLanguage());
        movieRepository.save(movie);
        return "The movie has been updated successfully";
    }

}
