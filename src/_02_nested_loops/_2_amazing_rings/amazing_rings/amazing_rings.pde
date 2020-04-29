int s = 700;
float x = 200;
int y = 500;
float x2 = 1000;
int y2 = 500;
void setup() {
  size(1500, 1000);
}

void draw() {
background(181,181,181);
  drawCircleOne(); 
drawCircleTwo();
x+= 3.5;
x2-= 3.5;

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
