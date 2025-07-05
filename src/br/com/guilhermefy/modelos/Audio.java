package br.com.guilhermefy.modelos;

public class Audio {
    private String title;
    private int durationInMinutes;
    private int totalReproductions;
    private int totalLikes;
    private int classification;
    public void description(){
    }

    public int getClassification() {
        return classification;
    }

    public void like(){
        this.totalLikes++;
    }

    public void reproduction(){
        this.totalReproductions++;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public String getTitle (){
        return this.title;
    }

    public void setTitle(String title){
        this.title=title;

    }

    public int getDurationInMinutes(){
       return this.durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;

    }


}
