package com.me;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Handler {

    private final Cell[][] map;

    public Handler(int x, int y) {
        this.map = new Cell[x][y];
        initialise();
        loadMap();
    }

    private void loadMap() {

        //Glider
//        map[58][22].setLife(Life.ALIVE);
//        map[59][23].setLife(Life.ALIVE);
//        map[59][24].setLife(Life.ALIVE);
//        map[58][24].setLife(Life.ALIVE);
//        map[57][24].setLife(Life.ALIVE);
        //superNova(80, 45);
        //crazy(80, 45);
        temple(80, 45);

    }

    private void temple(int centreX, int centreY){

        int currentX = centreX, currentY = centreY;

        //right side middle cell and go clockwise around middle circle
        map[currentX += 2][currentY].setLife(Life.ALIVE);
        map[currentX][currentY += 1].setLife(Life.ALIVE);
        map[currentX -= 1][currentY += 1].setLife(Life.ALIVE);
        map[currentX -= 1][currentY += 1].setLife(Life.ALIVE);
        map[currentX -= 1][currentY -= 1].setLife(Life.ALIVE);
        map[currentX -= 1][currentY -= 1].setLife(Life.ALIVE);
        map[currentX][currentY -= 1].setLife(Life.ALIVE);
        map[currentX][currentY -= 1].setLife(Life.ALIVE);
        map[currentX += 1][currentY -= 1].setLife(Life.ALIVE);
        map[currentX += 1][currentY -= 1].setLife(Life.ALIVE);
        map[currentX += 1][currentY += 1].setLife(Life.ALIVE);
        map[currentX += 1][currentY += 1].setLife(Life.ALIVE);

        //Jump to top left corner and do them clockwise
        map[currentX -= 5][currentY -= 3].setLife(Life.ALIVE);
        map[currentX += 1][currentY].setLife(Life.ALIVE);
        map[currentX -= 1][currentY += 1].setLife(Life.ALIVE);

        map[currentX += 5][currentY -= 1].setLife(Life.ALIVE);
        map[currentX += 1][currentY].setLife(Life.ALIVE);
        map[currentX][currentY += 1].setLife(Life.ALIVE);

        map[currentX][currentY += 6].setLife(Life.ALIVE);
        map[currentX][currentY += 1].setLife(Life.ALIVE);
        map[currentX -= 1][currentY].setLife(Life.ALIVE);

        map[currentX -= 4][currentY].setLife(Life.ALIVE);
        map[currentX -= 1][currentY].setLife(Life.ALIVE);
        map[currentX][currentY -= 1].setLife(Life.ALIVE);

        //First layer of dots
        map[currentX -= 1][currentY -= 3].setLife(Life.ALIVE);
        map[currentX += 8][currentY].setLife(Life.ALIVE);

        //Outer Dots
        map[currentX -= 9][currentY += 4].setLife(Life.ALIVE);
        map[currentX][currentY -= 8].setLife(Life.ALIVE);
        map[currentX += 10][currentY].setLife(Life.ALIVE);
        map[currentX][currentY += 8].setLife(Life.ALIVE);

    }

    private void crazy(int centreX, int centreY){

        int currentX = centreX, currentY = centreY;

        //right side middle cell and go clockwise around middle circle
        map[currentX += 2][currentY].setLife(Life.ALIVE);
        map[currentX][currentY += 1].setLife(Life.ALIVE);
        map[currentX -= 1][currentY += 1].setLife(Life.ALIVE);
        map[currentX -= 1][currentY += 1].setLife(Life.ALIVE);
        map[currentX -= 1][currentY -= 1].setLife(Life.ALIVE);
        map[currentX -= 1][currentY -= 1].setLife(Life.ALIVE);
        map[currentX][currentY -= 1].setLife(Life.ALIVE);
        map[currentX][currentY -= 1].setLife(Life.ALIVE);
        map[currentX += 1][currentY -= 1].setLife(Life.ALIVE);
        map[currentX += 1][currentY -= 1].setLife(Life.ALIVE);
        map[currentX += 1][currentY += 1].setLife(Life.ALIVE);
        map[currentX += 1][currentY += 1].setLife(Life.ALIVE);

        //Jump to top left corner and do them clockwise
        map[currentX -= 5][currentY -= 3].setLife(Life.ALIVE);
        map[currentX += 1][currentY].setLife(Life.ALIVE);
        map[currentX -= 1][currentY += 1].setLife(Life.ALIVE);

        map[currentX += 5][currentY -= 1].setLife(Life.ALIVE);
        map[currentX += 1][currentY].setLife(Life.ALIVE);
        map[currentX][currentY += 1].setLife(Life.ALIVE);

        map[currentX][currentY += 6].setLife(Life.ALIVE);
        map[currentX][currentY += 1].setLife(Life.ALIVE);
        map[currentX -= 1][currentY].setLife(Life.ALIVE);

        map[currentX -= 4][currentY].setLife(Life.ALIVE);
        map[currentX -= 1][currentY].setLife(Life.ALIVE);
        map[currentX][currentY -= 1].setLife(Life.ALIVE);

        //First layer of dots
        map[currentX -= 1][currentY -= 3].setLife(Life.ALIVE);
        map[currentX += 4][currentY -= 5].setLife(Life.ALIVE);
        map[currentX += 4][currentY += 5].setLife(Life.ALIVE);
        map[currentX -= 4][currentY += 5].setLife(Life.ALIVE);

        //Outer Dots
        map[currentX -= 5][currentY -= 1].setLife(Life.ALIVE);
        map[currentX][currentY -= 8].setLife(Life.ALIVE);
        map[currentX += 10][currentY].setLife(Life.ALIVE);
        map[currentX][currentY += 8].setLife(Life.ALIVE);

    }

    private void superNova(int centreX, int centreY){
        //Circle with middle thingy
        map[80][45].setLife(Life.ALIVE);
        map[80][44].setLife(Life.ALIVE);
        map[80][46].setLife(Life.ALIVE);
        map[81][45].setLife(Life.ALIVE);
        map[79][45].setLife(Life.ALIVE);

        map[79][39].setLife(Life.ALIVE);
        map[80][39].setLife(Life.ALIVE);
        map[81][39].setLife(Life.ALIVE);
        map[82][40].setLife(Life.ALIVE);
        map[83][40].setLife(Life.ALIVE);
        map[84][41].setLife(Life.ALIVE);
        map[85][42].setLife(Life.ALIVE);
        map[85][43].setLife(Life.ALIVE);
        map[86][44].setLife(Life.ALIVE);
        map[86][45].setLife(Life.ALIVE);
        map[86][46].setLife(Life.ALIVE);
        map[85][47].setLife(Life.ALIVE);
        map[85][48].setLife(Life.ALIVE);
        map[84][49].setLife(Life.ALIVE);
        map[83][50].setLife(Life.ALIVE);
        map[82][50].setLife(Life.ALIVE);
        map[81][51].setLife(Life.ALIVE);
        map[80][51].setLife(Life.ALIVE);
        map[79][51].setLife(Life.ALIVE);
        map[78][50].setLife(Life.ALIVE);
        map[77][50].setLife(Life.ALIVE);
        map[76][49].setLife(Life.ALIVE);
        map[75][48].setLife(Life.ALIVE);
        map[75][47].setLife(Life.ALIVE);
        map[74][46].setLife(Life.ALIVE);
        map[74][45].setLife(Life.ALIVE);
        map[74][44].setLife(Life.ALIVE);
        map[75][43].setLife(Life.ALIVE);
        map[75][42].setLife(Life.ALIVE);
        map[76][41].setLife(Life.ALIVE);
        map[77][40].setLife(Life.ALIVE);
        map[78][40].setLife(Life.ALIVE);

        map[80][30].setLife(Life.ALIVE);
        map[81][29].setLife(Life.ALIVE);
        map[79][29].setLife(Life.ALIVE);
        map[78][28].setLife(Life.ALIVE);
        map[78][27].setLife(Life.ALIVE);
        map[78][26].setLife(Life.ALIVE);
        map[79][25].setLife(Life.ALIVE);
        map[80][24].setLife(Life.ALIVE);
        map[81][25].setLife(Life.ALIVE);
        map[82][26].setLife(Life.ALIVE);
        map[82][27].setLife(Life.ALIVE);
        map[82][28].setLife(Life.ALIVE);

        map[80][66].setLife(Life.ALIVE);
        map[81][65].setLife(Life.ALIVE);
        map[79][65].setLife(Life.ALIVE);
        map[78][64].setLife(Life.ALIVE);
        map[78][63].setLife(Life.ALIVE);
        map[78][62].setLife(Life.ALIVE);
        map[79][61].setLife(Life.ALIVE);
        map[80][60].setLife(Life.ALIVE);
        map[81][61].setLife(Life.ALIVE);
        map[82][62].setLife(Life.ALIVE);
        map[82][63].setLife(Life.ALIVE);
        map[82][64].setLife(Life.ALIVE);

        map[98][48].setLife(Life.ALIVE);
        map[99][47].setLife(Life.ALIVE);
        map[97][47].setLife(Life.ALIVE);
        map[96][46].setLife(Life.ALIVE);
        map[96][45].setLife(Life.ALIVE);
        map[96][44].setLife(Life.ALIVE);
        map[97][43].setLife(Life.ALIVE);
        map[98][42].setLife(Life.ALIVE);
        map[99][43].setLife(Life.ALIVE);
        map[100][44].setLife(Life.ALIVE);
        map[100][45].setLife(Life.ALIVE);
        map[100][46].setLife(Life.ALIVE);

        map[62][48].setLife(Life.ALIVE);
        map[63][47].setLife(Life.ALIVE);
        map[61][47].setLife(Life.ALIVE);
        map[60][46].setLife(Life.ALIVE);
        map[60][45].setLife(Life.ALIVE);
        map[60][44].setLife(Life.ALIVE);
        map[61][43].setLife(Life.ALIVE);
        map[62][42].setLife(Life.ALIVE);
        map[63][43].setLife(Life.ALIVE);
        map[64][44].setLife(Life.ALIVE);
        map[64][45].setLife(Life.ALIVE);
        map[64][46].setLife(Life.ALIVE);
    }

    private void initialise() {
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
               map[i][j] = new Cell(Life.DEAD, i * 8, j * 8);
            }
        }
    }

    public void tick(){

        evaluateCells();

        for (Cell[] cells : map) {
            for (Cell cell : cells) {
                cell.tick();
            }
        }
    }

    public void render(Graphics g){
        for (Cell[] cells : map) {
            for (Cell cell : cells) {
                cell.render(g);
            }
        }
    }

    private void evaluateCells(){

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                int adjAlive = 0;

                for(int k = 0; k < 8; k++){
                    switch(k){
                        //Straight up and down neighbours
                        case 0 -> {
                            if(evaluateAdjacentCell(i + 1, j, map[i][j]) == Life.ALIVE){
                                adjAlive++;
                            }
                        }
                        case 1 -> {
                            if(evaluateAdjacentCell(i, j - 1, map[i][j]) == Life.ALIVE){
                                adjAlive++;
                            }
                        }
                        case 2 -> {
                            if(evaluateAdjacentCell(i - 1, j, map[i][j]) == Life.ALIVE){
                                adjAlive++;
                            }
                        }
                        case 3 -> {
                            if(evaluateAdjacentCell(i, j + 1, map[i][j]) == Life.ALIVE){
                                adjAlive++;
                            }
                        }
                        //diagonal neighbours
                        case 4 -> {
                            if(evaluateAdjacentCell(i + 1, j + 1, map[i][j]) == Life.ALIVE){
                                adjAlive++;
                            }
                        }
                        case 5 -> {
                            if(evaluateAdjacentCell(i + 1, j - 1, map[i][j]) == Life.ALIVE){
                                adjAlive++;
                            }
                        }
                        case 6 -> {
                            if(evaluateAdjacentCell(i - 1, j - 1, map[i][j]) == Life.ALIVE){
                                adjAlive++;
                            }
                        }
                        case 7 -> {
                            if(evaluateAdjacentCell(i - 1, j + 1, map[i][j]) == Life.ALIVE){
                                adjAlive++;
                            }
                        }
                    }
                }

                if(adjAlive < 2 || adjAlive > 3){
                    map[i][j].setNextLife(Life.DEAD);
                    continue;
                }

                if(adjAlive == 3){
                    map[i][j].setNextLife(Life.ALIVE);
                    continue;
                }

                map[i][j].setNextLife(map[i][j].getLife());
            }
        }

    }

    private Life evaluateAdjacentCell(int x, int y, Cell cell){
        if(!inBounds(x, y)){
            return Life.DEAD;
        }
        return map[x][y].getLife();
    }

    private boolean inBounds(int x, int y){
        if(x > this.map.length - 1 || x < 0){
            return false;
        }
        if(y > this.map[0].length - 1 || y < 0){
            return false;
        }
        return true;
    }

}
