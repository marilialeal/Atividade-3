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
	
	// Acessar o site: https://wpforms.com/demo/
	// No select “Viewing All Templates” selecionar “FeedBack”
	// Clicar em “View Demo” do card “Neighborhood Events Questionnaire Form Demo”
	// Preencher todos os campos (radio button e textbox) do formulário com qualquer valor.
	// Enviar (Submit) o formulário
	//Validar que foi o formulário foi enviado.
	
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
