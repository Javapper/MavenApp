package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private Music classicalMusic;
    private  Music jazzMusic;
    private  Music rockMusic;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("jazzMusic") Music jazzMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.jazzMusic = jazzMusic;
        this.rockMusic = rockMusic;
    }

    @PostConstruct
    public void myInitMethod() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void myDestroyMethod() {
        System.out.println("Doing my destroying");
    }


    public void playMusic(Genre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == Genre.ClassicalMusic) {
            System.out.println("Playing " + classicalMusic.getSong().get(randomNumber));
        } else if (genre == Genre.JazzMusic) {
            System.out.println("Playing " + jazzMusic.getSong().get(randomNumber));
        } else {
            System.out.println("Playing " + rockMusic.getSong().get(randomNumber));
        }
    }
}
