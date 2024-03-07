package com.mygdx.game.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.GameSettings;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.Object.BulletObj;
import com.mygdx.game.Object.ShipMainObj;
import com.mygdx.game.Object.TrashObj;
import com.mygdx.game.Session;

import java.util.ArrayList;

public class GameScreen extends ScreenAdapter {

    MyGdxGame myGdxGame;
    Session session;

    ShipMainObj ship;
    ArrayList<TrashObj> trashArray;
    ArrayList<BulletObj> bulletArray;



    @Override
    public void render(float delta) {
        handelinput();

        if (session.hasToSpawnTrash()) {
            TrashObj trash = new TrashObj();
            trashArray.add(trash);
            System.out.println("added");
        }

        if(ship.hastoshot()){
            BulletObj bullet = new BulletObj(ship.y , ship.x /2 );
            bulletArray.add(bullet);
        }

        for (int i = 0; i < trashArray.size(); i++) trashArray.get(i).move();
        for (int i = 0; i < bulletArray.size(); i++) bulletArray.get(i).move();

        draw();
    }
    private void handelinput(){
      Vector3 touch = myGdxGame.camera.unproject(new Vector3(Gdx.input.getX(),Gdx.input.getY(), 0));

        ship.move((int)touch.x,(int)touch.y);
    }

    public void draw(){
        myGdxGame.camera.update();
        myGdxGame.batch.setProjectionMatrix(myGdxGame.camera.combined);
        ScreenUtils.clear(Color.BLACK);
        myGdxGame.batch.begin();
        for (int i = 0; i < trashArray.size(); i++){
            trashArray.get(i).draw(myGdxGame.batch);
           

        }


        ship.draw(myGdxGame.batch);
        myGdxGame.batch.end();
    }

    @Override
    public void show() {
        session.hasToSpawnTrash();
    }

    public  GameScreen (MyGdxGame myGdxGame){
        this.myGdxGame = myGdxGame;
        ship = new ShipMainObj(200, GameSettings.SCREEN_WIDTH / 2 - GameSettings.SHIP_WIDTH/2, "ship.png");
        session = new Session();
        trashArray = new ArrayList<>();
        bulletArray = new ArrayList<>();
    }
}
