package gr.aueb.dmst.mazegame;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class TileMng {
    
    GamePanel gmp;
    public Tile[] tile;
    public int mapTileNumpertxt[][];

    public TileMng(GamePanel gmp) {
        this.gmp=gmp;

        tile = new Tile[10];
        mapTileNumpertxt = new int[gmp.maxLCol][gmp.maxLRow];

        getTileImage();
        draw_Map();
    }

    public void getTileImage() {
       try {
           
        tile[0] = new Tile();
        tile[0].image=ImageIO.read(getClass().getResourceAsStream("wall.png"));
        tile[0].collision = true;

        tile[1] = new Tile();
        tile[1].image=ImageIO.read(getClass().getResourceAsStream("grass_maze.png"));
        //obj door will be drawn on top of the grass tile
        tile[2] = new Tile();
        tile[2].image=ImageIO.read(getClass().getResourceAsStream("grass_maze.png"));
     
        //obj door will be drawn on top of the grass tile
        tile[3] = new Tile();
        tile[3].image=ImageIO.read(getClass().getResourceAsStream("grass_maze.png"));
	       
	//obj flag will be drawn on top of the grass tile
        tile[4] = new Tile();
        tile[4].image=ImageIO.read(getClass().getResourceAsStream("grass_maze.png"));
	       
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
    public void draw_Map() {
        try {
            InputStream is =getClass().getResourceAsStream("Lavirinthos-sxediagramma.txt");
            BufferedReader b = new BufferedReader(new InputStreamReader(is));

            int col=0;
            int row=0;

            while (col < gmp.maxLCol && row < gmp.maxLRow) {

                String line = b.readLine();

                while(col<gmp.maxLCol) {

                    String numbers[] = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNumpertxt[col][row]= num;

                    col++;

                }
                if(col==gmp.maxLCol) {
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
       
        

           while (col < gmp.maxLCol && row < gmp.maxLRow) {

			int tileNum = mapTileNumpertxt[col][row];

			int LabX = col * gmp.tileSize;
			int LabY = row * gmp.tileSize;
			int screenX = LabX - gmp.pl.lx + gmp.pl.screenX;
			int screenY = LabY - gmp.pl.ly + gmp.pl.screenY;

			if (LabX + gmp.tileSize > gmp.pl.lx - gmp.pl.screenX && LabX - gmp.tileSize < gmp.pl.lx + gmp.pl.screenX
					&& LabY + gmp.tileSize > gmp.pl.ly - gmp.pl.screenY
					&& LabY - gmp.tileSize < gmp.pl.ly + gmp.pl.screenY) {

				g1.drawImage(tile[tileNum].image, screenX, screenY, gmp.tileSize, gmp.tileSize, null);
			}
			col++;

			if (col == gmp.maxLCol) {
				col = 0;
				row++;
			}
		}

    }
        
        
}


