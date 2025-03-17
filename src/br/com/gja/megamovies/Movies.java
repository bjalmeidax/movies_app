package br.com.gja.megamovies;

public class Movies extends Title implements Assessment {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getAssessment() {
        return (int) getAverageRating() / 2;
    }
}