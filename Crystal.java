package Assign_1;


import Media.*;                  // for Turtle and TurtleDisplayer
import static java.lang.Math.*;  // for Math constants and functions



// COSC 1P02 Assignment 1 //
  
//  @Joshua Braganza //

 // @version 1.0 (Jan 26th 2019) //                                                      
  
public class Crystal {
  
  //Instance variables
  private TurtleDisplayer display;
  private Turtle yertle;
  
  
    
  public Crystal ( ) {
        
    display = new TurtleDisplayer(); 
    yertle = new Turtle(Turtle.FAST); 
    display.placeTurtle(yertle);
    yertle.penDown();
      
      
    for (int j=1; j<=24; j++){   //To draw 24 dodecagons
      
      //To draw one dodecagon. No need to reorient the first dodecagon 
      for(int i=1; i<=12 ; i++){
        yertle.forward(25);
        yertle.right(2*PI/12);
      }
        
      //To reorient the pointer before drawing the next dodecagon, Since I'm drawing 24, I divide 360 degreees by 24
      yertle.penUp();        
      yertle.left(2*PI/24);
      yertle.penDown();
      
    }
          
        
  }; //End of code
    
    
  //Main Method
  public static void main ( String[] args ) { 
      
    Crystal s = new Crystal(); };
    
    
}