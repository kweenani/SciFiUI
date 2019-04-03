package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Rotate circ;

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
      
    }
     
      
      void stars() {
        int noOfStars = 100;
        background(0);
        for (int currStars = 0; currStars <= noOfStars; currStars++)
        {
          
          ellipse(random(0, width), random(0, height), 1, 1);
        }
       
      
      
    }
      

    public void draw()
    {
        background(0);
        stars();
        b.render();
        
       mc.update();
       mc.render();
       circ.render();
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

