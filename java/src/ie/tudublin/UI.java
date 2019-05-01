package ie.tudublin;



import processing.core.PApplet;



public class UI extends PApplet

{

    Button b;
    Button b2;

    MovingCircle mc;
    MovingCircle mc2;

    Rotate circ;

    Radar radar;




    boolean[] keys = new boolean[1024];
   Rain [] rain = new Rain[500]; 


    public void keyPressed()

    {

        keys[keyCode] = true;

    }

    

    public void keyReleased()

    {

        keys[keyCode] = true;

    }



    public boolean checkKey(int c)

    {

        return keys[c] || keys [Character.toUpperCase(c)];

    }

    public void mousePressed()
    {
        mode = 1;
        // if (mouseX mouseY)
    }

    



    public void settings()

    {

        size(800, 800);

        // Use fullscreen instead of size to make your interface fullscreen

        //fullScreen(); 

    }



    public void setup()

    {

        b = new Button(this, 250, 500, 100, 50, "Rainy");
        b2 = new Button(this, 450, 500, 100, 50, "Snow");

        mc = new MovingCircle(this, 500, 350, 50);
        mc2 = new MovingCircle(this, 300, 350, 50);

        circ = new Rotate();

        radar = new Radar(this,0);


         //for (int i = 0; i < rain. length; i++){
        //rain[i] = new Rain(this,random(width),random(-200, -100),random(4, 10),random(10, 20));
        //}

       for (int i = 0; i < rain. length; i++){  
            rain[i] = new Rain(this,random(width),random(-200, -100),random(4, 10),random(10, 20));
            }
        

    }

     

      

      void stars() {

        int noOfStars = 100;

        background(0);

        for (int currStars = 0; currStars <= noOfStars; currStars++)

        {

          

          ellipse(random(0, width), random(0, height), 2, 2);

        }

       

      

      

    }

      
    int mode = 0;


    public void draw()

    {

        background(230, 230, 250);

        if (mode == 0)
        {

            noFill();

            stars();

            b.render();
            b2.render();

            

            mc.update();
            mc.render();
            mc2.render();
            mc2.update();

            circ.render();

            radar.render();

            radar.rotateLine();
        }
        else if (mode == 1)
        {
       

            
           for (int i = 0; i < rain.length; i++)
           {
               rain[i].fall();
               rain[i].show();
           } 
        }
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }

            
        
    }
}

