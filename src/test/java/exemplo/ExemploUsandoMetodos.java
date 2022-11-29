package exemplo;

import org.junit.Test;
import org.openqa.selenium.By;

import metodos.Metodos;

public class ExemploUsandoMetodos {
	
	Metodos metodos = new Metodos();
	
	By name = By.name("q");
	
	@Test
	public void testeDeExemplo() {
		metodos.abrirNavegador();
		metodos.evidenciar("CT 1 - Antes de escrever");
		metodos.escrever(name, "Tecnologia");
		metodos.pause(2000);
		metodos.evidenciar("CT 2 - Depois que escreveu");
		metodos.clear(name);
		metodos.evidenciar("CT 3 - Depois que apagou");
		metodos.pause(5000);
		metodos.escrever(name, "Tecnologia");
		metodos.evidenciar("CT 4 - Escreveu novamente");
		metodos.submit(name);
		metodos.evidenciar("CT 5 - Pesquisamos");
	}
	

}
