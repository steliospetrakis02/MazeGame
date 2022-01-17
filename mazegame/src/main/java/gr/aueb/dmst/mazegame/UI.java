package gr.aueb.dmst.mazegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.text.DecimalFormat;

public class UI {

	GamePanel gp;
	Font arial_30;
	Font arial_40;
	
	public boolean gameFinished = false;
	
	double playTime;
	DecimalFormat dFormat = new DecimalFormat("#0.00");
	
	public UI(GamePanel gp) {
		this.gp = gp;
		arial_30 = new Font("Arial", Font.PLAIN, 30);
		arial_40 = new Font("Arial", Font.PLAIN, 40);
	}
	
	public void draw(Graphics2D g2) {
		
		if(gameFinished == true) {
			g2.setFont(arial_40);
			g2.setColor(Color.yellow);
			String text;
			int textLength;
			int x;
			int y;
			if(playTime > 120.00) {//player loses if 2 mins pass 
				text = "Δυστυχώς δεν τα κατάφερες!";
				textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
				x = gp.screenWidth/2 - textLength/2;
			    y = gp.screenHeight/2 - (gp.tileSize*3);
				g2.drawString(text, x, y);
				
			}else {
				text = "Συγχαρητήρια, βγήκες από τον λαβύρινθο!";
				textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
				x = gp.screenWidth/2 - textLength/2;
			    y = gp.screenHeight/2 - (gp.tileSize*3);
				g2.drawString(text, x, y);
				
			}	//displaying the play time
				g2.setFont(arial_30);
				g2.setColor(Color.white);
				text = "Ο χρόνος που χρειάστηκες είναι: "+ dFormat.format(playTime) + "!";
				textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
				x = gp.screenWidth/2 - textLength/2;
			    y = gp.screenHeight/2 + (gp.tileSize*3);
				g2.drawString(text, x, y);

                         gp.gamThread = null;
			
			
		       } else {
			       g2.setFont(arial_30);
			       g2.setColor(Color.white);
			
			      //TIME 
			      playTime +=(double)1/60;
			      g2.drawString("Time: "+ dFormat.format(playTime), gp.tileSize*11, 65);
		       }
		
		
	}
}
