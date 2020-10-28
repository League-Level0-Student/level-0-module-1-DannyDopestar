
void setup() {
PImage face = loadImage("zombie.png");
size(400,400);
}
void draw() {
  face.resize(300,300);
  image(face, 0, 0);
  ellipse(20, 30, 50, 100);
  fill(blue,green,yellow);}
