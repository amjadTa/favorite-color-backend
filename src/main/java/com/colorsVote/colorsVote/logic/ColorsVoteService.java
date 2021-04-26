package com.colorsVote.colorsVote.logic;
import java.util.List;

import org.springframework.stereotype.Component;

import com.colorsVote.colorsVote.entity.Colors;
import com.colorsVote.colorsVote.repository.ColorsVoteRepository;

@Component
public class ColorsVoteService {
    private ColorsVoteRepository colorsVoteRepository = new ColorsVoteRepository();

    public List<Colors> saveVote(String color) {
        return colorsVoteRepository.save(color);
    }

    public List<Colors> getVoteResult() {
        return colorsVoteRepository.getVoteResult();
    }
}
