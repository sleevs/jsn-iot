package br.com.jsniot;



import br.com.jsniot.service.Contexto;
import br.com.jsniot.service.ControleRemoto;


public class JsnIotApplication {

	public static void main(String[] args) {


		  ControleRemoto cr = new ControleRemoto();
		  cr.power();
		  cr.maisVolume(15);
		  cr.trocarDeCanal(11);
		  cr.power();
	}

}
