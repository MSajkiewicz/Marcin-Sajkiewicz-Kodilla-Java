package com.kodilla.good.patterns.challenges;

        import java.util.List;
        import java.util.Map;
        import java.util.stream.*;

public final class MovieStoreGenerator {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String moviesString = movieStore.getMovies().entrySet().stream()
                .flatMap(movie -> movie.getValue().stream())
                .collect(Collectors.joining("!", "***", "***"));

        System.out.println(moviesString);





    }
}
