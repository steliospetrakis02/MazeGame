package gr.aueb.dmst.mazegame;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Obj_Door2 extends SuperObj{
	public Obj_Door2() {
		name = "Door2";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("door2.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
