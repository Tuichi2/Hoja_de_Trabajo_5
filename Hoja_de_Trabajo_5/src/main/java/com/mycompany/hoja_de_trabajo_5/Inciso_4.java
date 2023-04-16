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
public class Inciso_4 {
    public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner leer = new Scanner (System.in);
        double nota1, nota2, nota3, nota4, promedio; 
        
        System.out.println("Ingresa la nota del primer parcial: ");
        nota1 = leer.nextDouble();

        System.out.println("Ingresa la nota del segundo parcial: ");
        nota2 = leer.nextDouble();

        System.out.println("Ingresa la nota del tercer parcial: ");
        nota3 = leer.nextDouble();

        System.out.println("Ingresa la nota del cuarto parcial: ");
        nota4 = leer.nextDouble();

        promedio = ((nota1 * 0.2) + (nota2 * 0.2) + (nota3 * 0.3) + (nota4 * 0.3));
        
        System.out.println("El promedio es de: " +promedio);
        
        if (promedio >= 85) {
            System.out.println("Aprobado con promedio Excelente");
        } else if (promedio >= 80) {
            System.out.println("Aprobado con promedio Muy bueno");
        } else if (promedio >= 70) {
            System.out.println("Aprobado con promedio Bueno");
        } else if (promedio >= 60) {
            System.out.println("Aprobado con promedio Regular");
        } else {
            System.out.println("Repite curso");
        }
}
}
