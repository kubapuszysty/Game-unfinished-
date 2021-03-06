/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gierka.entities.statics;

import gierka.gfx.Assets;
import gierka.tiles.Tile;
import gierka.Handler;
import gierka.Handler;
import gierka.gfx.Assets;
import gierka.tiles.Tile;
import java.awt.Graphics;

/**
 *
 * @author KUBA
 */
public class Tree extends StaticEntity {

    public Tree(Handler handler, float x, float y) {
        super(handler,x,y,Tile.TILEWIDTH,Tile.TILEHEIGHT*2);
        
        bounds.x=10;
        bounds.y=(int)(height/1.5f);
        bounds.width=width-20;
        bounds.height=(int)(height-height/1.5f);
    }
    
    

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.tree, (int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
    }
    
}
