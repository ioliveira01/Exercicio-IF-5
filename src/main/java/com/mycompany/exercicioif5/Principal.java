/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioif5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
                } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
                } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    }
}