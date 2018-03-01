import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private Base b1, b2;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(384, 512, 1, false); 
        addObject( new Bg(), getWidth()/2, getHeight()/2 - 70 );
        
        b1 = new Base();
        addObject( b1, getWidth()/2, 500 );
        
        b2 = new Base();
        addObject( b2, getWidth()/2 + 384, 500 );
        
        addObject( new FlappyBird(), 384/2, 512/2 );
    }
}
