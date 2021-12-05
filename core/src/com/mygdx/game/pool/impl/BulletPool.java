package com.mygdx.game.pool.impl;


import com.mygdx.game.pool.SpritesPool;
import com.mygdx.game.sprite.impl.Bullet;

public class BulletPool extends SpritesPool<Bullet> {
    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}
