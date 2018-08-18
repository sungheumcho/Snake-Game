/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author Administrator
 */
public class DrawingBoard extends JPanel implements Updatable {

    private  int pieceLength;
    private  WormGame wormgame;

    public DrawingBoard(WormGame wormgame, int pieceLength) {
        this.wormgame = wormgame;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); //To change body of generated methods, choose Tools | Templates.
        grphcs.setColor(Color.BLACK);
        for(Piece p: wormgame.getWorm().getPieces()){
            grphcs.fill3DRect(pieceLength*p.getX(),pieceLength*p.getY(), pieceLength, pieceLength, true); 
        }
        grphcs.setColor(Color.RED);
        grphcs.fillOval(pieceLength*wormgame.getApple().getX(), pieceLength*wormgame.getApple().getY(),pieceLength, pieceLength);
    }

    @Override
    public void update() {
        repaint();
    }
    
    
    
}
