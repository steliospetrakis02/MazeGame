package gr.aueb.dmst.mazegame;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Obj_Flag extends SuperObj{
	public Obj_Flag() {
		name = "Flag";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("flag.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
