package de.neuefische;

public class Main {
    public static void main(String[] args) {
        MediaController mediaController = new MediaController();
        MusicPlayer musicPlayer = new MusicPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        mediaController.playMedia(musicPlayer, "Candy Shop");
        mediaController.playMedia(videoPlayer, "König der Löwen");
    }
}