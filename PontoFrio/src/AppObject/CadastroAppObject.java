package AppObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroAppObject {
	
	//chamando WebDriver-selenion 
	private WebDriver driver; 
	
	public CadastroAppObject(WebDriver driver) {
		this.driver = driver;
		}
	
		// iniciando os metodos para os elementos 
	
		// elementos do cadastro
	
		//Campo Nome Completo
	    public WebElement getNomeCompletoTextField() {
	    	return this.driver.findElement(By.id("NomeCompleto"));
	    }
	    
	    //Campo CPF
	    public WebElement getCpfTextField() {
	    	return this.driver.findElement(By.id("Cpf"));
	    }
	    
	    //Campos telefones
	    public WebElement getTipoFone1TextField() {
	    	return this.driver.findElement(By.id("TipoFone1"));
	    }
	    
	    public WebElement getTelefoneTextField() {
	    	return this.driver.findElement(By.id("Telefone1DDDPF"));
	    }
	    public WebElement getTelefone1TextField() {
	    	return this.driver.findElement(By.id("Telefone1PF"));
	    }
	    
	    public WebElement getTipoFone2TextField() {
	    	return this.driver.findElement(By.id("TipoFone2"));
	    }
	    
	    public WebElement getTelefone2DDDPFTextField() {
	    	return this.driver.findElement(By.id("Telefone2DDDPF"));
	    }
	    
	    public WebElement getTelefone2PFTextField() {
	    	return this.driver.findElement(By.id("Telefone2PF"));
	    }
	    //Campo Data Nascimento.
	    public WebElement getDataNasc1TextField() {
	    	return this.driver.findElement(By.id("DataNascimentoDia"));
	    }
	    
	    public WebElement getDataNasc2TextField() {
	    	return this.driver.findElement(By.id("DataNascimentoMes"));
	    }
	    
	    
	    public WebElement getDataNasc3TextField() {
	    	return this.driver.findElement(By.id("DataNascimentoAno"));
	    }
	    //Campo Sexo
	    
	    public WebElement getSexoTextField() {
	    	return this.driver.findElement(By.id("Sexo"));
	    }
	    
	    //Campo E-mail
	    public WebElement getEmailTextField() {
	    	return this.driver.findElement(By.id("Email"));
	    }
	    
	    public WebElement getConfirmarEmailTextField() {
	    	return this.driver.findElement(By.id("ConfirmarEmail"));
	    }
	    
	    //Campo Senha
	    public WebElement getSenhaTextField() {
	    	return this.driver.findElement(By.id("Senha"));
	    }
	    
	    public WebElement getConfiSenhaTextField() {
	    	return this.driver.findElement(By.id("ConfirmarSenha"));
	    }
	    
	    //Campos CheckBox
	    public WebElement getchkSelecionarTextField() {
	    	return this.driver.findElement(By.xpath("//*[@id=\"cliente_cadastro\"]/form/section/div[3]/fieldset[2]/p[1]/label")); 
	    }
	    
	    public WebElement getReceberAvisoEmailTextField() {
	    	return this.driver.findElement(By.id("ReceberAvisoEmail")); 
	    }
	    
	    public WebElement getReceberWhaTextField() {
	    	return this.driver.findElement(By.id("ReceberWhatsApp"));
	    }
	    public WebElement getCompartilhaTextField() {
	    	return this.driver.findElement(By.id("CompartilharDadosComParceiros"));
	    }
	    public WebElement getAceitoTermoUsoTextField() {
	    	return this.driver.findElement(By.id("AceitoTermoUso"));
	    }
	   
	    
	    
	    
	    
	

}
