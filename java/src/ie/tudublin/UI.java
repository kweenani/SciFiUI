package ie.tudublin;



import processing.core.PApplet;



public class UI extends PApplet

{

    Button b;

    MovingCircle mc;
    //MovingCircle mc2;

    Rotate circ;

    Radar radar;



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

        mc = new MovingCircle(this, 500, 350, 50);
        //mc2 = new MovingCircle(this, 300, 350, 50);

        circ = new Rotate();

        radar = new Radar(this,0);

      

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
      // mc2.render();
       //mc2.update();

       circ.render();

       radar.render();

       radar.rotateLine();

        if (checkKey(LEFT))

        {

            System.out.println("Left arrow key pressed");

        }

    }

}

