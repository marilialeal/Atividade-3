package com.selenium.pages;

import org.openqa.selenium.WebDriver;

import com.selenium.uimaps.InicioMap;

public class InicioPage {
	WebDriver driver;
	
	public InicioPage(WebDriver driver) {
		this.driver= driver;
	}
	
	InicioMap inicioMap = new InicioMap(driver);
	
	public void buscarItem() {
		inicioMap.buscaElemento.sendKey(driver, "Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite");
		inicioMap.btnBusca.click(driver);
	}

	}

