package elementos;

import org.openqa.selenium.By;

import drivers.DriversFactory;
import metodos.MetodosDeTestes;

public class Elementos extends DriversFactory {

	MetodosDeTestes metodos = new MetodosDeTestes();
	

	public By btnCloseBuscarEuropcar = By.xpath("//button[@id='didomi-notice-agree-button']");
	                                             
	public By btnComercial = By.xpath("//*[@class=\"ecw-vehicle-filter__options\"]/div[2]/button");
	

}