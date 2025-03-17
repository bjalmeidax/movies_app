package br.com.gja.megamovies;

public class RecommendationFilter {

    public void filter(Assessment assessment) {
        if (assessment.getAssessment() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (assessment.getAssessment() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}
