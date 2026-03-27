package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ola! Somos um simulador de uma provedora de internet, selecione qual o seu problema:");
            System.out.println("1 - reclamação sobre atendimento\n2 - problemas com hardware\n3 - cancelamento\n4 - solicitar hardware");
            System.out.println("digite aqui: ");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("qual a sua reclamação?: ");
                    String reclamacao = scanner.nextLine();
                    System.out.println("sua reclamação será enviada ao nosso protocolo");
                    break;
                case 2:
                    System.out.println("estamos direcionando um tecnico para o seu endereço");
                    break;
                case 3:
                    System.out.println("deseja realmente cancelar seu plano?");
                    String resposta = scanner.next();
                    if (Objects.equals(resposta, "sim")){
                        System.out.println("seu plano foi cancelado");
                    }
                    else{
                        System.out.println("seu plano nao foi cancelado");
                    }
                    break;
                case 4:
                    System.out.println("qual aparelho gostaria de solicitar:");
                    String resposta2 = scanner.nextLine();
                    System.out.println("iremos contatar nosso fornecedor e iremos retornar");
                    break;
            }
        }
}