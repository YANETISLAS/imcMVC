/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String [] yiy ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero.. ");
        int limite = sc.nextInt();
        
        for (int sucesion = 0; sucesion < limite; sucesion++){
            System.out.print(seriefibonacci(sucesion) + ", ");
        }
    }

    private static int seriefibonacci(int numero) {
        if (numero == 0 || numero == 1)
            return numero;
        else 
            return seriefibonacci(numero - 1) + seriefibonacci(numero - 2);
    }
    
}

