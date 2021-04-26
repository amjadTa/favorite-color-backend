package com.colorsVote.colorsVote.repository;

import com.colorsVote.colorsVote.entity.Colors;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@RepositoryRestResource()
public class ColorsVoteRepository {
    private List<Colors> colors;

    public ColorsVoteRepository() {
    }

    public List<Colors> save(String color) {
        boolean found = false;
        if(colors == null) {
            colors = new ArrayList<>();
        }
        for(Colors colorItem : colors) {
            if(colorItem.getColorName().equals(color)) {
                colorItem.setColorVote(colorItem.getColorVote() + 1);
                found = true;
                break;
            }
        }
        if(!found) {
            colors.add(new Colors(color, 1));
        }
        return  colors;
    }

    public List<Colors> getVoteResult() {
        return colors;
    }
}
