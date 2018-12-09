import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch

void setup(){
  size(800,800);
  minim= new Minim(this);
  sound= minim.loadFile("hello.wav");
  
  
}



void draw(){

  
  fill(227,208,172);//pizza
  ellipse(400,400,500,500);
  fill(255,0,0);//sauce
  ellipse(390,380,400,400);
  fill(226,227,64);//cheese
  ellipse(380,360,350,350);
  
    PImage pepperoni= loadImage("pepperoni.ppm.gif");
  pepperoni.resize(100,100);
  image(pepperoni,250,420);
  PImage toppings= loadImage("eyeball.ppm.gif");
 if(mousePressed){ toppings.resize(120,120);
  image(toppings,mouseX,mouseY);
  sound.play();
  sound.rewind();
}
}