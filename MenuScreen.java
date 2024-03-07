package com.mygdx.game.Screen;


import com.badlogic.gdx.ScreenAdapter;

import com.mygdx.game.MyGdxGame;


public class MenuScreen extends ScreenAdapter {
    com.mygdx.game.MyGdxGame MyGdxGame;

    public  MenuScreen  (MyGdxGame myGdxGame ){
        this.MyGdxGame = myGdxGame;

    }

    @Override
    public void render(float delta) {
        super.render(delta);
    }
}
