package entities;

public class Cliente {

	private String nome;
	private String razaoSocial;
	private String cnpj;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	
}	
