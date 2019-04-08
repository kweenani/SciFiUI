package ie.tudublin;

import processing.core.PApplet;

public class Radar{
    float x, y;
    PApplet ui;
    float r;

    public Radar(float x, float y, float r, PApplet ui){
        this.x = x;
        this.y = y;
        this.r = r;
        this.ui = ui;
    }

    public void drawRadar()
    {
        ui.noFill();
        ui.stroke(255);
        ui.ellipse(x, y, r, r);
    }
    
        
    //     ui.line(400,150,400,650); //x,y,x1,y1
    //     ui.line(150,400,650,400);
    // }

    public void rotateLine(){
        ui.pushMatrix();
             ui.translate(ui.width/2,ui.height/2);
             ui.rotate(ui.radians(r));  
             ui.line(0,0,0,250);
        ui.popMatrix();

        r += 0.5;
    }
    }


