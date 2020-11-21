package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> classiicalMusic = new ArrayList<>();

    private ClassicalMusic() {
        classiicalMusic.add("Hungarian Rhapsody");
        classiicalMusic.add("Mediterraneo");
        classiicalMusic.add("Stabat mater");
    }

    @Override
    public List<String> getSong() {
        return classiicalMusic;
    }
}
