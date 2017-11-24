import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gegner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Gegner extends Actor
{
    /**
     * Act - do whatever the Gegner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int tempMove;
    
    Gegner(String bild){
        setImage(bild);
      
    }
    public void act() 
    {
        // Add your action code here.
        bewegen();

        
    }    
    public void bewegen(){
    if(tempMove<39){
     move(2);
     tempMove++;
    }
    if(tempMove>=39){
        move(-2);
        tempMove++;
    }
    if(tempMove==78){
        tempMove=0;
    }
}

}
