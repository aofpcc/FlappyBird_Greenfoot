import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    private GreenfootImage[][] images;
    private int currentAnim;
    private int currentFrame;
    private int animDelay;
    
    private double a;
    
    public FlappyBird(){
      images = new GreenfootImage[3][3];
      images[0][0] = new GreenfootImage("bluebird-downflap.png");
      images[0][1] = new GreenfootImage("bluebird-midflap.png");
      images[0][2] = new GreenfootImage("bluebird-upflap.png");
      
      images[1][0] = new GreenfootImage("redbird-downflap.png");
      images[1][1] = new GreenfootImage("redbird-midflap.png");
      images[1][2] = new GreenfootImage("redbird-upflap.png");
      
      images[2][0] = new GreenfootImage("yellowbird-downflap.png");
      images[2][1] = new GreenfootImage("yellowbird-midflap.png");
      images[2][2] = new GreenfootImage("yellowbird-upflap.png");
      
      currentAnim = Greenfoot.getRandomNumber(3);
      currentFrame = 0;
      setImage( images[currentAnim][currentFrame] );
    }
    
    public void act(){
        
      if( animDelay++ > 5 ){
          currentFrame++;
          animDelay = 0;
      }
      if( currentFrame == 3 ) currentFrame = 0;
      setImage( images[currentAnim][currentFrame] );
      
      if( Greenfoot.isKeyDown("space") ){
        a = -7;
      }
      gravity();
    }
    
    public void gravity(){
      a += 0.7;
      int addingY = (int)a + getY();
      setLocation( getX(), addingY );
    }
}
