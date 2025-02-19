package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args){

        Scanner notas = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota1 = notas.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double nota2 = notas.nextDouble();

        System.out.print("Digite sua nota do trabalho: ");
        double nota3 = notas.nextDouble();

        double MS = ((nota1 * 0.4) + (nota2 * 0.4) + (nota3 * 0.2));

        if (MS < 7){
            System.out.println("Sua nota nao foi satisfatória, digite a nota do seu exame: ");
            double exame = notas.nextDouble();
            double ME = (MS + exame)/2;
            if (ME >= 5 ){
                System.out.println("Aluno Aprovado");
            }else {
                System.out.println("Aluno Reprovado");
            }
        }else{
            System.out.println("Aluno Aprovado");
        }
    }



}
