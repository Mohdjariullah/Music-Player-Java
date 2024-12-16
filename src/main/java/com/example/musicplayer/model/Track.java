package com.example.musicplayer.model;

public class Track {
    private String title;
    private String artist;
    private String filePath;
    private long duration;

    public Track(String title, String artist, String filePath, long duration) {
        this.title = title;
        this.artist = artist;
        this.filePath = filePath;
        this.duration = duration;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    // Getters and setters
}
