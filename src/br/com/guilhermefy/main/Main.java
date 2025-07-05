package br.com.guilhermefy.main;

import br.com.guilhermefy.modelos.Musics;
import br.com.guilhermefy.modelos.MyFavorites;
import br.com.guilhermefy.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musics music = new Musics();
        music.setTitle("Creep");
        music.setSinger("Thom Yorke");

        for (int i = 0; i < 1000; i++) {
            music.reproduction();
        }
        for (int i = 0; i < 50; i++) {
            music.like();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("Flow");
        podcast.setHost("Igor");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduction();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.like();
        }

        MyFavorites favorites = new MyFavorites();

        favorites.include(podcast);
        favorites.include(music);

    }
}