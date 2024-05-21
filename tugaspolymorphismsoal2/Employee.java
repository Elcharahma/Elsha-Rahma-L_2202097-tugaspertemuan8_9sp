/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.tugaspolymorphismsoal2;



/**
 *
 * @author ELSHA
 */
public class Employee extends Person {
    private String kantor;
    private double gaji;
     private Mydate tanggalKerja;

    

public Employee(String name, String alamat, String telepon, String email, String kantor, double gaji, Mydate tanggalKerja) {
        super(name,alamat,telepon,email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalKerja = tanggalKerja;
}

    @Override
     public String toString(){
       return "Kelas : Employee, Nama :"+name+ ", Tanggal Kerja :"+tanggalKerja;
   }

}
