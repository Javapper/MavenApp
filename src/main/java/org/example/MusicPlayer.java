package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }


    public MusicPlayer() {
    }

    public void myInitMethod() {
        System.out.println("Doing my initialization");
    }

    public void myDestroyMethod() {
        System.out.println("Doing my destroying");
    }

    public void playMusic() {
        for (Music music: musicList) {
            System.out.println("Playing " + music.getSong());
        }
    }
}
