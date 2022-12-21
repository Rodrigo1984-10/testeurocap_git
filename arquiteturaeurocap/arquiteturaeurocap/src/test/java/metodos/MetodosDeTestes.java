package metodos;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
		
	}
	public void button (By elemento ) {
		driver.findElement(elemento).sendKeys("comercial");

	
	}
		
		
	
	
	
}





