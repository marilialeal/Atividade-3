package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class CalculaCepMap {
	WebDriver driver;
	
	public CalculaCepMap(WebDriver driver) {
		this.driver= driver;
	}
	


	public Element digitaCep= new Element (driver, ByValue.XPATH,"//input[@id='calc_cep']");
	public Element btnCep = new Element (driver,ByValue.XPATH,"//input[@value='Calcular Frete']" );
	
	//validar cep
		public Element cep1 = new Element (driver, ByValue.XPATH, "//td[text()='Correios PAC']//following:: td[2]");
		public Element cep2 = new Element (driver, ByValue.XPATH, "//td[text()='Sedex']//following:: td[2]");
		public Element cep3 = new Element (driver, ByValue.XPATH, "//h3[text()='//td[text()='TNT Express']//following:: td[2]");
}



