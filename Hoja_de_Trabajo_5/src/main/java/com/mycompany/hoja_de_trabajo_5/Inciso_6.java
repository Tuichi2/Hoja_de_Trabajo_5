/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja_de_trabajo_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author byron
 */
public class Inciso_6 {
    public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner leer = new Scanner (System.in);
        int n, factorial;
        System.out.println("Ingresa un número entero: ");
        n = leer.nextInt();
        factorial = calcularFactorial(n);

        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    public static int calcularFactorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        //Explicacion del ciclo for aqui, for se ejecuta n veces. 
        //En cada iteración del bucle, la variable i toma un valor entre 1 y n, 
        //y se multiplica el valor de la variable factorial por el valor de i. 
        //De esta manera, al final del bucle, la variable factorial contiene el 
        //producto de todos los números entre 1 y n, que es el factorial de n.
        //Por ejemplo: si n fuera 4:
        //En la primera iteración, i es igual a 1 y factorial se multiplica por 1, por lo que su valor sigue siendo 1
        //En la segunda iteración, i es igual a 2 y factorial se multiplica por 2, por lo que su valor cambia a 2
        //En la tercera iteración, i es igual a 3 y factorial se multiplica por 3, por lo que su valor cambia a 6
        //En la cuarta iteración, i es igual a 4 y factorial se multiplica por 4, por lo que su valor cambia a 24
        //Entonces 24 es el factorial de 4
        return factorial;
    }
}
