package com.ashishkumarm.sprockpaperslizard.data;

import com.ashishkumarm.sprockpaperslizard.R;

import java.util.ArrayList;
import java.util.List;

public class GameAssets {

    private static final List<Integer> gameMoves = new ArrayList<Integer>(){
        {
            add(R.drawable.rock);
            add(R.drawable.paper);
            add(R.drawable.scissors);
            add(R.drawable.lizard);
            add(R.drawable.spock);

        }
    };

    public static List<Integer> getGameMoves() {
        return gameMoves;
    }

}
