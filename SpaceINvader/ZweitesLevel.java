import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZweitesLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZweitesLevel extends World
{

    /**
     * Constructor for objects of class ZweitesLevel.
     * 
     */
      int tempX;
   int tempY=10;
    public ZweitesLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
         addObject(new Spieler(),300,370);
         for(int i =0;i<5;i++){
          addObject(new Gegner("Gegner1.png"),tempX,tempY);
          tempX+=100;
          
        }
    }
}
