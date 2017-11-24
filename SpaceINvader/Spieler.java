import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spieler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spieler extends Actor
{
    /**
     * Act - do whatever the Spieler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int temp=20;
    Spieler(){
       setImage("imafges.png");
       getImage().scale(60,40);
      
    }
    public void act() 
    {
        // Add your action code here.
      
        bewegen();
       gewinnen();
        schießen();
    
    }
    public void bewegen(){
        
         if(Greenfoot.isKeyDown("right")){
        move(7);
  
    }
        if(Greenfoot.isKeyDown("left")){ 
        move(-7);
       
    }   
    }
    public void schießen(){
      if(temp>5){
          temp--;
        }
       if(temp==5){
        if(Greenfoot.isKeyDown("w")){
          Schuss spielerSchuss=new Schuss("spielerSchuss.png");
          getWorld().addObject(spielerSchuss,getX(),getY()-15);
          spielerSchuss.setRotation(270);
         temp=20;
        
        }
    }
    }
     public void gewinnen(){
        if(getWorld().numberOfObjects()==1){
            getWorld().showText("Mission Accomplished",getWorld().getWidth()/2,getWorld().getHeight()/2);
            zumEndeFahren();
        }
      
    }
     public void zumEndeFahren(){
       for(int i=0;i<5;i++){
           move(1);
        }
        Greenfoot.delay(2);
        if(isAtEdge()){
            ZweitesLevel world = new ZweitesLevel();
            Greenfoot.setWorld(world);
            Greenfoot.stop();
        }
     
     }
}
