package de.neuefische;

public class VideoPlayer implements Playable{
    @Override
    public void play(String whatToPlay) {
        System.out.println(whatToPlay + " is Playing");
    }
}
