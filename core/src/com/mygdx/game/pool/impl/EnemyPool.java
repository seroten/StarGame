package com.mygdx.game.pool.impl;

import com.badlogic.gdx.audio.Sound;
import com.mygdx.game.math.Rect;
import com.mygdx.game.pool.SpritesPool;
import com.mygdx.game.sprite.impl.EnemyShip;


public class EnemyPool extends SpritesPool<EnemyShip> {

    private final BulletPool bulletPool;
    private final Sound bulletSound;
    private final Rect worldBounds;

    public EnemyPool(BulletPool bulletPool, Sound bulletSound, Rect worldBounds) {
        this.bulletPool = bulletPool;
        this.bulletSound = bulletSound;
        this.worldBounds = worldBounds;
    }

    @Override
    protected EnemyShip newObject() {
        return new EnemyShip(bulletPool, bulletSound, worldBounds);
    }
}
