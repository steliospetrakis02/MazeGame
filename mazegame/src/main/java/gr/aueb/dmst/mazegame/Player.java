package gr.aueb.dmst.mazegame;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.util.Random;
public class Player extends Entity {
    
    GamePanel gp;
    KeyListe keyL;
    
    public final int screenX;
    public final int screenY;
    public int ind;

    public Player(GamePanel gp , KeyListe keyL) {

        this.gp=gp;
        this.keyL = keyL;
        
        screenX = gp.screenWidth / 2 - (gp.tileSize / 2);
	screenY = gp.screenHeight / 2 - (gp.tileSize / 2);

	solidArea = new Rectangle(8, 16, 32, 32);//collision setting 
        
	solidAreaDefaultX = solidArea.x;
	solidAreaDefaultY = solidArea.y;
        setDefaltValues();
        getPlayerImage();
    }
    public void getPlayerImage() {
        try {
       
        	up1 = ImageIO.read(getClass().getResourceAsStream("BOY_UP_1.png"));
		up2=ImageIO.read(getClass().getResourceAsStream("BOY_UP_2.png"));
		down1=ImageIO.read(getClass().getResourceAsStream("BOY_DOWN_1.png"));
		down2=ImageIO.read(getClass().getResourceAsStream("BOY_DOWN_2.png"));
		left1=ImageIO.read(getClass().getResourceAsStream("BOY_LEFT_1.png"));
		left2=ImageIO.read(getClass().getResourceAsStream("BOY_LEFT_2.png"));
		right1=ImageIO.read(getClass().getResourceAsStream("BOY_RIGHT_1.png"));
		right2=ImageIO.read(getClass().getResourceAsStream("BOY_RIGHT_2.png"));
    
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

         //where the player spawn
        lx = gp.tileSize * 25;
        ly = gp.tileSize * 38;
        speed=4;
        direction = "down";
    }

    public void update() {
      if (keyL.upPres == true || keyL.dwnPres == true || keyL.leftPres == true || keyL.rightPres == true) {  
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
	      
	 spriteCounter++;
	 if(spriteCounter > 12) {
	    if(spriteNum == 1) {
		spriteNum = 2;
	 } else if(spriteNum == 2) {
		spriteNum = 1;
	 }
		spriteCounter = 0;
	 }
        // checking tile collision
		collisionOn = false;
		gp.colch.checkTile(this);
	      
        //check object collision
            int objIndex = gp.colch.checkObj(this, true);
	    openDoor(objIndex);
        
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
    }
    
   public void openDoor(int ind) {
    	
     this.ind=ind;
    	if(ind != 999) {
       
    	String objName = gp.obj[ind].name;

	 switch (objName) {
	   case "Door":
	   case "Door2":
		gp.gameState = gp.pauseState;
		Random rand = new Random();
		int qn = rand.nextInt(98);
		Questions questions = new Questions(gp, this, keyL);
		questions.startQuestions(qn);
		break;
	  case "Flag":
		gp.ui.gameFinished = true;
		break;
	}
           
           
    	}
    }

    public void draw(Graphics g2) {

     

        BufferedImage image = null;

        switch(direction ) {
        case "up":
              if (spriteNum == 1) {
		image = up1;
	      }
	      if (spriteNum == 2) {
		image = up2;
	      }
                break;
            case "down":
               if (spriteNum == 1) {
		  image = down1;
		}
	       if (spriteNum == 2) {
		  image = down2;
		}
                break;
            case "left":
                if (spriteNum == 1) {
		    image = left1;
		}
		if (spriteNum == 2) {
		    image = left2;
		}
                break;
            case "right":
               if (spriteNum == 1) {
		   image = right1;
		}
		if (spriteNum == 2) {
		   image = right2;
		}
                break;
        }

        g2.drawImage(image, screenX, screenY, gp.tileSize , gp.tileSize,null);

    }
}
