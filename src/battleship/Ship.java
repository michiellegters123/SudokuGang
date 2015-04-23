/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.Random;

/**
 *
 * @author pg3f4
 */
public class Ship {
    
    private int size;
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    
    public Ship(int s){
        size = s;
        Random gen = new Random();
        startX = gen.nextInt(10);
        startY = gen.nextInt(10);
        int dir = gen.nextInt(4);
        
        //Go North
        if(dir==0){
            endX = startX;
            endY = startY-(size-1);
        }
    }
    
    public Ship(int s, int sX, int sY, int eX, int eY){
        size = s;
        startX = sX;
        startY = sY;
        endX = eX;
        endY = eY;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the startX
     */
    public int getStartX() {
        return startX;
    }

    /**
     * @param startX the startX to set
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * @return the startY
     */
    public int getStartY() {
        return startY;
    }

    /**
     * @param startY the startY to set
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * @return the endX
     */
    public int getEndX() {
        return endX;
    }

    /**
     * @param endX the endX to set
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * @return the endY
     */
    public int getEndY() {
        return endY;
    }

    /**
     * @param endY the endY to set
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }
}
