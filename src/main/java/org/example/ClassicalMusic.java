package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
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
