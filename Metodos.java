/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Esta linea solicita al usuario ingresar dos numeros
        System.out.print("Ingrese el primer numero: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double n2 = sc.nextDouble();
        
        System.out.println("============== Suma ==============");
        System.out.println("Suma: " + sumar(n1, n2));
        System.out.println("============= Resta =========5=====");
        System.out.println("Resta: " + restar(n1, n2));
        System.out.println("========= Multiplicacion =========");
        System.out.println("Multiplicacion: " + multiplicar(n1, n2));
        System.out.println("============ Division ============");
        System.out.println("Division: " + dividir(n1, n2));
        System.out.println("==================================");

        sc.close();
    }

    // Se ejecutan los metodos suma, resta, multiplicacion y division
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No es posible dividir entre cero.");
            return Double.NaN;
        }
    }
}