package br.com.jsniot.service;

public class Desligado implements Estado{

    @Override
    public void trocarEstado() {
     
        System.out.println("DESLIGAR");
    }
    
}
