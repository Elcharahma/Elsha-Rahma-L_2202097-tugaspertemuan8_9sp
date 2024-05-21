/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.tugaspolymorphismsoal2;

/**
 *
 * @author ELSHA
 */
public class TugasPolymorphismSoal2 {

    public static void main(String[] args) {
      Mydate tanggalKerja = new Mydate(2024,1,1);
      Person person = new Person("Elsha", "Ujungberung", "082120857497", "elzzha@gmail.com");
      Student student = new Student("Salsabila", "Cihanjuang", "082192191290", "essyaa@upi.edu", Student.JUNIOR);
      Employee employee = new Employee("Lutfia", "Gegerkalong", "082319829192", "piabukanphia@company.com","Astra Group",5000000,tanggalKerja);
      Faculty faculty = new Faculty("Dini", "Bandung", "082119829101", "dini@gmail.com", "Alba Group", 8000000,tanggalKerja, "8.30:00 AM - 5:00", "Admin");
      Staff staff = new Staff("Latisya", "Sumedang", "081282381928", "tisya@gmail.com", "Paledang HR", 600000, tanggalKerja,"Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
