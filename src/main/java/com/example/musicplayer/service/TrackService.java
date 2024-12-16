package com.example.musicplayer.service;

import org.springframework.stereotype.Service;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import com.example.musicplayer.model.Track;

@Service
public class TrackService {
    private final Map<String, Track> tracks = new ConcurrentHashMap<>();

    public com.example.musicplayer.model.Track getTrack(String id) {
        return tracks.computeIfAbsent(id, this::loadTrack);
    }
    private Track loadTrack(String id) {
        // Load track metadata and return track object
        return new Track(id, "", "", 0);
    }
}
