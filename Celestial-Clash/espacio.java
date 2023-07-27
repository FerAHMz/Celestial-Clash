import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class espacio extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public lifes objLife;
    Tablero puntos;
    Tablero vidas;
    public espacio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setPaintOrder(GameOver.class,Tablero.class,Asteroide.class,Astronauta.class);
        Astronauta n1=new Astronauta();
        addObject(n1,50,300);
        crearAsteroides(25);
        objLife=new lifes();
        puntos=new Tablero(0,"Puntaje: ");
        vidas=new Tablero(3,"Vidas: ");
        addObject(puntos,150,85);
        addObject(vidas,300,85);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void crearAsteroides(int numero)
    {
        for(int i=0; i<numero; i++)
        {
            Asteroide a=new Asteroide();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getWidth());
            addObject(a,x,y);
        }
    }
}
