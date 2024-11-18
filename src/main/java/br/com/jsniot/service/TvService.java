package br.com.jsniot.service;

public class TvService implements ImplementorDevice{
    
   Integer volume = 0;
   Boolean ligado = false;
   Boolean desliagdo = true;
   Integer numero = 0;
   
   @Override
    public boolean ligar() {
        ligado = true;
        desliagdo =false;
        return ligado;
    }

    @Override
    public boolean desligar() {
        ligado = false;
        desliagdo =true;
        return ligado;
    }

    @Override
    public int maisVolume() {
        
        return ++volume;
    }

    @Override
    public int menosVolume() {
       
         return --volume;
    }

    @Override
    public int getCanal() {
        return numero;
    }

    @Override
    public void setCanal(int param) {
        this.numero = param;
    }
    
}
