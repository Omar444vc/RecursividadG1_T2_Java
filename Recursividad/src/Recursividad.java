/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omarv
 */
public class Recursividad {
     
    public static int factorial(int n){
        if (n ==0 ){
            return 1;
        }
        return n * factorial( n-1 );
    }
    
    public static int suma(int n){
        if (n == 0){
            return 0;
        }
        return n + suma(n - 1);
    }
    
    public static void main(String []args){
        System.out.println("Factorial: " + factorial (5));
        System.out.println("Suma: " + suma(5));
    }
}
