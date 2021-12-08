package gr.aueb.dmst.mazegame;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class TileMng {
    
    GamePanel gmp;
    Tile[] tile;
    int mapTileNumpertxt[][];

    public TileMng(GamePanel gmp) {
        this.gmp=gmp;

        tile = new Tile[10];
        mapTileNumpertxt = new int[gmp.MaxScreenCol][gmp.MaxScreenRow];

        getTileImage();
        draw_Map();
    }

    public void getTileImage() {
       try {
           
        tile[0] = new Tile();
       tile[0].image=ImageIO.read(getClass().getResourceAsStream("grass.png"));
        //tile[0].image=ImageIO.read(getClass().getResourceAsStream("grass.png"));

        tile[1] = new Tile();
        tile[1].image=ImageIO.read(getClass().getResourceAsStream("wall.png"));
      //  tile[1].image=ImageIO.read(getClass().getResourceAsStream("wall.png"));

       } catch (Exception e) {
           e.printStackTrace();
       }
    }
    public void draw_Map() {
        try {
          InputStream is =getClass().getResourceAsStream("map.txt");
     //  InputStream is =getClass().getResourceAsStream("map.txt");
            BufferedReader b = new BufferedReader(new InputStreamReader(is));

            int col=0;
            int row=0;

            while(col<gmp.MaxScreenCol && row<gmp.MaxScreenRow) {

                String line = b.readLine();

                while(col<gmp.MaxScreenCol) {

                    String numbers[] = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNumpertxt[col][row]= num;

                    col++;

                }
                if(col==gmp.MaxScreenCol) {
                    col=0;
                    row++;
                }
            }

            b.close();
  
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    public void draw(Graphics2D g1) {
        
        int col = 0;
        int row = 0;
        int x = 0;
        int y =0;
        

            while(col < gmp.MaxScreenCol && row<gmp.MaxScreenRow) {

                int tileNum= mapTileNumpertxt[col][row];
                
                g1.drawImage(tile[tileNum].image, x, y, gmp.tileSize,gmp.tileSize, null);
                col++;
                x+= gmp.tileSize;

                if(col== gmp.MaxScreenCol) {
                    col=0;
                    x=0;
                    row++;
                    y+=gmp.tileSize;
                }
            }


       /*for(int i=0;i<16;i++) {
            
            for(int z=0;z<16;z++) {
                g1.drawImage(tile[0].image, calx, 0, gmp.tileSize, gmp.tileSize, null);
                g1.drawImage(tile[0].image, calx, 48, gmp.tileSize, gmp.tileSize, null);
                g1.drawImage(tile[0].image, calx, 96, gmp.tileSize, gmp.tileSize, null);
                g1.drawImage(tile[0].image, calx, 144, gmp.tileSize, gmp.tileSize, null);
                g1.drawImage(tile[0].image, calx, 192, gmp.tileSize, gmp.tileSize, null);
                g1.drawImage(tile[0].image, calx, 240, gmp.tileSize, gmp.tileSize, null);
                g1.drawImage(tile[0].image, calx, 288, gmp.tileSize, gmp.tileSize, null);
                g1.drawImage(tile[0].image, calx, 336, gmp.tileSize, gmp.tileSize, null);
                g1.drawImage(tile[0].image, calx, 384, gmp.tileSize, gmp.tileSize, null);
                g1.drawImage(tile[0].image, calx, 432, gmp.tileSize, gmp.tileSize, null);
                g1.drawImage(tile[0].image, calx, 480, gmp.tileSize, gmp.tileSize, null);
                g1.drawImage(tile[0].image, calx, 528, gmp.tileSize, gmp.tileSize, null);
            
                calx=calx+48;
                
              
            }
              
        }
        for(int i =0;i<8;i++) {
            g1.drawImage(tile[1].image, calxwall, 0, gmp.tileSize, gmp.tileSize, null);
            g1.drawImage(tile[1].image, calxwall, 192, gmp.tileSize, gmp.tileSize, null);

            calxwall=calxwall+48;
        }
        //g1.drawImage(tile[1].image, 336, 48, gmp.tileSize, gmp.tileSize, null);
        g1.drawImage(tile[1].image, 336, 48, gmp.tileSize, gmp.tileSize, null);
        g1.drawImage(tile[1].image, 336, 144, gmp.tileSize, gmp.tileSize, null);
        */
    }
        
        
}


