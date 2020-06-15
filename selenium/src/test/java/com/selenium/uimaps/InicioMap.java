package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class InicioMap {
	WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver= driver;
	}

	public Element buscaElemento= new Element (driver, ByValue.XPATH,"//input[@class='sprocura']");
	public Element btnBusca= new Element(driver, ByValue.ID, "bt-busca");
	
	
}
