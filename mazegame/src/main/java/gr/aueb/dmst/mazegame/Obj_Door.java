package gr.aueb.dmst.mazegame;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Obj_Door extends SuperObj{

	public Obj_Door() {
		name = "Door";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("door.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
