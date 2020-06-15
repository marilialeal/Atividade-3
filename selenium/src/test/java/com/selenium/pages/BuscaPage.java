package com.selenium.pages;

import org.openqa.selenium.WebDriver;

import com.selenium.uimaps.InicioMap;
import com.selenium.uimaps.ResultadosBusca;

public class BuscaPage {
	WebDriver driver;
	
	public BuscaPage(WebDriver driver) {
		this.driver= driver;
	}
	

	ResultadosBusca resultadosBusca = new ResultadosBusca(driver);
	
	public void ComprarItem() {
		resultadosBusca.btnComprar.click(driver);
	}

	}



