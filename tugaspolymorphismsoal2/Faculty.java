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
public class Faculty extends Employee {
    private String jamKerja;
    private String pangkat;

    public Faculty(String name, String alamat, String telepon, String email, String kantor, double gaji,Mydate tanggalkerja,String jamKerja, String pangkat) {
        super(name, alamat, telepon, email, kantor, gaji,tanggalkerja);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Kelas : Faculty, Nama :"+name+", Jam Kerja :"+jamKerja;
    }
}
