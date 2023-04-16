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
public class Inciso_5 {
    public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner leer = new Scanner (System.in);
        int piezasEntre98y102 = 0;
        int piezasMasDe102 = 0;
        int piezasMenosDe98 = 0;
        int totalPiezas = 0;
        double peso;

        while (true) {
            System.out.println("Ingresa el peso de la pieza (en Kg) o 0 para terminar: ");
            peso = leer.nextDouble();

            if (peso == 0) {
                break;
            }

            if (peso >= 9.8 && peso <= 10.2) {
                piezasEntre98y102++;
            } else if (peso > 10.2) {
                piezasMasDe102++;
            } else {
                piezasMenosDe98++;
            }

            totalPiezas++;
        }

        System.out.println("Piezas con peso entre 9.8 Kg. y 10.2 Kg.: " + piezasEntre98y102);
        System.out.println("Piezas con más de 10.2 Kg.: " + piezasMasDe102);
        System.out.println("Piezas con menos de 9.8 Kg.: " + piezasMenosDe98);
        System.out.println("Total de piezas procesadas: " + totalPiezas);
    }
}

