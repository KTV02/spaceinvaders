import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Schüsse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Schuss extends Actor
{
    /**
     * Act - do whatever the Schüsse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Schuss(String img){
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
        move(5);
        toeten();
        verschwinden();
       
       
    }  
    public void verschwinden(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    public void toeten(){
        if(isTouching(Gegner.class)){
            removeTouching(Gegner.class);
        }
    }
   
    }

