package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriversFactory;
import elementos.Elementos;
import io.github.bonigarcia.wdm.WebDriverManager;
import metodos.MetodosDeTestes;

public class Executa extends DriversFactory {

	Elementos elemento = new Elementos();
	MetodosDeTestes metodo = new MetodosDeTestes();

	public static void abrirNavegador(boolean headless) {
		String ambiente = "https://www.europcar.pt/pt-pt";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		if (!headless) {
			chromeOptions.addArguments("--headless");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(ambiente);

	}

	public void clicar(By elemento) {

	}


	public static void fecharNavegador() {
		driver.quit();
}

	}