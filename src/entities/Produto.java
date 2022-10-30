package entities;

public class Produto {
	
	private String nome;
	private float preco;
	private long ncm;
	
	public long getNcm() {
		return ncm;
	}

	public String getNome() {
		return nome;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}	
	
	public void setNcm(long ncm) {
		this.ncm = ncm;
	}
}
