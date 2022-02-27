/**
Description:   This is a client application of the Balloon class.
               This class tests the functionality of the Balloon class methods.
     
     Author: William Crum
       
     Date: September 2, 2020
*/

public class BalloonTester {

   public static void main(String args[])
   {
     
      /******************************************************************
     
           Test 1: 
	   
	          Test the constructor by creating a new Balloon object
          
      ******************************************************************/
     
      Balloon balloon = new Balloon(5.5);    // a balloon
    

      /******************************************************************
     
           Test 2: 
	   
            Test the getRadius method
          
      ******************************************************************/

      System.out.println("\n\nThe balloon's radius is " + balloon.getRadius() + " inches.");
      System.out.println("Expected result: The balloon's radius is 5.5 inches.");
     
      /******************************************************************
     
           Test 3: 
	   
	           Test the inflate method
          
      ******************************************************************/     
         
      balloon.inflate(6.5);
                
      System.out.println("\n\nThe balloon's radius is " + balloon.getRadius() + " inches.");
      System.out.println("Expected result: The balloon's radius is 12.0 inches.");
             
      /******************************************************************
     
           Test 4: 
	   
	           Test the getVolume method
          
      ******************************************************************/
                    
      
      System.out.println("\n\nThe balloon's volume is " + balloon.getVolume() + " cubic inches.");
      System.out.println("Expected result: The balloon's volume is 7238.229473870883 cubic inches.\n\n");
                    
   } // main
  
}// BalloonTester