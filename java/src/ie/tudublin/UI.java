package ie.tudublin;



import processing.core.PApplet;



public class UI extends PApplet

{

    Button b;
    Button b2;
    Button b3;

    MovingCircle mc;
    MovingCircle mc2;
    MovingCircle mc3;

    Rotate circ;

    Radar radar;

    int rainyx;
    int rainyy;
    int snowx;
    int snowy;
    int cloudyx;
    int cloudyy;
    int buttonw;
    int buttonh;

    
    




    boolean[] keys = new boolean[1024];
    Rain [] rain = new Rain[500]; 
    SnowDrop[] snow = new SnowDrop[500];
    Cloud[] clouds = new Cloud[15];

    

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
        if(mouseX > rainyx && mouseX < (rainyx + buttonw)) //this is checking the x mouse
        {
            if(mouseY > rainyy && mouseY < (rainyy + buttonh)) // this is also checking the y mouse function
            {
                mode = 1;
            } 
            if(mouseX > snowx && mouseX < (snowx + buttonw)) //this is checking the x mouse
        {
            if(mouseY > snowy && mouseY < (snowy + buttonh)) // this is also checking the y mouse function
            {
                mode = 2;
            } 
        }

        }

       
    }

    



    public void settings()

    {

        /*
        hgcseg
        xexx
        dxrexe
        xcxer
        xex
        */
        size(800, 800);

        // Use fullscreen instead of size to make your interface fullscreen

        //fullScreen(); 

    }



    public void setup()

    {
        rainyx = 250;
        rainyy = 500;
        snowx = 450;
        snowy = 500;

        
        buttonw = 100;
        buttonh = 50;
        b = new Button(this, rainyx, rainyy, buttonw, buttonh, "Rainy");
        b2 = new Button(this, snowx, snowy, buttonw, buttonh, "Snow");

        mc = new MovingCircle(this, 500, 350, 50);
        mc2 = new MovingCircle(this, 300, 350, 50);

        circ = new Rotate();

        radar = new Radar(this,0);


       for (int i = 0; i < rain. length; i++){  
            rain[i] = new Rain(this,random(width),random(-200, -100),random(4, 10),random(10, 20));
        }

        for (int i = 0; i < snow. length; i++){  
            snow[i] = new SnowDrop(this,random(width),random(-200, -100),random(4, 10));
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
        }
        else if (mode == 1)
        {
            for (int i = 0; i < rain.length; i++)
            {
                rain[i].fall();
                rain[i].show();
            } 
        }
        else if (mode == 2)
        {
            for (int i = 0; i < snow.length; i++)
            {
                snow[i].fall();
                snow[i].show();
            } 
        }

        

        b.render();
        b2.render();
        b3.render();
        

        mc.update();
        mc.render();
        mc2.render();
        mc2.update();

        circ.render();

        radar.render();

        radar.rotateLine();


        
    }
}

