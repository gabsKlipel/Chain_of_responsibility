package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Main{
        public static void main(String[] args){
            handlerFacil handlerFacil = new handlerFacil();
            handler handlerMedio = new handlerMedio();
            Scanner scanner = new Scanner(System.in);
            System.out.println("ola! Somos um simulador de uma provedora de internet, selecione qual o seu problema:");
            System.out.println("1 - reclamação sobre atendimento\n2 - problemas com hardware\n3 - cancelamento\n4 - solicitar hardware");
            System.out.println("digite aqui: ");
            handlerFacil.passarAdiante(handlerMedio);
        }
}