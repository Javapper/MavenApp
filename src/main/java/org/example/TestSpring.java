package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.XML"
        );
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.playMusic();

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        System.out.println(firstMusicPlayer == secondMusicPlayer);

        firstMusicPlayer.setVolume(100);

        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());

        System.out.println(secondMusicPlayer.getName());
        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
