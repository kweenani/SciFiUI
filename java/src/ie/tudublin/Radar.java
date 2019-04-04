package ie.tudublin;

import processing.core.PApplet;

public class Radar{
    PApplet ui;
    float r;

    public Radar(PApplet ui, float r){
        this.ui = ui;
        this.r = r;
    }
    

    public void render({
        ui. stroke(255);
        ui.noFill();
        ui.ellipse(400,400,400,400);
        ui.ellipse(400,400,350,350);
        ui.ellipse(400,400,300,300);
        ui.ellipse(400,400,250,250);
        ui.ellipse(400,400,200,200);
    }