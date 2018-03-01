import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Base here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Base extends Actor
{
    public Base(){
      GreenfootImage image = new GreenfootImage( "base.png" );
      image.scale( 384, 128 );
      setImage(image);
      
    }
    
    public void act(){
      setLocation( getX() - 1, getY() );
      if( getX() <= -192 ){
        setLocation( 192 + 384, getY() );
      }
    }
}
