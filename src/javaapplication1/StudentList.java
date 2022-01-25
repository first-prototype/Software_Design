/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 002
 */
public class StudentList {
    public static void main(String[] args){
//        Student[] studentList = new Student[3];
//        studentList[0] = new Student ("s1", "Ronak Sheth");
//        studentList[1] = new Student ("s2", "Simran");
//        studentList[2] = new Student ("s3", "Ishpreet");
//    }
//    for (int i=0; i<studentList.length; i++){
//        System.out.print(studentList[i].getStudentId());
//        System.out.print("\n");
//        System.out.print(studentList[i].getStudentName());
//    }

        student[] studentList = new student[4];
        studentList[0] = new student ("s1","Ronak Sheth");
        studentList[1] = new student ("s2","John Doe");
        studentList[2] = new student ("s3","Abc");

        for(int i=0;i<studentList.length;i++)
        {
            System.out.print(studentList[i].getStudentId());
            System.out.print(" ");
            System.out.println(studentList[i].getStudentName());
        }
    }
}
