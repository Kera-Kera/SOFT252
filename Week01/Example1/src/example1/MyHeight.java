/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author bdaniel
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cm = 188;
        double inches = cm / 2.54;
        int feet = (int)inches / 12 ;
        int inches2 = (int)inches % 12;

        System.out.println("Your height is " + feet + "'" + inches2);
    }
    
}
