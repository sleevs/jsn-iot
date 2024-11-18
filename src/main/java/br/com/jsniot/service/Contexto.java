package br.com.jsniot.service;

public class Contexto {

    private Estado estatdo = new Ligado();


    public void request(){
        estatdo.trocarEstado();
    }

    public void mudar(){
        if(estatdo instanceof Ligado){
            estatdo = new Desligado();
        }else{
            estatdo = new Ligado();
        }
    }
    
}
