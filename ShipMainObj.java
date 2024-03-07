package com.mygdx.game.Object;

import com.badlogic.gdx.utils.TimeUtils;
import com.mygdx.game.GameSettings;

public class ShipMainObj extends SpaceObj {

    long lastshottime;

    public ShipMainObj(int  y, int  x, String PathtoTexture) {
        super(y, x, 150, 150, "ship.png");
        lastshottime = TimeUtils.millis();
    }

    public void move(float tx, float ty) {
        tx -= x + wight / 2;
        ty -= y + hight / 2;

        double sqrT = Math.sqrt(tx * tx + ty * ty);
        xspeed = (int) (5 * tx / sqrT);
        yspeed = (int) (5 * ty / sqrT);

        y += yspeed;
        x += xspeed;


    }
    public boolean hastoshot(){
        if (TimeUtils.millis() - lastshottime >= GameSettings.SHIP_COOL_DOWN){
            lastshottime = TimeUtils.millis();
            return true;
        }
        return false;
    }
    }