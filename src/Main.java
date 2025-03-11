import br.com.gja.megamovies.Movies;
import br.com.gja.megamovies.Series;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Movies> movieList = new ArrayList<>();
        List<Series> seriesList = new ArrayList<>();

        Movies myMovie = new Movies();
        myMovie.setName("The Godfather");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.setDirector("Francis Ford Coppola");
        movieList.add(myMovie);

        Movies anotherMovie = new Movies();
        anotherMovie.setName("I Am Still Here");
        anotherMovie.setReleaseYear(2025);
        anotherMovie.setDurationInMinutes(100);
        anotherMovie.setDirector("Walter Salles");
        anotherMovie.rate(9);
        anotherMovie.rate(7);
        movieList.add(anotherMovie);

        Series mySeries = new Series();
        mySeries.setName("Lost");
        mySeries.setReleaseYear(2000);
        mySeries.setSeasons(10);
        mySeries.setEpisodesPerSeason(10);
        mySeries.setMinutesPerEpisode(50);
        mySeries.rate(8);
        mySeries.rate(7);
        mySeries.rate(9);
        seriesList.add(mySeries);

        Series anotherSeries = new Series();
        anotherSeries.setName("Suits");
        anotherSeries.setReleaseYear(2011);
        anotherSeries.setSeasons(9);
        anotherSeries.setEpisodesPerSeason(16);
        anotherSeries.setMinutesPerEpisode(59);
        anotherSeries.rate(10);
        anotherSeries.rate(7);
        anotherSeries.rate(7);
        seriesList.add(anotherSeries);

        boolean continueSearch = true;
        while (continueSearch) {
            System.out.println("""
                        ************************************
                        Welcome to MegaMovies!
                        ************************************
                        """);
            System.out.println("Enter the name of the movie or series you want to search for: ");
            String searchedName = scanner.nextLine();

            boolean found = false;
            // Search for movies
            for (Movies movie : movieList) {
                if (movie.getName().equalsIgnoreCase(searchedName)) {
                    System.out.println("Name: " + movie.getName());
                    System.out.println("Release Year: " + movie.getReleaseYear());
                    System.out.println("Director: " + movie.getDirector());
                    System.out.println("Duration: " + movie.getDurationInMinutes() + " minutes");
                    System.out.println("Total Ratings: " + movie.getTotalRatings());
                    System.out.println("Average Rating: " + movie.getAverageRating());

                    System.out.println("""
                        ------------------------------------
                        Do you want to rate this movie? (Yes/No)
                        """);
                    String option = scanner.nextLine();
                    if (option.equalsIgnoreCase("Yes")) {
                        System.out.println("Enter your rating (0 to 10): ");
                        int rating = scanner.nextInt();
                        scanner.nextLine();
                        movie.rate(rating);
                        System.out.println("Thank you for rating! Updated average: " + movie.getAverageRating());
                    }
                    found = true;
                    break;
                }
            }

            // Search for series
            for (Series series : seriesList) {
                if (series.getName().equalsIgnoreCase(searchedName)) {
                    System.out.println("Series found!");
                    System.out.println("Name: " + series.getName());
                    System.out.println("Release Year: " + series.getReleaseYear());
                    System.out.println("Seasons: " + series.getSeasons());
                    System.out.println("Episodes per Season: " + series.getEpisodesPerSeason());
                    System.out.println("Minutes per Episode: " + series.getMinutesPerEpisode());
                    System.out.println("Total Ratings: " + series.getTotalRatings());
                    System.out.println("Average Rating: " + series.getAverageRating());

                    System.out.println("""
                        ------------------------------------
                        Do you want to rate this series? (Yes/No)
                        """);
                    String option = scanner.nextLine();
                    if (option.equalsIgnoreCase("Yes")) {
                        System.out.println("Enter your rating (0 to 10): ");
                        int rating = scanner.nextInt();
                        scanner.nextLine();
                        series.rate(rating);
                        System.out.println("Thank you for rating! Updated average: " + series.getAverageRating());
                    }
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Movie or series not found.");
            }

            System.out.println("Do you want to search for another movie/series? (Yes/No)");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("Yes")) {
                continueSearch = false;
            }
        }

        scanner.close();
    }
}
