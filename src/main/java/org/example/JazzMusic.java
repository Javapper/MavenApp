package org.example;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {
    private List<String> jazzMusic = new ArrayList<>();

    public JazzMusic() {
        jazzMusic.add( "More Than You Know");
        jazzMusic.add("Overture");
        jazzMusic.add("Druidens Flaska");
    }

    @Override
    public List<String> getSong() {
        return jazzMusic;
    }
}
