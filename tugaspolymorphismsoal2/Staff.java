/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.tugaspolymorphismsoal2;

import java.util.Date;

/**
 *
 * @author ELSHA
 */
public class Staff extends Employee {
     private String gelar;

    public Staff(String nama, String alamat, String telepon, String email, String kantor, double gaji, Mydate tanggalKerja,String gelar) {
        super(nama, alamat, telepon, email, kantor, gaji,tanggalKerja);
        this.gelar = gelar;
    }


    @Override
    public String toString() {
       return "Kelas : Staff, Nama :"+name+", Gelar: "+gelar;
    }
}
