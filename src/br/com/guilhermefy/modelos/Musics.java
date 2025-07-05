package br.com.guilhermefy.modelos;

public class Musics extends Audio{
    private String album;
    private String singer;
    private String gender;
    private String lyrics;


    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void description(){
        System.out.printf("Nome da música\n" + getTitle());
        System.out.printf("Autor: \n" + getSinger());
        System.out.printf("Gênero musical: \n" + getGender());
        System.out.printf("Duração em minutos: \n", getDurationInMinutes());
        System.out.printf("Letra da música: \n", getLyrics());
    }

    @Override
    public int getClassification() {
        if(this.getTotalReproductions() > 2000){
            return 10;
        }else{
            return 7;
        }
    }
}
