void setup(){
  size(800,800);
  PImage face= loadImage("zombie.jpg");
  image(face,0,0);
  
}


void draw(){
  fill(mouseX,mouseY,200);
  ellipse(660,150,100,100);
  fill(mouseX,mouseY,100);
  ellipse(560,150,100,100);
  fill(0,0,0);
  ellipse(660,160,50,50);
  fill(0,0,0);
  ellipse(560,160,50,50);
  
  
  
  
}