package TestCases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Tasks.CadastroTask;

public class CadastroTestCase {
	
	private WebDriver driver;
	private CadastroTask cadastro;
	
	@Before
	// Iniciando abertura para Url 
	public void iniciar() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		this.driver=new ChromeDriver();
		this.driver.get("https://carrinho.pontofrio.com.br/Checkout?Pagina=cadastrar&ReturnUrl=https://carrinho.pontofrio.com.br&Email=#login");
		this.driver.manage().window().maximize();
		this.cadastro=new CadastroTask(driver);
		
	}
		
	
	@Test
	public void test() throws InterruptedException {
		//Passando valores para o preenchimento dos campos .
		 
		Thread.sleep(3000);
		
		cadastro.preencherCadastro("Ana Vitoria", "03459987668", "Celular",
									"51", "977455688", 
									"Residencial", "51", 
									"34459872", "20", 
									"05", "1996",
									"Femenino", "anavitoria@gmail.com","anavitoria@gmail.com", 
									"123456789", "123456789",
									"Aceito todas as opções abaixo:");
		// fim do teste
		Thread.sleep(3000);
		this.driver.quit();
	}

}
