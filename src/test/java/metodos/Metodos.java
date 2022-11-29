package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador() {
		String exemplo = "https://www.google.com/";
		//String teste = "https://www.saucedemo.com/";

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(exemplo);

	}
	
	public void clicar(By element) {
		driver.findElement(element).click();
	}
	
	public void escrever(By element, String text) {
		driver.findElement(element).sendKeys(text);
		
	}
	
	public void submit(By element) {
		driver.findElement(element).submit();
		
	}
	
	public void clear(By elemnt) {
		driver.findElement(elemnt).clear();
	}
	
	public void pause(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void evidenciar(String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
