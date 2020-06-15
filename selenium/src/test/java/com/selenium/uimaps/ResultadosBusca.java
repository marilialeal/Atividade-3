package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class ResultadosBusca {
	WebDriver driver;
	
	public ResultadosBusca(WebDriver driver) {
		this.driver= driver;
	}
	


	public Element btnComprar= new Element (driver, ByValue.XPATH,"//img[@src='https://static.kabum.com.br/conteudo/temas/001/imagens/icones/comprar.png']");
	
	
}

