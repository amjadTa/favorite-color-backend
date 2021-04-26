package com.colorsVote.colorsVote.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.colorsVote.colorsVote.entity.Colors;
import com.colorsVote.colorsVote.logic.ColorsVoteService;
import com.colorsVote.colorsVote.links.ColorLinks;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")

public class ColorsVoteController {
    @Autowired
    ColorsVoteService colorsVoteService;

    @GetMapping(path = ColorLinks.LIST_COLORS)
    public ResponseEntity<?> listUsers() {
        List<Colors> resource = colorsVoteService.getVoteResult();
        return ResponseEntity.ok(resource);
    }

    @CrossOrigin
    @PostMapping(path = ColorLinks.SAVE_COLOR)
    public ResponseEntity<?> saveUser(@RequestBody String color) {
        List<Colors> resource = colorsVoteService.saveVote(color);
        return ResponseEntity.ok(resource);
    }
}
