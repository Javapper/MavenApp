package org.example;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music{
    private List<String> classicalMusic = new ArrayList<>();

    public ClassicalMusic() {
        classicalMusic.add("Hungarian Rhapsody");
        classicalMusic.add("Mediterraneo");
        classicalMusic.add("Stabat mater");
    }

    @Override
    public List<String> getSong() {
        return classicalMusic;
    }
}
