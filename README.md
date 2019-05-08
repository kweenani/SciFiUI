# SciFi UI Project

Name:QUEEN ISEK

Student Number: D12125516

Fork this repository and use it a starter project for your assignment

# Description of the assignment
This assignmet is based on the types of weather we have and the different way they can be identified based on thier sound and the image there, it tells you what each one does and the type of sound it makes too. 

# Instructions
Once the progrann is lunched the first thing that appear on the screen is different type of cicle in different sizes starting with the biggest to the smallest, in it has two lines which forms four point of which they indicate the differnt type of season, the season are boxed up in a button which controls the action of the weather when clicked on by taking you their indiviual page, also there is line in the middle of the circke which stands as radar that moves all around the whole cicle too.

# How it works
This program is design to show the four differnet type of weather that we have so far, the design of this program starts with creating the different classes which are the bones that makes the whole activities of the is program to run and display graphics. These classes are as follows
The main which is the master of the program, it calls the second master,
The UI which is the second master as I call it call the others class, every classes created in this program are all connected in the UI by implementation and with it they can all run togther thought navigation, with this done it is then easy for the main to work because the other classes has be implemented in the UI and are all connected. The next class created is the radar class, this is where the different circles which holds the four different weathers and the radar line that moves in the middle too, all of these classes work at the click of thier button which is also shown in side the radar.
The next class is the Rain class this display rain when you click on it, it shows us the rainy season and the sound it make and it is in a purple colour.
The next one is Snow again it display snow when you click on it and the sound a snow makes when it is falling and it is also in a purple colour. "my chioce of colour"
The next class is the windy weather, when you click on it it display sets of clound moving from one of the screen to the other in random, showing that the is cloundy and and windy and it also makes it own sound to show thw kind of that it is.
The next weather is the Sunny day, off course sunny day has to reflect a nice day with drawing of trees to show a water free day and the sun at the corner of the screen also shows that it is going to be day to enjoy.
The button class is also created for the easy usability in the design of the program, when you click on the button it takes to individual page, it help for faster navigation the whole program. Wth you can find your around the whole without you getting lost, it is easy to move from one paga to the because you can still see the shadow of the home page when in another which makes more fun to play with.


# What I am most proud of in the assignment
What am most proud of in the assignment is the fast that it gave me the opportunity to learn java in a new way which is more unique and fun although it is very chanlleging for me but it made research more interact with my classmate for help but at the end of the day it all worked well for and am happy it turned out well, I ahve fun trying out different things too.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

This is the code that loop through the object making the rain to rain continusly and the same to the other classes, snow, and the cloudy too

 for (int i = 0; i < rain. length; i++){  
            rain[i] = new Rain(this,random(width),random(-200, -100),random(4, 10),random(10, 20));
        }

        
        for (int i = 0; i < snow. length; i++){  
            snow[i] = new SnowDrop(this,random(width),random(-200, -100),random(4, 10));
        }

        for (int i = 0; i < clouds. length; i++){  
            clouds[i] = new Cloud(this);
        }


- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](data/homep.PNG)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://youtu.be/xK9b0SmcMYQ)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |



