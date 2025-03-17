package br.com.gja.megamovies;

public class Episodes implements Assessment {
    private int nmber;
    private String nome;
    private Series serie;
    private int totalViews;

    public int getTotalViews(int i) {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNmber() {
        return nmber;
    }

    public void setNmber(int nmber) {
        this.nmber = nmber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getAssessment() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
