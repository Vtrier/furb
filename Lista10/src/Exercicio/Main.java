/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura figura = null;

        System.out.println("Escolha a figura (1=Quadrado, 2=Retângulo, 3=Triângulo, 4=Círculo): ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe o lado do quadrado: ");
                int lado = sc.nextInt();
                figura = new Quadrado(lado);
                break;
            case 2:
                System.out.print("Informe a largura: ");
                int largura = sc.nextInt();
                System.out.print("Informe a altura: ");
                int altura = sc.nextInt();
                figura = new Retangulo(largura, altura);
                break;
            case 3:
                System.out.print("Lado 1: ");
                int l1 = sc.nextInt();
                System.out.print("Lado 2: ");
                int l2 = sc.nextInt();
                System.out.print("Lado 3: ");
                int l3 = sc.nextInt();
                figura = new Triangulo(l1, l2, l3);
                break;
            case 4:
                System.out.print("Informe o raio: ");
                int raio = sc.nextInt();
                figura = new Circulo(raio);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Área da figura: " + figura.calcularArea());
    }
}