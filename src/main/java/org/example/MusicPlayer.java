package org.example;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> musicList;

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

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
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
            System.out.println("Playing " + musicList.get(0).getSong().get(randomNumber));
        } else if (genre == Genre.JazzMusic) {
            System.out.println("Playing " + musicList.get(1).getSong().get(randomNumber));
        } else {
            System.out.println("Playing " + musicList.get(2).getSong().get(randomNumber));
        }
    }
}
