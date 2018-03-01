import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bg extends Actor
{
    public Bg(){
      GreenfootImage bg = new GreenfootImage("background-day.png");
      bg.scale( 576, 768 );
      setImage(bg);
    }
    
}
