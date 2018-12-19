package com.coderlab.f3demo;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Joueur {

    private int x;
    private int y;

    private int up;
    private int down;

    public Joueur(int x, int y, int up, int down) {
        this.x = x;
        this.y = y;
        this.up = up;
        this.down = down;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getUp() {
        return up;
    }

    public void setUp(int up) {
        this.up = up;
    }

    public int getDown() {
        return down;
    }

    public void setDown(int down) {
        this.down = down;
    }

    public void update(Input input) {
        if (input.isKeyPressed(this.up)) {
            this.y--;
        }
    }

    public void render(Graphics graphics) {
        graphics.fillRect(this.x, this.y, 200, 200);
    }




}
