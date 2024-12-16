package com.example.musicplayer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.example.musicplayer.service.TrackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.musicplayer.model.Track;
@RestController
@RequestMapping("/api/tracks")
public class TrackController {
    private final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

        @GetMapping("/{id}")
        public ResponseEntity<Track> getTrack(@PathVariable String id) {
            Track serviceTrack = trackService.getTrack(id);
            return ResponseEntity.ok(serviceTrack);
        }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                           .body("Error processing track: " + e.getMessage());
    }
}
