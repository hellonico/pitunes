import net.hellonico.pitunes.*;

iTunesLibrary itunes;

void setup() {
  size(400,400);
  smooth();
  
  itunes = new iTunesLibrary();
  
  PFont font = createFont("",40);
  textFont(font);
}

void draw() {
  background(0);
  fill(255);
}

void mousePressed() {
 itunes.toggle(); 
}