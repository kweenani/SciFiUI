
package ie.tudublin;

import processing.core.PApplet;

public class Trees {

    PApplet ui; 
    private float x, y, w, h;

    public Trees(float x, float y, float w, float h, PApplet ui)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void drawLeaves()
    {
        ui.stroke(0, 255, 0);
        ui.fill(0, 255, 0);
        ui.ellipse((x + 30), y, 130, 80);
        ui.ellipse((x + 30) + 140, y, 130, 80);
        ui.ellipse((x + 30) + 280, y, 130, 80);
        ui.ellipse((x + 30) + 430, y, 130, 80);
        ui.noStroke();
        ui.noFill();
    }

    public void drawSun()
    {
        ui.stroke(255, 153, 0);
        ui.fill(255, 153, 0);
        ui.ellipse(0, 0, 550, 550);
        ui.noStroke();
        ui.noFill();   
    }

    public void drawTrees()
    {
        ui.stroke(153, 0, 0);
        ui.fill(153, 0, 0);
        ui.rect(x, y, w, h);
        ui.rect(x + 140, y, w, h);
        ui.rect(x + 280, y, w, h);
        ui.rect(x + 430, y, w, h);
        ui.noStroke();
        ui.noFill();

    }

  }
