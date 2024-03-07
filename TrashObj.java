package com.mygdx.game.Object;

import com.mygdx.game.GameSettings;


import java.util.Random;

public class TrashObj extends SpaceObj {


    public TrashObj() {
       super( GameSettings.SCREEN_HEIGHT,(new Random()).nextInt(GameSettings.SCREEN_WIDTH - GameSettings.TRASH_WIDTH),
                GameSettings.TRASH_WIDTH,
                GameSettings.TRASH_HEIGHT,
                "trash.png");
        xspeed = 0;
        yspeed = -GameSettings.TRASH_SPEED;
    }

    public void move() {
        y += yspeed;
        x += xspeed;
    }
}



