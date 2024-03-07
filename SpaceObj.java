package com.mygdx.game.Object;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.GameSettings;

public class SpaceObj {
    SpriteBatch batch;
    public int y;
    public int  x;
    int xspeed;
    int yspeed;
    float hight;
    float wight;

    Texture texture;

    public SpaceObj(int y, int x, int Hight, int Wight, String PathtoTexture) {
        this.x = x;
        this.y = y;

        this.wight = Wight;
        this.hight = Hight;

        xspeed = 0;
        yspeed = 0;

        texture = new Texture(PathtoTexture);
    }

    public void draw(SpriteBatch batch) {
        batch.draw(texture, x, y, GameSettings.SHIP_HEIGHT, GameSettings.SHIP_WIDTH);
    }

    public void dispose() {
        texture.dispose();
    }
}
