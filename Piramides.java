/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramides;

import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class Piramides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numfilas;

        System.out.print("Ingrese el numero de filas para la piramide: ");
        numfilas = scanner.nextInt();

        System.out.println("Menu:");
        System.out.println("1. Piramide de Asteriscos");
        System.out.println("2. Piramide de Letras");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                PiramideAsteriscos(numfilas);
                break;
            case 2:
                PiramideLetras(numfilas);
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }

    private static void PiramideAsteriscos(int numfilas) {
        System.out.println("Piramide de Asteriscos:");
        for (int i = 1; i <= numfilas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void PiramideLetras(int numfilas) {
        int num = 1;
        char letra = 'A';

        for (int i = 1; i <= numfilas; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print( letra);
                    letra++;
                } else {
                    System.out.print( num);
                    num++;
                }
            }
            System.out.println();
        }
    }
    }