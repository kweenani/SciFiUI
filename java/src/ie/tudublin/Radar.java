package ie.tudublin;



import processing.core.PApplet;



public class Radar{

    float x, y, r;//for circle

    PApplet ui;

    float x1, y1, x2, y2;



    public Radar(float x, float y, float r, float x1, float y1, float x2, float y2, PApplet ui){

        this.x = x;

        this.y = y;

        this.r = r;

        this.x1 = x1;

        this.y1 = y1;

        this.x2 = x2;

        this.y2 = y2;

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

             ui.line(x1, y1, x2, y2);

        ui.popMatrix();



        r += 0.5;

    }

    }