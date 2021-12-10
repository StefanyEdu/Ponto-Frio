package Tasks;

import java.sql.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import AppObject.CadastroAppObject;


public class CadastroTask {
	 
private CadastroAppObject cadastroAppObject;
	
	public CadastroTask(WebDriver driver) {
		this.cadastroAppObject= new CadastroAppObject(driver);
	}
	
	public void preencherCadastro( String NomeCompleto, String Cpf, String TipoFone1,String Telefone1DDDPF, String Telefone1PF, String TipoFone2
			, String Telefone2DDDPF, String Telefone2PF, String DataNascimentoDia, String DataNascimentoMes,String DataNascimentoAno, String Sexo,
			String Email , String ConfirmarEmail, String  Senha, String ConfirmarSenha,String chkSelecionarTodos) throws InterruptedException {
		

		//iniciando comando para os elementos.
		this.cadastroAppObject.getNomeCompletoTextField().sendKeys(NomeCompleto);
		this.cadastroAppObject.getCpfTextField().sendKeys(Cpf);
		
		Thread.sleep(3000);
		
		this.cadastroAppObject.getTipoFone1TextField().sendKeys(TipoFone1);
		this.cadastroAppObject.getTipoFone1TextField().sendKeys(Keys.ARROW_DOWN);
		this.cadastroAppObject.getTipoFone1TextField().click();
			
		this.cadastroAppObject.getTelefoneTextField().sendKeys(Telefone1DDDPF);
		this.cadastroAppObject.getTelefone1TextField().sendKeys(Telefone1PF);
		
		this.cadastroAppObject.getTipoFone2TextField().sendKeys(TipoFone2);
		this.cadastroAppObject.getTipoFone2TextField().sendKeys(Keys.ARROW_DOWN);
		this.cadastroAppObject.getTipoFone2TextField().click();
		Thread.sleep(3000);
		this.cadastroAppObject.getTelefone2DDDPFTextField().sendKeys(Telefone2DDDPF);
		this.cadastroAppObject.getTelefone2PFTextField().sendKeys(Telefone2PF);
		
		this.cadastroAppObject.getDataNasc1TextField().sendKeys(DataNascimentoDia);
		this.cadastroAppObject.getDataNasc2TextField().sendKeys(DataNascimentoMes);
		this.cadastroAppObject.getDataNasc3TextField().sendKeys(DataNascimentoAno);
		
		this.cadastroAppObject.getSexoTextField().sendKeys(Sexo);
		this.cadastroAppObject.getSexoTextField().sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(3000);
		
		this.cadastroAppObject.getEmailTextField().sendKeys(Email);
		this.cadastroAppObject.getConfirmarEmailTextField().sendKeys(ConfirmarEmail);
		this.cadastroAppObject.getSenhaTextField().sendKeys(Senha);
		this.cadastroAppObject.getConfiSenhaTextField().sendKeys(ConfirmarSenha);
		
		this.cadastroAppObject.getchkSelecionarTextField().sendKeys(chkSelecionarTodos);
		this.cadastroAppObject.getchkSelecionarTextField().click();
		
		
		
		
	}
	

}
