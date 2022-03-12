package com.company.Cir;

public class Circle {
    double r;
    Circle(double r){
        this.r=r;
    }
    void circumference(double r){
        System.out.println("The Circumference of the circle is "+2*(22/7)*r);
    }
    void area(double r){
        System.out.println("The Area of the circle is "+(22/7)*r*r);
    }
}
 class Onj{
    public static void main(String[] args) {
        Circle c1=new Circle(3);
    }
}
