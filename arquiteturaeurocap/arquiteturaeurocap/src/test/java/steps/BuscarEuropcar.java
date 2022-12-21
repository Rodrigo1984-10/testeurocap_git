package steps;

import org.junit.Before;
import org.junit.Test;

import drivers.DriversFactory;
import elementos.Elementos;
import metodos.MetodosDeTestes;
import runner.Executa;

public class BuscarEuropcar extends DriversFactory {

	MetodosDeTestes metodo = new MetodosDeTestes();
	Elementos elemento = new Elementos();

	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador(true);

	}

	@Test
	public void buscarEuropcar() throws InterruptedException {
		Thread.sleep(5000);
		metodo.clicar(elemento.btnCloseBuscarEuropcar);
		
		
	}
     public void buscarComercial() throws InterruptedException {
    	 Thread.sleep(5000);
    	 metodo.clicar(elemento.btnComercial);
     
     }
	
	
	
}
