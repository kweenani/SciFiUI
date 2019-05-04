package ie.tudublin;

import processing.core.PApplet;

public class SnowDrop 
{
    PApplet ui; 
    private float x;
    private float y;
    private float yspeed;
    private float size;

    public SnowDrop(PApplet ui,float x,float y, float yspeed){
      this.ui = ui;
      this.x = x;
      this.y = y;
      this.yspeed = yspeed;
      size = ui.random(5, 10);
    }
    public void fall() {
      this.y = y + yspeed;
      this.yspeed = (float) (yspeed + 0.2); // valocity of the gravity
          
      
      if (y > ui.height) {
          y = ui.random(-200, -100);// this loop makes it returm to the top again when it falls
          yspeed = ui.random(4, 10);
      }
    }
    
   public void show() { 
     ui. stroke(138, 43, 226);
     ui. ellipse(x,y,size,size);
   }
}