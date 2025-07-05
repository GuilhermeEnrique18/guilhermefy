package br.com.guilhermefy.modelos;

public class Podcast extends Audio{

    private String host;
    private String synopsis;

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public void description(){
        System.out.printf("Nome do Podcast: \n" + getTitle());
        System.out.printf("Host: \n" + getHost());
        System.out.printf("Duração em minutos: \n", getDurationInMinutes());
        System.out.printf("Sinopse: \n", getSynopsis());
    }

    @Override
    public int getClassification() {
        if(this.getTotalLikes() > 500){
            return 10;
        }else{
            return 8;
        }
    }
}

