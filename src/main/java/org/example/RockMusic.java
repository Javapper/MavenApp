package org.example;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    private List<String> rockMusic = new ArrayList<>();

    public RockMusic() {
        rockMusic.add("Wind cries Mary");
        rockMusic.add("She’s Not There");
        rockMusic.add("Smells Like Teen Spirit");
    }

    @Override
    public List<String> getSong() {
        return rockMusic;
    }
}
