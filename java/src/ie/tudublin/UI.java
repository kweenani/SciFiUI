package ie.tudublin;



import processing.core.PApplet;
import ddf.minim.*;



public class UI extends PApplet

{

    Button b;
    Button b2;
    Button b3;
    Button b4;

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
    int sunnyx;
    int sunnyy;
    int buttonw;
    int buttonh;

    Trees tree;

    AudioPlayer cTrack, sTrack, rTrack, swTrack;
    Minim cMinim, sMinim, rMinim, swMinim;

    
    




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
        if((mouseX > rainyx && mouseX < (rainyx + buttonw)) && (mouseY > rainyy && mouseY < (rainyy + buttonh)))//this is checking the x mouse
        {
            
            mode = 1;
            swTrack.pause();
            sTrack.pause();
            cTrack.pause();
            rTrack.play();
            rTrack.loop();

        }    
        else if((mouseX > snowx && mouseX < (snowx + buttonw)) && (mouseY > snowy && mouseY < (snowy + buttonh))) //this is checking the x mouse
        {
           
            mode = 2;
            rTrack.pause();
            sTrack.pause();
            cTrack.pause();
            swTrack.play();
            swTrack.loop();
            
        }     
 
        else if((mouseX > cloudyx && mouseX < (cloudyx + buttonw)) && (mouseY > cloudyy && mouseY < (cloudyy + buttonh))) //this is checking the x mouse
        {
            
            mode = 3;
            swTrack.pause();
            sTrack.pause();
            rTrack.pause();
            cTrack.play();
            cTrack.loop();
             
        }

        else if((mouseX > sunnyx && mouseX < (sunnyx + buttonw)) && (mouseY > sunnyy && mouseY < (sunnyy + buttonh))) //this is checking the x mouse
        {
            
            mode = 4;
            swTrack.pause();
            rTrack.pause();
            cTrack.pause();
            sTrack.play();
            sTrack.loop();
        
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
        cloudyx = 250;
        cloudyy = 300;
        sunnyx = 450;
        sunnyy = 300;
        tree = new Trees(280, 450, 60, 150, this);

        cMinim = new Minim(this);
        sMinim = new Minim(this);
        rMinim = new Minim(this);
        swMinim = new Minim(this);

        cTrack = cMinim.loadFile("cloudy.mp3");
        sTrack = sMinim.loadFile("sunny.mp3");
        rTrack = rMinim.loadFile("rain.mp3");
        swTrack = swMinim.loadFile("snow.mp3");
            
        
        buttonw = 100;
        buttonh = 50;
        b = new Button(this, rainyx, rainyy, buttonw, buttonh, "Rainy");
        b2 = new Button(this, snowx, snowy, buttonw, buttonh, "Snow");
        b3 = new Button(this, cloudyx, cloudyy, buttonw, buttonh, "Cloudy");
        b4 = new Button(this, sunnyx, sunnyy, buttonw, buttonh, "Sunny");

        // mc = new MovingCircle(this, 500, 350, 50);
        // mc2 = new MovingCircle(this, 300, 350, 50);

        circ = new Rotate();

        radar = new Radar(this,0);


       for (int i = 0; i < rain. length; i++){  
            rain[i] = new Rain(this,random(width),random(-200, -100),random(4, 10),random(10, 20));
        }

        
        for (int i = 0; i < snow. length; i++){  
            snow[i] = new SnowDrop(this,random(width),random(-200, -100),random(4, 10));
        }

        for (int i = 0; i < clouds. length; i++){  
            clouds[i] = new Cloud(this);
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
        else if (mode == 3)
        {
            for (int i = 0; i < clouds.length; i++)
            {
                clouds[i].drift();
                clouds[i].show();
            } 
        }
        else if (mode == 4)
        {
            tree.drawSun();
            tree.drawTrees();
            tree.drawLeaves();
        }

        

        b.render();
        b2.render();
        b3.render();
        b4.render();
        

        // mc.update();
        // mc.render();
        // mc2.render();
        // mc2.update();

        circ.render();

        radar.render();

        radar.rotateLine();


        
    }
}

