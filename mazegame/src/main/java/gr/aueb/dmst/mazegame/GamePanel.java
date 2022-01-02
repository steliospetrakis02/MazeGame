package gr.aueb.dmst.mazegame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.security.Key;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    Thread gamThread;
    KeyListe keyl = new KeyListe();
    public Player pl = new Player(this, keyl);
    public TileMng tileMng = new TileMng(this);
    public CollisionCheck colch = new CollisionCheck(this);
    public ObjSetter os = new ObjSetter(this);
    public SuperObj obj[] = new SuperObj[30];
	
	  //GAME STATE 
    public int gameState;
    public final int playState = 1;
    public final int pauseState = 2;

    final int originalTilesSize =16;
    final int scale = 3;

    final int tileSize = originalTilesSize * scale;
    final int MaxScreenCol = 16;
    final int MaxScreenRow = 12;
    final int screenWidth = tileSize * MaxScreenCol;
    final int screenHeight = tileSize * MaxScreenRow;

    // Labyrinth settings
	public final int maxLCol = 60;
	public final int maxLRow = 55;
	public final int lWidth = tileSize * maxLCol;
	public final int lHeight = tileSize * maxLRow;


        //FPS
        int FPS=60;


    public GamePanel() { 

        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
        this.addKeyListener(keyl);
    }

    public void setupD() {
    	os.setObject();
	gameState = playState; //changed
    }
	
    public void StartGameThread() {

        gamThread = new Thread(this);
        gamThread.start();
    }
    
    @Override
    public void run() {
        
        double drawInternval = 1000000000/FPS;
        double nextDrawTime = System.nanoTime() + drawInternval;

        while(gamThread != null) {

            //long currentTime = System.nanoTime();

            update();


            repaint();

            try {
                double remainningTime = nextDrawTime - System.nanoTime();
                remainningTime = remainningTime/1000000;

                if(remainningTime < 0) {
                    remainningTime=0;
                }

                Thread.sleep((long) remainningTime);

                nextDrawTime +=drawInternval;

            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
        
    }

    public void update() {
	    if(gameState == playState ) {
    		 pl.update();
    	}
        if(gameState == pauseState) {
            //do nothing
         
        }
    
    }

    public void paintComponent(Graphics g1) {

        super.paintComponent(g1);

        Graphics2D g2 = (Graphics2D)g1;

        tileMng.draw(g2);
	   
	//door
         for(int i = 0; i < obj.length; i++) {
        	 if(obj[i] != null) {
        		 obj[i].draw(g2,this);
        	 }
         }

        pl.draw(g2);
       
        g2.dispose();
    }
        

}
