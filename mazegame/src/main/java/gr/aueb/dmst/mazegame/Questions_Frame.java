/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gr.aueb.dmst.mazegame;

import java.util.Scanner;
import javax.swing.JButton;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Stelios
 */
public class Questions_Frame extends javax.swing.JFrame {

  public int  play_anwser_is_cor=0;
    int anwser=0;
    GamePanel gp;
    GamePanel gmp = new GamePanel();
    KeyListe key;
   Player pl = new Player(gmp, key);
    /**
     * Creates new form Questions_Frame
     */
    public Questions_Frame() {
        initComponents();
        
        
    }
    Scanner sc = new Scanner(System.in);
    int correctAns;
    String Question;
    String[] op = new String[3];
   
           
            
    
    public Questions_Frame(String q, String[] options, int ans, Player pl,GamePanel gp,KeyListe key){
        initComponents();
        Question=q;
        correctAns = ans;
        op = options ;
        this.pl=pl;
        this.gp = gp;
        this.key = key;
        
        
        
    }
    
    public void playq() { 
        Questionn.setText(Question);
        First_Question.setText(op[0]);
        Second_Question.setText(op[1]);
        //if question 3 does not exist print nothing
        try {
            Third_Question.setText(op[2]);
        } catch (Exception e) {
            Third_Question.setText("");
        }
        
       
        
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Questionn = new javax.swing.JLabel();
        First_Question = new javax.swing.JButton();
        Second_Question = new javax.swing.JButton();
        Third_Question = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Questionn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Questionn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Questionn.setToolTipText("");
        Questionn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        First_Question.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                First_QuestionInputMethodTextChanged(evt);
            }
        });
        First_Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                First_QuestionActionPerformed(evt);
            }
        });

        Second_Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Second_QuestionActionPerformed(evt);
            }
        });

        Third_Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Third_QuestionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Second_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(First_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Third_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Questionn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(Questionn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(First_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Second_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Third_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void First_QuestionInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_First_QuestionInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_First_QuestionInputMethodTextChanged

    private void First_QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_First_QuestionActionPerformed
       
        if(First_Question.getText().equals(op[correctAns])) {
           
            gp.obj[pl.ind]=null;
           try {
                gp.obj[pl.ind + 19] = null;
            } catch (Exception e) {
                gp.obj[pl.ind - 19] = null;
            }
            gp.gameState=gp.playState;
            reset_players_key_pressed();
            this.setVisible(false);
            pl.update();
            
            
            
        }
        else {
            gp.gameState=gp.playState;
            reset_players_key_pressed();
            this.setVisible(false);
           
        }
        
    }//GEN-LAST:event_First_QuestionActionPerformed
    public void reset_players_key_pressed(){
        key.upPres=false;
        key.rightPres=false;
        key.leftPres=false;
        key.dwnPres=false;
    }
    private void  Second_QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Second_QuestionActionPerformed
       
        if(Second_Question.getText().equals(op[correctAns])) {
          
            this.setVisible(false);
           try {
                gp.obj[pl.ind + 19] = null;
            } catch (Exception e) {
                gp.obj[pl.ind - 19] = null;
            }
            gp.gameState=gp.playState;
            reset_players_key_pressed();
            gp.obj[pl.ind]=null;
            pl.update();
           
            System.out.println(pl.ind);
        
            
        }
        else {
            gp.gameState=gp.playState;
            reset_players_key_pressed();
            this.setVisible(false);
        }
       
    }//GEN-LAST:event_Second_QuestionActionPerformed
    
    private void Third_QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Third_QuestionActionPerformed
    
        if(Third_Question.getText().equals(op[correctAns])) {
       
          this.setVisible(false); 
          try {
                gp.obj[pl.ind + 19] = null;
            } catch (Exception e) {
                gp.obj[pl.ind - 19] = null;
            }
            gp.gameState=gp.playState;
            reset_players_key_pressed();
            gp.obj[pl.ind]=null;
            System.out.println(pl.ind);
            pl.update();
            
            
            
        
        }
        else {
            gp.gameState=gp.playState;
            reset_players_key_pressed();
            this.setVisible(false);
            
        }
        
    }//GEN-LAST:event_Third_QuestionActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton First_Question;
    private javax.swing.JLabel Questionn;
    private javax.swing.JButton Second_Question;
    private javax.swing.JButton Third_Question;
    // End of variables declaration//GEN-END:variables
}
