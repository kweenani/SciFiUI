package ie.tudublin;

import processing.core.PApplet;

public class Radar{
    PApplet ui;
    float r;

    public Radar(PApplet ui, float r){
        this.ui = ui;
        this.r = r;
    }
    

    public void render(){
        ui. stroke(255);
        ui.noFill();
        ui.ellipse(400,400,500,500); // x,y, width,height
        ui.ellipse(400,400,450,450);
        ui.ellipse(400,400,400,400);
        ui.ellipse(400,400,350,350);
        ui.ellipse(400,400,300,300);
        ui.ellipse(400,400,250,250);
        ui.ellipse(400,400,200,200);
        ui.line(400,150,400,650); //x,y,x1,y1
        ui.line(150,400,650,400);
    }

    public void rotateLine(){
        ui.pushMatrix();
             ui.translate(ui.width/2,ui.height/2);
             ui.rotate(ui.radians(r));  
             ui.line(0,0,0,200);
        ui.popMatrix();

        r += 0.5;
    }
    }


