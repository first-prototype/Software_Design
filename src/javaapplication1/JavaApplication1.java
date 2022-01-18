/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 002
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] myWord = new char[7];
        myWord[0] = 's'; 
        myWord[1] = 't'; 
        myWord[2] = 'u'; 
        myWord[3] = 'd'; 
        myWord[4] = 'e'; 
        myWord[5] = 'n'; 
        myWord[6] = 't'; 
        
        for (int i=0; i<myWord.length; i++){
            System.out.print(myWord[i]);
        }
        System.out.print("\n");
        for (int i=myWord.length-1; i>=0; i--){
            System.out.print(myWord[i]);
        }
    }
    
}
