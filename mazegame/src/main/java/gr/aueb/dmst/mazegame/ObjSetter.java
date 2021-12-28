package gr.aueb.dmst.mazegame;

public class ObjSetter {

	GamePanel gp;
	
	public ObjSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		gp.obj[0] = new Obj_Door(); 
		gp.obj[0].worldX = 30 * gp.tileSize;
		gp.obj[0].worldY = 5 * gp.tileSize;
		
		gp.obj[1] = new Obj_Door(); 
		gp.obj[1].worldX = 29 * gp.tileSize;
		gp.obj[1].worldY = 5 * gp.tileSize;
		
		gp.obj[2] = new Obj_Door(); 
		gp.obj[2].worldX = 31 * gp.tileSize;
		gp.obj[2].worldY = 5 * gp.tileSize;
		
		gp.obj[3] = new Obj_Door(); 
		gp.obj[3].worldX = 16 * gp.tileSize;
		gp.obj[3].worldY = 9 * gp.tileSize;
		
		gp.obj[4] = new Obj_Door(); 
		gp.obj[4].worldX = 41 * gp.tileSize;
		gp.obj[4].worldY = 12 * gp.tileSize;
		
		gp.obj[5] = new Obj_Door(); 
		gp.obj[5].worldX = 44 * gp.tileSize;
		gp.obj[5].worldY = 14 * gp.tileSize;
		
		gp.obj[6] = new Obj_Door(); 
		gp.obj[6].worldX = 20 * gp.tileSize;
		gp.obj[6].worldY = 17 * gp.tileSize;
		
		gp.obj[7] = new Obj_Door(); 
		gp.obj[7].worldX = 34 * gp.tileSize;
		gp.obj[7].worldY = 17 * gp.tileSize;
		
		gp.obj[8] = new Obj_Door(); 
		gp.obj[8].worldX = 12 * gp.tileSize;
		gp.obj[8].worldY = 19 * gp.tileSize;
		
		gp.obj[9] = new Obj_Door(); 
		gp.obj[9].worldX = 28 * gp.tileSize;
		gp.obj[9].worldY = 21 * gp.tileSize;
		
		gp.obj[10] = new Obj_Door(); 
		gp.obj[10].worldX = 45 * gp.tileSize;
		gp.obj[10].worldY = 23 * gp.tileSize;
		
		gp.obj[11] = new Obj_Door(); 
		gp.obj[11].worldX = 50 * gp.tileSize;
		gp.obj[11].worldY = 23 * gp.tileSize;
		
		gp.obj[12] = new Obj_Door(); 
		gp.obj[12].worldX = 25 * gp.tileSize;
		gp.obj[12].worldY = 26 * gp.tileSize;
		
		gp.obj[13] = new Obj_Door(); 
		gp.obj[13].worldX = 12 * gp.tileSize;
		gp.obj[13].worldY = 28 * gp.tileSize;
		
		gp.obj[14] = new Obj_Door(); 
		gp.obj[14].worldX = 28 * gp.tileSize;
		gp.obj[14].worldY = 28 * gp.tileSize;
		
		gp.obj[15] = new Obj_Door(); 
		gp.obj[15].worldX = 40 * gp.tileSize;
		gp.obj[15].worldY = 28 * gp.tileSize;
		
		gp.obj[16] = new Obj_Door(); 
		gp.obj[16].worldX = 45 * gp.tileSize;
		gp.obj[16].worldY = 30 * gp.tileSize;
		
		gp.obj[17] = new Obj_Door(); 
		gp.obj[17].worldX = 12 * gp.tileSize;
		gp.obj[17].worldY = 31 * gp.tileSize;
		
		gp.obj[18] = new Obj_Door(); 
		gp.obj[18].worldX = 50 * gp.tileSize;
		gp.obj[18].worldY = 35 * gp.tileSize;
		
		gp.obj[19] = new Obj_Door(); 
		gp.obj[19].worldX = 15 * gp.tileSize;
		gp.obj[19].worldY = 36 * gp.tileSize;
		
		gp.obj[20] = new Obj_Door(); 
		gp.obj[20].worldX = 36 * gp.tileSize;
		gp.obj[20].worldY = 36 * gp.tileSize;
		
		gp.obj[21] = new Obj_Door(); 
		gp.obj[21].worldX = 32 * gp.tileSize;
		gp.obj[21].worldY = 38 * gp.tileSize;
	}
}
