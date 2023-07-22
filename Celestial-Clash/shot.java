import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class shot extends Actor
{
     public static final int RIGHT = 0;
    public static final int DOWN = 90;
    public static final int LEFT = 180;
    public static final int UP = 270;

    int shotImage = 1;
    int speedShot = 6;
    int position;
    
    public shot(int rotation){
        this.position = rotation;
    }

    public void act() {
        if (getWorld() == null) {
            return;
        }

        switch(position){
            case RIGHT:
                setLocation(getX()+speedShot,getY());
                break;
            case DOWN:
                setLocation(getX(),getY()+speedShot);
                break;
            case LEFT:
                setLocation(getX()-speedShot,getY());
                break;
            case UP:
                setLocation(getX(),getY()-speedShot);
                break;
        }

        Actor Asteroide=getOneObjectAtOffset(0,0,Asteroide.class);
        
        if(Asteroide!=null){
            MyWorld esp=(MyWorld)getWorld();
            esp.puntos.incrementar();
            getWorld().removeObject(Asteroide);
            esp.removeObject(this);
        }

        if (getWorld() != null && ((getX()>=getWorld().getWidth()-5)||(getX()<=5))){
            getWorld().removeObject(this);
        } else {
            if (getWorld() != null && ((getY()>=getWorld().getHeight()-5)||(getY()<=5))){
                getWorld().removeObject(this);
            } else {
                if(shotImage<16)
                    shotImage++;
                else
                    shotImage=1;
            }
        }
    }
}
