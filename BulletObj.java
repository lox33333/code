package com.mygdx.game.Object;

import com.badlogic.gdx.utils.TimeUtils;
import com.mygdx.game.GameSettings;

public class BulletObj extends SpaceObj{

   long lastShootztime ;
    public BulletObj(int y, int x){
        super ( x, y, 15 , 50 , "bullet.png");
        lastShootztime = TimeUtils.millis();
    }
    public void move( ){


        x += xspeed;
        y += yspeed;
    }
    public boolean hastoshot(){
        if(TimeUtils.millis() - lastShootztime >= GameSettings.SHIP_COOL_DOWN){
            lastShootztime = TimeUtils.millis();
            return true;
        }
        return false;
    }
}
