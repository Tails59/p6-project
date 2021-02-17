package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model,"Controller 1"); // Create first controller
        Controller2 c2 = new Controller2(model, "Controller 2", 0); // Create second controller
        Controller2 c2a = new Controller2(model, "Controller 3", 1); // Create third controller
        Controller2 c2b = new Controller2(model, "Controller 4", 2); // Create fourth controller
        
    } // main
  
} // Main
