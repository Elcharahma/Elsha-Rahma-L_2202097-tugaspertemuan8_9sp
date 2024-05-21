/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.tugaspolymorphismsoal2;

/**
 *
 * @author ELSHA
 */
public class Student extends Person {
    public static final String MaHASISWABARU = "Mahasiswa ";
    public static final String MHSKE2 = "Mahasiswa Tahun Ke-2";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    private String status;

    public Student(String nama, String alamat, String telepon, String email, String status) {
        super(nama, alamat, telepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
         return "Kelas : Student, Nama :"+name+", Status : "+status;
}
}