package gr.aueb.dmst.mazegame;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class SuperObj {

	public BufferedImage image;
	public String name;
	public boolean collision = false;
	public int worldX, worldY;
	public Rectangle solidArea = new Rectangle(0,0,48,48);
	public int solidAreaDefaultX = 0;
	public int solidAreaDefaultY = 0;	
	
	public void draw(Graphics2D g2,GamePanel gp) {
		int screenX = worldX - gp.pl.lx + gp.pl.screenX;
		int screenY = worldY - gp.pl.ly + gp.pl.screenY;

		if (worldX + gp.tileSize > gp.pl.lx - gp.pl.screenX && worldX - gp.tileSize < gp.pl.lx + gp.pl.screenX
				&& worldY + gp.tileSize > gp.pl.ly - gp.pl.screenY
				&& worldY - gp.tileSize < gp.pl.ly + gp.pl.screenY) {

			g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
		}
	}
}
