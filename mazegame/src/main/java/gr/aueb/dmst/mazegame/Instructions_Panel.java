package gr.aueb.dmst.mazegame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Instructions_Panel extends JPanel {
	    final int originalTilesSize =16;
	    final int scale = 3;

	    final int tileSize = originalTilesSize * scale;
	    final int MaxScreenCol = 16;
	    final int MaxScreenRow = 12;
	    final int screenWidth = tileSize * MaxScreenCol;
	    final int screenHeight = tileSize * MaxScreenRow;
	    
	public Instructions_Panel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}
}
