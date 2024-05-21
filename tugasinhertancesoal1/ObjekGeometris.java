/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.tugasinhertancesoal1;

/**
 *
 * @author ELSHA
 */
public class ObjekGeometris {
    private String color  ;
    private boolean filled;
    private java.util.Date dateCreated;
    
public ObjekGeometris(){
    dateCreated = new java.util.Date();
}
    
public  ObjekGeometris(String color, boolean filled){
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
    
}
  
public String getColor(){
    return color;
    }
 
public void setColor(String color) {
    this.color = color;
  }

public boolean isFilled() {
    return filled;
  }


public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
public java.util.Date getDateCreated() {
    return dateCreated;
  }
  
     @Override
    public String toString() {
    return "created on " + dateCreated;
  }

}

