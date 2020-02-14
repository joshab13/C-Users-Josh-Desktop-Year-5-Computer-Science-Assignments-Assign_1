package Assign_1;


import Media.*;                  // for Turtle and TurtleDisplayer
import static java.lang.Math.*;  // for Math constants and functions



// COSC 1P02 Assignment 1 //
  
//  @Joshua Braganza //

 // @version 1.0 (Jan 26th 2019)    //                                                  
  
public class Dodecagon {
  
  //Instance variables
  private TurtleDisplayer display;
  private Turtle yertle;
  
  
    
  public Dodecagon ( ) {
    
    
    display = new TurtleDisplayer();
    yertle = new Turtle(Turtle.FAST);
    display.placeTurtle(yertle);
    yertle.penDown();
      
     
      
    //To draw one dodecagon
    for(int i=1; i<=12 ; i++){
      yertle.forward(25);
      yertle.right(2*PI/12);
    }
              
        
  }; //End of code
    
    
  public static void main ( String[] args ) { 
      
    Dodecagon s = new Dodecagon(); };
    
    
} 