int s = 400;
float x = 200;
int y = 300;
float x2 = 800;
int y2 = 300;
void setup() {
  size(1000, 600);
}

void draw() {
background(181,181,181);
  drawCircleOne(); 
drawCircleTwo();
x+= 0.5;
x2-= 0.5;

 }
  
  
  // Go to the recipe to run the demonstration before starting this program

  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
   You can use the noFill() command to make your ellipses transparent.
   Make the rings move past each other.
   When the rings hit the side of the sketch, make them reverse their direction.
   */

public void drawCircleOne() {
  noFill();

   
  for (int j = s; j >= 10; j-= 10) {
    ellipse(x, y, j, j);
 
  }
}
 public void drawCircleTwo(){
 noFill();
 for(int i = s; i >= 10; i-=10){
 ellipse(x2,y2,i,i);
 
 }
 }  
