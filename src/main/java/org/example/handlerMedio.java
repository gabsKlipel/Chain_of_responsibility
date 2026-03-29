package org.example;

public class handlerMedio implements handler{
    @Override
    public void solucionar(){
        System.out.println("o problema foi resolvido!");
    }

    @Override
    public void passarAdiante(handler handler){
        handler.solucionar();
    }
}
