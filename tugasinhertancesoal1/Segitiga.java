/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.tugasinhertancesoal1;

/**
 *
 * @author ELSHA
 */
public class Segitiga extends ObjekGeometris {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
public Segitiga(){}

public Segitiga(double side1, double side2, double side3){
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    
}
public Segitiga(double side1, double side2, double side3, String color, boolean filled){
    super(color,filled);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
}

public double getSide1(){
   return side1;
}
public double getSide2(){
   return side2;
}
public double getSide3(){
    return side3;
}

public void setSide1(double side1){
    this.side1 = side1;   
}
public void setSide2(double side2){
    this.side2 = side2;   
}
public void setSide3(double side3){
    this.side3 = side3;   
}

public double getArea(){
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
}
public double getPerimeter(){
    return side1 + side2 + side3;
}

    @Override
    public String toString(){
    return "side 1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3;
}

   
}

