package com.example.musicplayer.service;

import javazoom.jl.player.Player;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;

@Service
public class MusicService {
    private Player player;
    private Thread playThread;

    public String playMusic(String filePath) {
        try {
            if (player != null) {
                stopMusic();
            }
            playThread = new Thread(() -> {
                try (FileInputStream fileInputStream = new FileInputStream("uploads/" + filePath)) {
                    player = new Player(fileInputStream);
                    player.play();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            playThread.start();
            return "Playing: " + filePath;
        } catch (Exception e) {
            return "Error playing music: " + e.getMessage();
        }
    }

    public String stopMusic() {
        if (player != null) {
            player.close();
            player = null;
            if (playThread != null) {
                playThread.interrupt();
            }
            return "Music stopped.";
        }
        return "No music is playing.";
    }
}
