
void setup() {
  size(500,500);

}

void draw() {
int s = 30;
int x = 50;
int y = 200;
 
  

 for(int i = 0; i < 10; i++){   
x++;


   ellipse(x,y,s,s);
 }
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
