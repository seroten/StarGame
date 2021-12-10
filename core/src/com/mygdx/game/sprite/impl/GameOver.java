package com.mygdx.game.sprite.impl;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.mygdx.game.math.Rect;
import com.mygdx.game.sprite.Sprite;

public class GameOver extends Sprite {

    private static final float HEIGHT = 0.08f;

    public GameOver(TextureAtlas atlas) {
        super(atlas.findRegion("message_game_over"));
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(HEIGHT);
    }
}
