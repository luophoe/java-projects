/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *Phoebe Luo
 * 9/12/2018
 * 
 * @author luophoe
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int side = 7;
        int perimeter = side *4;
        int area = side * side;
        
        System.out.println("***** Exercise 1 *****");
        System.out.println("A square with a side of 7 would have a perimeter of " + perimeter +"cm, an area of " + area + "cm2.");
        
        int length = 8;
        int width = 5;
        int perimeterrec = 2* length + 2* width;
        int arearec = length * width;
        
        System.out.println("***** Exercise 2 *****");
        System.out.println("A rectangle with a length of 8 and a length of 5 would have a perimeter of " + perimeterrec + "cm, an area of " + arearec + "cm2.");
        
        int day1 = 5;
        int day2 = 2;
        int day3 = 2;
        int totalWalk = day1;
  
        System.out.println("***** Exercise 3 *****");
        System.out.println("On Monday Mr Galat walked 5km For a total of " + totalWalk + "km.");
        totalWalk = totalWalk + day2;
        System.out.println("On Tuesday Mr Galat walked 2km For a total of " + totalWalk + "km.");
        totalWalk = totalWalk + day3;
        System.out.println("On Friday Mr Galat walked 2km For a total of " + totalWalk + "km.");
        
        int radius = 7;
        final double PI=3.14;
        double areacir = radius * radius * PI;
        System.out.println("***** Exercise 4 *****");
        System.out.println("The area of a circle with a radius of 7cm is " + areacir + "cm2." );
                
        
    }
    
}
