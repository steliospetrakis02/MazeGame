package gr.aueb.dmst.mazegame;
import java.awt.image.*;
import java.awt.Rectangle;
public class Entity {
    public int lx, ly;
	public int speed;
	public BufferedImage up1;
	public String direction;
	public Rectangle solidArea; 
	public boolean collisionOn = false;
}
