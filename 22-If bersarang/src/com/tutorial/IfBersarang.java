/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author Lusi Tsulutsiah
 */
public class IfBersarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nested if atau if bersarang

        int a = 2;
        int b = 10;

        System.out.println("ini adalah awal dari program");

        if (a == 5){

            if (b == 10){

                System.out.println("ini adalah dimana a = 5 dan b = 10");

            } 
else {

                System.out.println("ini adalah dimana a = 5 dan b bukan 10");

            }

        
} 
else {

            System.out.println("ini adalah dimana a salah");

        }

        System.out.println("ini adalah akhir dari program");
    
    }
}
