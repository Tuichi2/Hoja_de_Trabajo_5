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
public class Inciso_2 {
    public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner leer = new Scanner (System.in);
    
        System.out.println("Ingresa el primer numero: ");
        int a = leer.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int b = leer.nextInt();

        System.out.println("Ingresa el tercer numero: ");
        int c = leer.nextInt();

        System.out.println("Ingresa el cuarto numero: ");
        int d = leer.nextInt();

        int suma = a + b;
        int producto = c * d;

        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
        System.out.println("El producto de " + c + " y " + d + " es: " + producto);
    }
}

