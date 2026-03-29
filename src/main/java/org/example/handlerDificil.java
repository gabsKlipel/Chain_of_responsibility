package org.example;

public class handlerDificil implements handler{

    @Override
    public void solucionar(){
        System.out.println("o problema foi resolvido");
    }

    @Override
    public void passarAdiante(handler handler){
        System.out.println("nao ha mais soluções");
    }
}
