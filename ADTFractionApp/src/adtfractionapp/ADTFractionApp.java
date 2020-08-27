/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtfractionapp;

/**
 *
 * @author csc2020
 */
public class ADTFractionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ADTFraction num1 = new ADTFraction(2, 5);
    ADTFraction num2 = new ADTFraction(3,7);
    
    num1.plus(num2).display();
    num1.value();
    num2.value();
    }
    
}
