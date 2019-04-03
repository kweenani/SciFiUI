package ie.tudublin;

import processing.core.PApplet;


public class Rotate extends PApplet{


    public Rotate()
    {

    }

    float x = 250;
    float y = 250;
    float x1 = 250;
    float y1 = 250;
    float xspeed = 2;
    public void settings(){
        size(500,500);
    }

    public void setup(){

    }

    public void drawLine(){
        line(x,y,x1,y1);
    }

    public void circle(){
        
    }
    public void update(){
        x += xspeed;  // x = xspeed + x;

        if (x > width || x < 0){
            xspeed *= -1; // xspeed = xspeed * -1
        }
    }

    public void render(){
        
        System.out.println("in here");
        //ellipse(x,y,x1,y1);
        
        
        //drawLine();

    } 
}