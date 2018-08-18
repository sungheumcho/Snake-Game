/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import wormgame.Direction;
import wormgame.domain.Worm;

/**
 *
 * @author Administrator
 */
public class KeyboardListener implements KeyListener {

    private  Worm worm;

    public KeyboardListener(Worm worm) {
        this.worm = worm;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
           worm.setDirection(Direction.LEFT);
        } else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
           worm.setDirection(Direction.RIGHT);
        }else if (ke.getKeyCode() == KeyEvent.VK_UP) {
            worm.setDirection(Direction.UP);
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            worm.setDirection(Direction.DOWN);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
