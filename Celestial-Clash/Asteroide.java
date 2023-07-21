import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroide extends Actor
{
    /**
     * Act - do whatever the Asteroide wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. hola. 
     */
    public void act()
    {
        move(2);
        World m = getWorld();
        if (m == null){
            return;
        }
        
        if(getX()>=m.getWidth()-5||getX()<=5)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        
    }
}
