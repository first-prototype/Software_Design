/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 002
 */
public class PartTimeStudent extends student{
    
    private int numCourses;

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    public PartTimeStudent(String studentId, String studentName, int numCourses) {
        super(studentId, studentName);
        this.numCourses = numCourses;
    }
    
}
