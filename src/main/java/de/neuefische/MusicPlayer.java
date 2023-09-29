package de.neuefische;

public class MusicPlayer implements Playable{
    @Override
    public void play(String whatToPlay) {
        System.out.println(whatToPlay + " is Playing");
    }
}
