package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.uimaps.CalculaCepMap;
import com.selenium.uimaps.ResultadosBusca;

public class CalculaCepPage {
	WebDriver driver;
	
	public CalculaCepPage(WebDriver driver) {
		this.driver= driver;
	}
	

	CalculaCepMap calculaCepMap = new CalculaCepMap(driver);
	
	public void calcularCep() {
		calculaCepMap.digitaCep.sendKey(driver, "38413-108");
		calculaCepMap.btnCep.click(driver);
	}

	public void ValidaCep() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

			try {
							
				System.out.println("Sucesso!");
			} catch (Exception e) {
				System.out.println("Falha!");
			}
	}
	}


