package br.com.jsniot.service;

public class Ligado implements Estado{

    @Override
    public void trocarEstado() {
        System.out.println("LIGAR");
    }
    
}
