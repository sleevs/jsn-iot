package br.com.jsniot.service;

public class ControleRemoto implements AbstractionControle{

    private ImplementorDevice televisao = new TvService();
    private Contexto context ;
    public ControleRemoto(){
        context = new Contexto();
      
    }
    
    public void power() {
        context.request();
        context.mudar();
    }

    @Override
    public int maisVolume(int param) {
       
        System.out.println("MAIS VOLUME " + televisao.maisVolume());
        return televisao.maisVolume() + param;
    }

    @Override
    public int menosVolume(int param) {
       
        System.out.println("MENOS VOLUME " + televisao.menosVolume());
        return televisao.menosVolume() - param;
    }

    @Override
    public int trocarDeCanal(int param) {
        televisao.setCanal(param);
        System.out.println("CANAL SELECIONADO " + televisao.getCanal());
       return televisao.getCanal();
    }
    
}
