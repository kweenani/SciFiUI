package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Rotate circ;
    ArrayList<Radar> radar = new ArrayList<>();
    Radar radarLine;

    boolean[] keys = new boolean[1024];

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
    

    public void settings()
    {
        size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        circ = new Rotate();
        radar.add(new Radar(400,400,500, 0, 0, 0, 0, this));
        radar.add(new Radar(400,400,450, 0, 0, 0, 0, this));
        radar.add(new Radar(400,400,400, 0, 0, 0, 0, this));
        radar.add(new Radar(400,400,350, 0, 0, 0, 0, this));
        radar.add(new Radar(400,400,300, 0, 0, 0, 0, this));
        radar.add(new Radar(400,400,250, 0, 0, 0, 0, this));
        radar.add(new Radar(400,400,200, 0, 0, 0, 0, this));
        radarLine = new Radar(0, 0, 0, 0, 0, 0, 250, this);
      
    }
     
      
      void stars() {
        int noOfStars = 100;
        background(0);
        for (int currStars = 0; currStars <= noOfStars; currStars++)
        {
          
          ellipse(random(0, width), random(0, height), 2, 2);
        }
       
      
      
    }
      

    public void draw()
    {
        background(0);
        noFill();
        stars();
        b.render();
        
       mc.update();
       mc.render();
       circ.render();
    //    radar.render();
        radarLine.rotateLine();
        for(int i = 0; i < radar.size(); i++)  //loop new
        {
            radar.get(i).drawRadar();
        }
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

