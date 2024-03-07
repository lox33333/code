package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.mygdx.game.Screen.GameScreen;
import com.mygdx.game.Screen.MenuScreen;
import com.mygdx.game.Screen.SettingsScreen;

public class MyGdxGame extends Game {
public SpriteBatch batch;

	public	OrthographicCamera camera;
	public	MenuScreen menuScreen;
	public	GameScreen gameScreen;
	public	SettingsScreen settingsScreen;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		gameScreen = new GameScreen( this);
		menuScreen = new MenuScreen(this );
		settingsScreen  = new SettingsScreen(this );

		camera.setToOrtho(false, GameSettings.SCREEN_WIDTH ,GameSettings.SCREEN_HEIGHT);

		setScreen(gameScreen);
	}



	@Override
	public void dispose () {
		batch.dispose();
	}
}
