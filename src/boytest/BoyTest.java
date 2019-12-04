/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boytest;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author moisessuquila
 */
public class BoyTest {
    //Static method must use static instance variables
    static Scanner in = new Scanner(System.in);
    static Boy[] boy = new Boy[2];
    static int id = 0;
    
    public static void enter(){
        String name, surname, phone;

        for (int i = 0; i < 2; i++) {
            //phone = in.nextLine();
            
            name = JOptionPane.showInputDialog(null, "Enter a name");
            surname = JOptionPane.showInputDialog(null, "Enter a surname");
            phone = JOptionPane.showInputDialog(null, "Enter a phone number");
            id = id + 2;
            boy[i] = new Boy(id,name,surname,phone);
            
        }
    }
    
    public static void printall(){
        boy[1].setSurname("Moises WK");
        for (int i = 0; i < boy.length; i++) {
            System.out.println(boy[i].toString());
        }
        
    }
    
    public static void main(String[] args) {
        enter();
        printall();
    }
}
