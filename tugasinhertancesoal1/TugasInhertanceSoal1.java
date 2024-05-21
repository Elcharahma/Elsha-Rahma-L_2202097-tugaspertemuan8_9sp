/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.tugasinhertancesoal1;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class TugasInhertanceSoal1 {

    public static void main(String[] args) {
        Scanner isi = new Scanner(System.in);
        ObjekGeometris og = new ObjekGeometris();
        System.out.println("Segitiga "+og.toString());
        System.out.println("Add Side 1  ");
        double side1= isi.nextDouble();
        System.out.println("Add Side 2  ");
        double side2= isi.nextDouble();
        System.out.println("Add Side 3  ");
        double side3= isi.nextDouble();
        
        System.out.println("Warnanya apa kack :p : ");
        String color = isi.next();
        
        System.out.println("Segitiga nya benar atau ga : ");
        boolean filled = isi.nextBoolean();
        
       Segitiga segitiga = new Segitiga();
        System.out.println(""+segitiga.toString());
        System.out.println("Luas Segitiga : "+segitiga.getArea());
        System.out.println("Keliling Segitiga : "+segitiga.getPerimeter());
   
    }
}
