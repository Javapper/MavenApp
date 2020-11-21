package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockMusic = new ArrayList<>();

    private RockMusic() {
        rockMusic.add("Wind cries Mary");
        rockMusic.add("She’s Not There");
        rockMusic.add("Smells Like Teen Spirit");
    }

    @Override
    public List<String> getSong() {
        return rockMusic;
    }
}
