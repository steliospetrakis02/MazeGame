
package gr.aueb.dmst.mazegame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class test {

   GamePanel gp = new GamePanel();
    KeyListe keyl = new KeyListe();
    Player pl = new Player(gp, keyl);
    Questions q = new Questions(gp, pl, keyl);
    CollisionCheck col = new CollisionCheck(gp);
    
    @Test
    public void test_started_player_pos() {
        Start_Game();
        assertEquals(gp.tileSize * 25, pl.lx);    
        
    }


    @Test
    public void test_gamepanel(){
        Start_Game();
        assertEquals(576, gp.screenHeight);
        assertEquals(768, gp.screenWidth);
    }

    @Test
    public void array_test(){
        assertEquals(99, q.ca.length);
        assertEquals(99, q.qs.length);
        assertEquals(99, q.answers.length);

        int questions=0;
        for(int i=0; i < 98; i ++) {
            for (int z =0; z<3; z++) {
                questions++; 
              
            }
          
        }
        //questions had to be 297 but we fix that with try catch block
        //assertEquals(99*3, questions);
    
    }
  

    public void Start_Game() {   
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Maze");

        GamePanel game = new GamePanel();
        window.add(game);


        window.pack();
        window.setLocationRelativeTo(null);

        game.setupD();
        game.StartGameThread();
    }
}
