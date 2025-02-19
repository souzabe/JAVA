package org.example;
import java.util.Scanner;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Obter valores de PCC&F e GS do usuário

        System.out.print("Digite o valor de PCC&F: ");
        double pccf = scanner.nextDouble();

        System.out.print("Digite o valor de GS: ");
        double gs = scanner.nextDouble();

        //Calculo de MS1
        double ms1 = (pccf * 04) + (gs * 0.6);

        // Exibir o resultado
        System.out.println("O valor de MS1 é: " + ms1);
        }
    }
