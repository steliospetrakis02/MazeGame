package gr.aueb.dmst.mazegame;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
public class Player extends Entity {
    
    GamePanel gp;
    KeyListe keyL;
    
    public final int screenX;
	public final int screenY;

    public Player(GamePanel gp , KeyListe keyL) {

        this.gp=gp;
        this.keyL = keyL;
        
        screenX = gp.screenWidth / 2 - (gp.tileSize / 2);
		screenY = gp.screenHeight / 2 - (gp.tileSize / 2);

		solidArea = new Rectangle(8, 16, 32, 32);//collision setting 

        setDefaltValues();
        getPlayerImage();
    }
    public void getPlayerImage() {
        try {
            System.out.println("try catch ");
       
       up1=ImageIO.read(getClass().getResourceAsStream("boy_down_1.png"));
    
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no image");
            System.exit(1);
        }
    }
    BufferedImage img;
    private void loadImage(String str) {
        try {
            img = ImageIO.read(MainFrame.class.getResource(str));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void setDefaltValues() {

        lx = gp.tileSize * 17;
        ly = gp.tileSize * 33;
        speed=4;
        direction = "down";
    }

    public void update() {
        
        if(keyL.upPres == true) {
            direction = "up";
        }
        else if(keyL.dwnPres == true) {
            direction = "down";
        }
        else if(keyL.leftPres == true) {
            direction = "left";
        }
        else if(keyL.rightPres == true) {
            direction = "right";
        }
        // checking tile collision
		collisionOn = false;
		gp.colch.checkTile(this);
        
        // if collision is false, player can move
		if (collisionOn == false) {
			switch (direction) {
			case "up":
				ly -= speed;
				break;
			case "down":
				ly += speed;
				break;
			case "left":
				lx -= speed;
				break;
			case "right":
				lx += speed;
				break;
			}
		}

        
    }

    public void draw(Graphics g2) {

       // g2.setColor(Color.white);

       // g2.fillRect(x, y, gp.tileSize, gp.tileSize);

        BufferedImage image = null;

        switch(direction ) {
            case "up":
                image =up1;
                break;
            case "down":
                image =up1;
                break;
            case "left":
                image =up1;
                break;
            case "right":
                image =up1;
                break;
        }

        g2.drawImage(image, screenX, screenY, gp.tileSize , gp.tileSize,null);

    }
}
