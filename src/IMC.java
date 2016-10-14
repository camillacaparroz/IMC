
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31501656
 */
public class IMC {

    public static void main(String[] args) {
        double peso, altura, calculo;
        Scanner dado = new Scanner(System.in);

        System.out.println("**********Cálculo do IMC**********");
        System.out.println("Insira seu peso: ");
        peso = dado.nextDouble();
        System.out.println("Insira sua alura: ");
        altura = dado.nextDouble();

        calculo = peso / (altura * altura);

        if (calculo < 18.5) {
            System.out.println("*******************************************");
            System.out.println("Seu IMC é: " + calculo);
            System.out.println("Você está abaixo do peso recomendado.");
            System.out.println("*******************************************");
        }

        if (calculo >= 18.5 && calculo < 25) {
            System.out.println("*******************************************");
            System.out.println("Seu IMC é: " + calculo);
            System.out.println("Você está muito bem! Continue assim!");
            System.out.println("*******************************************");
        }
        if (calculo >= 25 && calculo < 30) {
            System.out.println("**********************************************");
            System.out.println("Seu IMC é: " + calculo);
            System.out.println ("Você está acima do peso recomendado. Cuidado!");
            System.out.println("**********************************************");
        }
        if (calculo >=30) {
            System.out.println("**********************************************");
            System.out.println("Seu IMC é: " + calculo);
            System.out.println ("Você está Obeso. ");
            System.out.println("Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!");
            System.out.println("**********************************************");
        }
        
    }

}


