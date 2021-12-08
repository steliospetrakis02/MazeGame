/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.aueb.dmst.mazegame;
 import javax.swing.JFrame;
/**
 *
 * @author Stelios
 */
public class Game_Start {
    


    public void Start_Game() {   
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Maze");

        GamePanel game = new GamePanel();
        window.add(game);


        window.pack();



        window.setLocationRelativeTo(null);
        window.setVisible(true);

        game.StartGameThread();
    }
    
}

