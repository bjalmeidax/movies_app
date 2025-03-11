package br.com.gja.megamovies;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includedInPlan;
    private double sumOfRatings;
    private int totalRatings;
    private int durationInMinutes;

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void displayTechnicalSheet() {
        System.out.println("Movie name: " + name);
        System.out.println("Release year: " + releaseYear);
    }

    public void rate(double rating) {
        sumOfRatings += rating;
        totalRatings++;
    }

    public double getAverageRating() {
        return sumOfRatings / totalRatings;
    }
}