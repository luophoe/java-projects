/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcircle;

/**
 * Phoebe Luo
 * @author luophoe
 * 1/30/2019
 */
public class Circle {
    private static double PI = 3.14;
    private double radius;
    
    public Circle(){
        radius = 2;
    }
    
    public Circle(double r){
      radius = r;
    }
    
    public double getArea(){
        double circleArea;
        circleArea = PI *radius*radius;
        return (circleArea);
    }
    
    public double getRadius(){
        return radius;
    }
    
}
