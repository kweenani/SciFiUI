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
    })