package io.anuke.mindustry.game;

import com.badlogic.gdx.graphics.Color;

public enum Team {
    none(Color.DARK_GRAY),
    blue(Color.ROYAL),
    red(Color.valueOf("e84737")),
    green(Color.valueOf("1dc645")),
    purple(Color.valueOf("ba5bd9")),
    orange(Color.valueOf("e8c66a"));

    public final Color color;
    public final int intColor;

    Team(Color color){
        this.color = color;
        intColor = Color.rgba8888(color);
    }
}
