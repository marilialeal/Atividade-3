package com.selenium.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.selenium.core.Driver;
import com.selenium.pages.BuscaPage;
import com.selenium.pages.CalculaCepPage;
import com.selenium.pages.FormularioPage;
import com.selenium.pages.InicioPage;

public class CT01 {
	WebDriver driver;
	InicioPage inicioPage;
	BuscaPage buscaPage;
	CalculaCepPage calculaCepPage;
	
	//Acessar o site: https://www.kabum.com.br/
	//No input “buscar”, pesquisar: Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite
	//Clicar em “Buscar”
	//Clicar no Link do produto pesquisado
	//No campo “Digite seu CEP” preencher com o CEP: 38413-108
	//Clicar em “Calcular Frete”
	//Validar se os 4 valores de frete são: "R$ 23,39", "R$ 40,97", "R$ 51,79"
	
	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://www.kabum.com.br/");
		inicioPage = new InicioPage(driver);
		buscaPage= new BuscaPage(driver);
		calculaCepPage= new CalculaCepPage(driver);
	}
	
	@Test
	public void test() {
		inicioPage.buscarItem();
		buscaPage.ComprarItem();
		calculaCepPage.calcularCep();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@After
	public void after() {
		Driver.close(driver);
				}
}
