/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gierka.gfx;

import java.awt.image.BufferedImage;

/**
 *
 * @author KUBA
 */
public class Assets {
    
    public static final int width = 32, height = 32;
    public static BufferedImage  dirt, grass, stone, tree;
    public static BufferedImage[] player_down, player_up, player_right, player_left;
    
    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
        
        player_down=new BufferedImage[2];
        player_up=new BufferedImage[2];
        player_right=new BufferedImage[2];
        player_left=new BufferedImage[2];
        
        player_down[0]=sheet.crop(width*4, 0, width, height);
        player_down[1]=sheet.crop(width*5, 0, width, height);
        
        player_up[0]=sheet.crop(width*6, 0, width, height);
        player_up[1]=sheet.crop(width*7, 0, width, height);
        
        player_right[0]=sheet.crop(width*4, height, width, height);
        player_right[1]=sheet.crop(width*5, height, width, height);
        
        player_left[0]=sheet.crop(width*6, height, width, height);
        player_left[1]=sheet.crop(width*7, height, width, height);
        

        
        dirt = sheet.crop(width,0,width,height);
        grass = sheet.crop(width*2,0,width,height);
        stone = sheet.crop(width*3,0,width,height);
        tree = sheet.crop(0,height,width,height);
    }
    
}
