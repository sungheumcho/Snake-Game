/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.*;
import wormgame.Direction;

/**
 *
 * @author Administrator
 */
public class Worm {

    private int originalX;
    private int originalY;
    private Direction originalDirection;
    private List<Piece> pieces;
    private boolean grow;

    public Worm(int originalX, int originalY, Direction originalDirection) {

        this.originalX = originalX;
        this.originalY = originalY;
        this.originalDirection = originalDirection;
        pieces = new ArrayList<Piece>();
        pieces.add(new Piece(originalX, originalY));
        grow = false;
    }

    public Direction getDirection() {
        return this.originalDirection;
    }

    public void setDirection(Direction dir) {
        this.originalDirection = dir;
    }

    public int getLength() {
        return getPieces().size();
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void move() {
       // if (pieces.get(pieces.size() - 1).getX() < this.originalX * 2 && pieces.get(pieces.size() - 1).getY() <this.originalY * 2) {
            int newX = pieces.get(pieces.size() - 1).getX();
        int newY = pieces.get(pieces.size() - 1).getY();
 
        if (originalDirection == Direction.RIGHT) {
            newX++;
        } else if (originalDirection == Direction.LEFT) {
            newX--;
        } else if (originalDirection == Direction.DOWN) {
            newY++;
        } else {
            newY--;
        }
 
        if (!grow && getLength() > 2) {
            pieces.remove(0);
        } else {
            grow = false;
        }
 
        pieces.add(new Piece(newX, newY));
        //}
    }

    public void grow() {
        grow = true;

    }

    public boolean runsInto(Piece piece) {
        for (Piece p : pieces) {
            if (p.getX() == piece.getX() && p.getY() == piece.getY()) {
                return true;
            }
        }
        return false;
    }
    

    public boolean runsIntoItself() {
        int count = pieces.size() - 1;
        for (Piece p : pieces) {
            if (count == 0) {
                break;
            } else if (p.getX() == pieces.get(pieces.size() - 1).getX() && p.getY() == pieces.get(pieces.size() - 1).getY()) {
                return true;
            }
            count--;
        }
        return false;
    }

}
