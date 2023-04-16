/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoja_de_trabajo_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author byron
 */
public class Inciso_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner leer = new Scanner (System.in);
        String usuariocorrecto = "admin";
        String clavecorrecta = "1234";
        String usuario, clave;

        while (true) {
            System.out.println("Ingresa tu usuario: ");
            usuario = br.readLine();

            System.out.println("Ingresa tu contraseña: ");
            clave = br.readLine();

            if (usuario.equals(usuariocorrecto) && clave.equals(clavecorrecta)) {
                System.out.println("Inicio de sesión exitoso.");
                break;
            } else {
                System.out.println("Error de inicio de sesión. Inténtalo de nuevo.");
            }
        }
    }
}

