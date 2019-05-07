
package ie.tudublin;

import processing.core.PApplet;

public class Cloud {

    PApplet ui; 
    private float x;
    private float y;
    private float xspeed;
    private float cdiameter = 70;
    private float cx, cy;
    
    public Cloud(PApplet ui){
        this.ui = ui;
        this.x = ui.random(-200, -100);
        this.y  = ui.random(ui.height);
        this.xspeed = ui.random(1, 2);;
      }

    public Cloud(float cx, float cy, PApplet ui)
    {
        this.cx = cx;
        this.cy = cy;
    }


    public void drift() {
        x = x + xspeed;
            
        
        if (x > ui.width) {
        x = ui.random(-200, -100);// this loop makes the returm to the top again when it falls
        xspeed = ui.random(1, 2); 
        }
    }
    
    public void show() {
        ui.noStroke();
        ui.fill(138, 43, 226);
        
        ui.ellipse(x, y, cdiameter, cdiameter);
        ui.ellipse(x - (cdiameter/2) , y , cdiameter, cdiameter);
        ui.ellipse(x + (cdiameter/2) , y , cdiameter, cdiameter);
        ui.ellipse(x , y - (cdiameter/2) , cdiameter, cdiameter);
    }

    public void drawCloud()
    {
        ui.stroke(0, 255, 0);
        ui.fill(0, 255, 0);
        ui.ellipse(cx, cy, 20, 60);
        ui.ellipse(cx, cy, 20, 60);
        ui.ellipse(cx, cy, 20, 60);
        ui.ellipse(cx, cy, 20, 60);
    }
  }
