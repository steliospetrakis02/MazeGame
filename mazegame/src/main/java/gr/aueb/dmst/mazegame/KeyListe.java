package gr.aueb.dmst.mazegame;

import java.awt.event.*;

public class KeyListe implements KeyListener {
    
    public boolean upPres;
    public boolean dwnPres;
    public boolean leftPres;
    public boolean rightPres;
    


    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W) {

            upPres=true;

        }
        if(code == KeyEvent.VK_S) {
            
            dwnPres=true;

        }
        if(code == KeyEvent.VK_A) {

            leftPres=true;

        }
        if(code == KeyEvent.VK_D) {

            rightPres=true;

        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W) {

            upPres = false;

        }
        if(code == KeyEvent.VK_S) {

            dwnPres = false;

        }
        if(code == KeyEvent.VK_A) {

            leftPres = false;

        }
        if(code == KeyEvent.VK_D) {

            rightPres = false;

        }
        
    } 
    
}
