package com.me;

import java.awt.*;

public class Cell extends GameObject {

    static final int CELL_WIDTH = 8, CELL_HEIGHT = 8;
    private Life life;
    private Life nextLife;
    private int x;
    private int y;

    public Cell(Life life, int x, int y){
        this.life = life;
        this.x = x;
        this.y = y;
    }

    public Life getNextLife() {
        return nextLife;
    }
    public void setNextLife(Life nextLife) {
        this.nextLife = nextLife;
    }
    public Life getLife() {
        return life;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setLife(Life life) {
        this.life = life;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void tick() {
        if(this.nextLife == null){
            return;
        }
        this.life = this.nextLife;
    }

    @Override
    public void render(Graphics g) {
        if(this.life != Life.ALIVE){
            return;
        }
        g.setColor(Color.BLACK);
        g.fillRect(this.x, this.y, CELL_WIDTH, CELL_HEIGHT);
    }
}
