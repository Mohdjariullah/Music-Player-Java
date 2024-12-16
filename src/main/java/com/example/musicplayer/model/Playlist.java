package com.example.musicplayer.model;

public class Playlist {
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }    private java.util.List<Track> tracks;    private int currentTrackIndex;

    public Playlist(String name) {
        this.name = name;
        this.tracks = new java.util.ArrayList<>();
        this.currentTrackIndex = 0;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(int index) {
        if (index >= 0 && index < tracks.size()) {
            tracks.remove(index);
            if (currentTrackIndex >= index) {
                currentTrackIndex = Math.max(0, currentTrackIndex - 1);
            }
        }
    }

    public void moveTrack(int fromIndex, int toIndex) {
        if (fromIndex >= 0 && fromIndex < tracks.size() && 
            toIndex >= 0 && toIndex < tracks.size()) {
            Track track = tracks.remove(fromIndex);
            tracks.add(toIndex, track);
        }
    }

    public Track getCurrentTrack() {
        return tracks.isEmpty() ? null : tracks.get(currentTrackIndex);
    }

    public Track getNextTrack() {
        if (tracks.isEmpty()) return null;
        currentTrackIndex = (currentTrackIndex + 1) % tracks.size();
        return getCurrentTrack();
    }

    public Track getPreviousTrack() {
        if (tracks.isEmpty()) return null;
        currentTrackIndex = (currentTrackIndex - 1 + tracks.size()) % tracks.size();
        return getCurrentTrack();
    }
}
