package gr.aueb.dmst.mazegame;

import gr.aueb.dmst.mazegame.Entity;

public class CollisionCheck {

	GamePanel gp;

	public CollisionCheck(GamePanel gp) {
		this.gp = gp;
	}

	public void checkTile(gr.aueb.dmst.mazegame.Entity ent) {
		// player's solid area coordinates
		int eLeftX = ent.lx + ent.solidArea.x;
		int eRightX = ent.lx + ent.solidArea.x + ent.solidArea.width;
		int eTopY = ent.ly + ent.solidArea.y;
		int eBottomY = ent.ly + ent.solidArea.y + ent.solidArea.height;

		// coordinate's col and row
		int eLeftCol = eLeftX / gp.tileSize;
		int eRightCol = eRightX / gp.tileSize;
		int eTopRow = eTopY / gp.tileSize;
		int eBottomRow = eBottomY / gp.tileSize;

		int tileNum1, tileNum2; // tiles that need to be checked each time

		// predicting if the player is going to hit a solid object
		switch (ent.direction) {
		case "up":
			eTopRow = (eTopY - ent.speed) / gp.tileSize;
			tileNum1 = gp.tileMng.mapTileNumpertxt[eLeftCol][eTopRow];
			tileNum2 = gp.tileMng.mapTileNumpertxt[eRightCol][eTopRow];
			if (gp.tileMng.tile[tileNum1].collision == true || gp.tileMng.tile[tileNum2].collision == true) {
				ent.collisionOn = true;
			}
			break;
		case "down":
			eBottomRow = (eBottomY + ent.speed) / gp.tileSize;
			tileNum1 = gp.tileMng.mapTileNumpertxt[eLeftCol][eBottomRow];
			tileNum2 = gp.tileMng.mapTileNumpertxt[eRightCol][eBottomRow];
			if (gp.tileMng.tile[tileNum1].collision == true || gp.tileMng.tile[tileNum2].collision == true) {
				ent.collisionOn = true;
			}
			break;
		case "left":
			eLeftCol = (eLeftX - ent.speed) / gp.tileSize;
			tileNum1 = gp.tileMng.mapTileNumpertxt[eLeftCol][eTopRow];
			tileNum2 = gp.tileMng.mapTileNumpertxt[eLeftCol][eBottomRow];
			if (gp.tileMng.tile[tileNum1].collision == true || gp.tileMng.tile[tileNum2].collision == true) {
				ent.collisionOn = true;
			}
			break;
		case "right":
			eRightCol = (eRightX + ent.speed) / gp.tileSize;
			tileNum1 = gp.tileMng.mapTileNumpertxt[eLeftCol][eTopRow];
			tileNum2 = gp.tileMng.mapTileNumpertxt[eRightCol][eBottomRow];
			if (gp.tileMng.tile[tileNum1].collision == true || gp.tileMng.tile[tileNum2].collision == true) {
				ent.collisionOn = true;
			}
			break;
		}
	}
	//CHECKING IF THE PLAYER IS HITTING AN OBJ
	public int checkObj(Entity entity,boolean player) {
		int index = 999;
		
		for(int i = 0; i < gp.obj.length; i++) {
			if(gp.obj[i] != null) {
				//entity's solid area position
				entity.solidArea.x = entity.lx + entity.solidArea.x;
				entity.solidArea.y = entity.ly + entity.solidArea.y;
				//object's solid area position
				gp.obj[i].solidArea.x = gp.obj[i].worldX + gp.obj[i].solidArea.x;
				gp.obj[i].solidArea.y = gp.obj[i].worldY + gp.obj[i].solidArea.y;
			
				switch(entity.direction) {
				case "up":
					entity.solidArea.y -= entity.speed;
					if(entity.solidArea.intersects(gp.obj[i].solidArea)) {
						if(gp.obj[i].collision == true) {
							entity.collisionOn = true;
						}
						if(player == true) {
							index = i;
						}
					}
					break;
				case "down":
					entity.solidArea.y += entity.speed;
					if(entity.solidArea.intersects(gp.obj[i].solidArea)) {
						if(gp.obj[i].collision == true) {
							entity.collisionOn = true;
						}
						if(player == true) {
							index = i;
						}
					}
					break;
				case "left":
					entity.solidArea.x -= entity.speed;
					if(entity.solidArea.intersects(gp.obj[i].solidArea)) {
						if(gp.obj[i].collision == true) {
							entity.collisionOn = true;
						}
						if(player == true) {
							index = i;
						}
					}
					break;
				case "right":
					entity.solidArea.x += entity.speed;
					if(entity.solidArea.intersects(gp.obj[i].solidArea)) {
						if(gp.obj[i].collision == true) {
							entity.collisionOn = true;
						}
						if(player == true) {
							index = i;
						}
					}
					break;
				}
				entity.solidArea.x = entity.solidAreaDefaultX;
				entity.solidArea.y = entity.solidAreaDefaultY;
			    gp.obj[i].solidArea.x = gp.obj[i].solidAreaDefaultX;
			    gp.obj[i].solidArea.y = gp.obj[i].solidAreaDefaultY;
			}
		}
		
		
		return index;
	}
}
