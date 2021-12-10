package com.mygdx.game.sprite.impl;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.mygdx.game.math.Rect;
import com.mygdx.game.screen.impl.GameScreen;
import com.mygdx.game.sprite.BaseButton;

public class ButtonNewGame extends BaseButton {

    private static final float HEIGHT = 0.05f;
    private static final float MARGIN = -0.05f;

    private final GameScreen gameScreen;

    public ButtonNewGame(TextureAtlas atlas, GameScreen gameScreen) {
        super(atlas.findRegion("button_new_game"));
        this.gameScreen = gameScreen;
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(HEIGHT);
        setBottom(MARGIN);
    }

    @Override
    public void action() {
        gameScreen.startNewGame();
    }
}
