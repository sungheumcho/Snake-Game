/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

/**
 *
 * @author Administrator
 */
public class Piece {

    private final int y;
    private final int x;

    public Piece(int x, int y) {
    
    this.x=x;
    this.y=y;
    
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean runsInto(Piece piece){
        if(this.x==piece.getX()&&this.y==piece.getY()){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
    
    
    
}
