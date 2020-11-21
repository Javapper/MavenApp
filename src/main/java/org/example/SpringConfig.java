package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.propeties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return  new JazzMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public List<Music> musicList() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(classicalMusic());
        musicList.add(jazzMusic());
        musicList.add(rockMusic());
        return musicList;

    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
}
