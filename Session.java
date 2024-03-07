package com.mygdx.game;

import com.badlogic.gdx.utils.TimeUtils;
import com.mygdx.game.Object.ShipMainObj;

import java.util.concurrent.TimeUnit;

public class Session {
    int score;
    int kill;
    long TimeofBegin;

    public void beginSession() {
        score = 0;
        kill = 0;
        TimeofBegin = TimeUtils.millis();
    }

    public boolean hasToSpawnTrash() {
        if (TimeUtils.millis() - TimeofBegin >= GameSettings.TRASH_SPAWN_PERIOD) {
            TimeofBegin = TimeUtils.millis();
            return true;
        }
        return false;
    }


}
