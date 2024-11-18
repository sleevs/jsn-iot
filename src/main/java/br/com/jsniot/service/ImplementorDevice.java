package br.com.jsniot.service;


public interface ImplementorDevice {

    boolean ligar();
    boolean desligar();
    int maisVolume();
    int menosVolume();
    int getCanal();
    void setCanal(int param);
    
}
