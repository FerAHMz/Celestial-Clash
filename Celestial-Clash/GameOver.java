import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    String mensaje; 
    private GreenfootSound music; 
    
    public GameOver()
    {
        imagen=new GreenfootImage(400,300);
        imagen.setColor(new Color(250,100,0,255));
        imagen.setFont(new Font("Verdana",34));
        imagen.drawString("Game Over",100,30);
        setImage(imagen);
        Greenfoot.stop();
        music = new GreenfootSound("GameOver.mp3");  
        music.setVolume(100); 
        music.play(); 
    }
    
    public void act()
    {
     
    }
}
