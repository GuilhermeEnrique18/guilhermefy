package br.com.guilhermefy.modelos;

public class MyFavorites {
    public void include(Audio audio){
        if(audio.getClassification() >= 8){
            System.out.printf("%s é considerado um sucesso! Todos estão ouvindo!\n",audio.getTitle());
        }else{
            System.out.printf("%s a galera também ta ouvindo!",audio.getTitle());
        }

    }
}
