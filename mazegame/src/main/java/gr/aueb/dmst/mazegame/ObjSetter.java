package gr.aueb.dmst.mazegame;

public class ObjSetter {

	GamePanel gp;
	
	public ObjSetter(GamePanel gp) {
		this.gp = gp;
	}
	//setting the objects' placement on the labyrinth map
	public void setObject() {
		gp.obj[0] = new Obj_Door(); 
		gp.obj[0].worldX = 30 * gp.tileSize;
		gp.obj[0].worldY = 9 * gp.tileSize;
		
		gp.obj[1] = new Obj_Flag(); 
		gp.obj[1].worldX = 30 * gp.tileSize;
		gp.obj[1].worldY = 7 * gp.tileSize;
		
		gp.obj[3] = new Obj_Door(); 
		gp.obj[3].worldX = 16 * gp.tileSize;
		gp.obj[3].worldY = 13 * gp.tileSize;
		
		gp.obj[4] = new Obj_Door(); 
		gp.obj[4].worldX = 41 * gp.tileSize;
		gp.obj[4].worldY = 16 * gp.tileSize;
		
		gp.obj[5] = new Obj_Door(); 
		gp.obj[5].worldX = 44 * gp.tileSize;
		gp.obj[5].worldY = 18 * gp.tileSize;
		
		gp.obj[6] = new Obj_Door(); 
		gp.obj[6].worldX = 20 * gp.tileSize;
		gp.obj[6].worldY = 21 * gp.tileSize;
		
		gp.obj[7] = new Obj_Door(); 
		gp.obj[7].worldX = 34 * gp.tileSize;
		gp.obj[7].worldY = 21 * gp.tileSize;
		
		gp.obj[8] = new Obj_Door(); 
		gp.obj[8].worldX = 12 * gp.tileSize;
		gp.obj[8].worldY = 23 * gp.tileSize;
		
		gp.obj[9] = new Obj_Door(); 
		gp.obj[9].worldX = 28 * gp.tileSize;
		gp.obj[9].worldY = 25 * gp.tileSize;
		
		gp.obj[10] = new Obj_Door(); 
		gp.obj[10].worldX = 45 * gp.tileSize;
		gp.obj[10].worldY = 27 * gp.tileSize;
		
		gp.obj[11] = new Obj_Door(); 
		gp.obj[11].worldX = 50 * gp.tileSize;
		gp.obj[11].worldY = 27 * gp.tileSize;
		
		gp.obj[12] = new Obj_Door(); 
		gp.obj[12].worldX = 25 * gp.tileSize;
		gp.obj[12].worldY = 30 * gp.tileSize;
		
		gp.obj[13] = new Obj_Door(); 
		gp.obj[13].worldX = 12 * gp.tileSize;
		gp.obj[13].worldY = 32 * gp.tileSize;
		
		gp.obj[14] = new Obj_Door(); 
		gp.obj[14].worldX = 28 * gp.tileSize;
		gp.obj[14].worldY = 32 * gp.tileSize;
		
		gp.obj[15] = new Obj_Door(); 
		gp.obj[15].worldX = 40 * gp.tileSize;
		gp.obj[15].worldY = 32 * gp.tileSize;
		
		gp.obj[16] = new Obj_Door(); 
		gp.obj[16].worldX = 45 * gp.tileSize;
		gp.obj[16].worldY = 34 * gp.tileSize;
		
		gp.obj[17] = new Obj_Door(); 
		gp.obj[17].worldX = 12 * gp.tileSize;
		gp.obj[17].worldY = 35 * gp.tileSize;
		
		gp.obj[18] = new Obj_Door(); 
		gp.obj[18].worldX = 50 * gp.tileSize;
		gp.obj[18].worldY = 39 * gp.tileSize;
		
		gp.obj[19] = new Obj_Door(); 
		gp.obj[19].worldX = 15 * gp.tileSize;
		gp.obj[19].worldY = 40 * gp.tileSize;
		
		gp.obj[20] = new Obj_Door(); 
		gp.obj[20].worldX = 36 * gp.tileSize;
		gp.obj[20].worldY = 40 * gp.tileSize;
		
		gp.obj[21] = new Obj_Door(); 
		gp.obj[21].worldX = 32 * gp.tileSize;
		gp.obj[21].worldY = 42 * gp.tileSize;
		
		gp.obj[22] = new Obj_Door2(); 
		gp.obj[22].worldX = 16 * gp.tileSize;
		gp.obj[22].worldY = 14 * gp.tileSize;
		
		gp.obj[23] = new Obj_Door2(); 
		gp.obj[23].worldX = 42 * gp.tileSize;
		gp.obj[23].worldY = 16 * gp.tileSize;
		
		gp.obj[24] = new Obj_Door2(); 
		gp.obj[24].worldX = 44 * gp.tileSize;
		gp.obj[24].worldY = 17 * gp.tileSize;
		
		gp.obj[25] = new Obj_Door2(); 
		gp.obj[25].worldX = 20 * gp.tileSize;
		gp.obj[25].worldY = 22 * gp.tileSize;
		
		gp.obj[26] = new Obj_Door2(); 
		gp.obj[26].worldX = 34 * gp.tileSize;
		gp.obj[26].worldY = 22 * gp.tileSize;
		
		gp.obj[27] = new Obj_Door2(); 
		gp.obj[27].worldX = 12 * gp.tileSize;
		gp.obj[27].worldY = 24 * gp.tileSize;
		
		gp.obj[28] = new Obj_Door2(); 
		gp.obj[28].worldX = 28 * gp.tileSize;
		gp.obj[28].worldY = 26 * gp.tileSize;
		
		gp.obj[29] = new Obj_Door2(); 
		gp.obj[29].worldX = 46 * gp.tileSize;
		gp.obj[29].worldY = 27 * gp.tileSize;
		
		gp.obj[30] = new Obj_Door2(); 
		gp.obj[30].worldX = 51 * gp.tileSize;
		gp.obj[30].worldY = 27 * gp.tileSize;
		
		gp.obj[31] = new Obj_Door2(); 
		gp.obj[31].worldX = 26 * gp.tileSize;
		gp.obj[31].worldY = 30 * gp.tileSize;
		
		gp.obj[32] = new Obj_Door2(); 
		gp.obj[32].worldX = 12 * gp.tileSize;
		gp.obj[32].worldY = 31 * gp.tileSize;
		
		gp.obj[33] = new Obj_Door2(); 
		gp.obj[33].worldX = 28 * gp.tileSize;
		gp.obj[33].worldY = 31 * gp.tileSize;
		
		gp.obj[34] = new Obj_Door2(); 
		gp.obj[34].worldX = 40 * gp.tileSize;
		gp.obj[34].worldY = 31 * gp.tileSize;
		
		gp.obj[35] = new Obj_Door2(); 
		gp.obj[35].worldX = 46 * gp.tileSize;
		gp.obj[35].worldY = 34 * gp.tileSize;
		
		gp.obj[36] = new Obj_Door2(); 
		gp.obj[36].worldX = 12 * gp.tileSize;
		gp.obj[36].worldY = 36 * gp.tileSize;
		
		gp.obj[37] = new Obj_Door2(); 
		gp.obj[37].worldX = 51 * gp.tileSize;
		gp.obj[37].worldY = 39 * gp.tileSize;
		
		gp.obj[38] = new Obj_Door2(); 
		gp.obj[38].worldX = 15 * gp.tileSize;
		gp.obj[38].worldY = 41 * gp.tileSize;
		
		gp.obj[39] = new Obj_Door2(); 
		gp.obj[39].worldX = 37 * gp.tileSize;
		gp.obj[39].worldY = 40 * gp.tileSize;
		
		gp.obj[40] = new Obj_Door2(); 
		gp.obj[40].worldX = 32 * gp.tileSize;
		gp.obj[40].worldY = 41 * gp.tileSize;
	
	}
}
