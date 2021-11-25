package com.mygdx.game.screen.impl;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import com.mygdx.game.screen.BaseScreen;

public class MenuScreen extends BaseScreen {
    private final float V_LEN = 10;

    private Texture img;
    private Vector2 touch;
    private Vector2 v;
    private Vector2 pos;

    @Override
    public void show() {
        super.show();
        img = new Texture("badlogic.jpg");
        touch = new Vector2();
        v = new Vector2(1, 1);
        pos = new Vector2();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        batch.draw(img, pos.x, pos.y);
        batch.end();

        if(touch.dst(pos) >V_LEN) {
            pos.add(v);
        } else pos.set(touch);
    }

    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        touch.set(screenX, Gdx.graphics.getHeight() - screenY);
        v.set(touch.cpy().sub(pos)).setLength(V_LEN);
        return super.touchDown(screenX, screenY, pointer, button);
    }
}
