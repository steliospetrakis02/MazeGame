package gr.aueb.dmst.mazegame;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
public class Player extends Entity {
    
    GamePanel gp;
    KeyListe keyL;

    public Player(GamePanel gp , KeyListe keyL) {

        this.gp=gp;
        this.keyL = keyL;

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

        x=100;
        y=100;
        speed=4;
        direction = "down";
    }

    public void update() {
        
        if(keyL.upPres == true) {
            direction = "up";
            y -= speed;
        
        }
        else if(keyL.dwnPres == true) {
            direction = "down";
            y +=speed;
            
        }
        else if(keyL.leftPres == true) {
            direction = "left";
            x -=speed;
            
        }
        else if(keyL.rightPres == true) {
            direction = "right";
            x+=speed;
            
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

        g2.drawImage(image, x, y, gp.tileSize , gp.tileSize,null);

    }
}
