/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_03_26_24;

/**
 *
 * @author LOQ
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord student1 = new StudentRecord();
        student1.setName("Farid Fadlizil Ikram");
        student1.setAddress("Padang");
        student1.setAge(19);
        student1.setMathGrade(86);
        student1.setEnglishGrade(93);
        student1.setScienceGrade(79);
        
        System.out.println("Nama         : "+student1.getName());
        System.out.println("Alamat       : "+student1.getAddress());
        System.out.println("Umur         : "+student1.getAge());
        System.out.println("MTK          : "+student1.getMathGrade());
        System.out.println("B.Ing        : "+student1.getEnglishGrade());
        System.out.println("IPA          : "+student1.getScienceGrade());
        System.out.println("Rata-rata    : "+student1.getAverage());
        //Menampilkan jumlah siswa
        System.out.println("Banyak siswa : "+StudentRecord.getStudentCount());
        //contoh pemanggilan method overload
        System.out.println("================================");
        student1.print(student1.getName());
        System.out.println("================================");
        student1.print(student1.getMathGrade(),student1.getEnglishGrade(),student1.getScienceGrade());
        
        StudentRecord acengRecord = new StudentRecord("Aceng");
        StudentRecord faridRecord = new StudentRecord("Farid","Padang");
        StudentRecord nilaiRecord = new StudentRecord(80,90,70);
        
        acengRecord.print(acengRecord.getName());
        faridRecord.print(faridRecord.getName());
        nilaiRecord.print(nilaiRecord.getEnglishGrade(),
                nilaiRecord.getMathGrade(),nilaiRecord.getScienceGrade());
        
        System.out.println("Banyak siswa : "+StudentRecord.getStudentCount());
    }
}
