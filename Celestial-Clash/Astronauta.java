import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Astronauta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Astronauta extends Actor
{
    public static final int UP = 270;
    public static final int DOWN = 90;
    public static final int LEFT = 180;
    public static final int RIGHT = 0;
    private GreenfootSound musics;
    boolean isShot = false;
    

    /**
     * Act - do whatever the Astronauta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Astronauta() { 
        musics = new GreenfootSound("Disparo.mp3"); 
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            setDirection(UP);
        }
        if(Greenfoot.isKeyDown("down")){
            setDirection(DOWN);
        }
        if(Greenfoot.isKeyDown("left")){
            setDirection(LEFT);
        }
        if(Greenfoot.isKeyDown("right")){
            setDirection(RIGHT);
        }// Add your action code here.
          setShot();
    }
      public void setShot() {
        if(isShot && Greenfoot.isKeyDown("x")) {
            shot s1 = new shot(getRotation());
            getWorld().addObject(s1, getX(), getY());
            isShot = false; 
            //musics.play(); 
            //musics.setVolume(100);  
            if(!musics.isPlaying()){  
                Thread soundThread = new Thread(() -> {  
                    musics.play(); 
                }); 
                soundThread.start(); 
            }
        }
        if(!isShot && !Greenfoot.isKeyDown("x")) {
            isShot = true;
        }
    }
    public void setDirection(int direction){
        switch(direction){
            case UP:
                setRotation(UP);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX(), getY()-10);
                }else{
                    setLocation(getX(), getY()-1);
                }
                break;
            case DOWN:
                setRotation(DOWN);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX(), getY()+10);
                }else{
                    setLocation(getX(), getY()+1);
                }
                break;
            case LEFT:
                setRotation(LEFT);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX()-10, getY());
                }else{
                    setLocation(getX()-1, getY());
                }
                break;
            case RIGHT:
                setRotation(RIGHT);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX()+10, getY());
                }else{
                    setLocation(getX()+1, getY());
                }
                break;
        }
    }
}
