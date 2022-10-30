package services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Cliente;
import entities.Produto;

public class Pedido {

	private LocalDate data;
	private long numero;
	private Cliente cliente;
	private int quantidade;
	
	List<Produto> produtos = new ArrayList<>();

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}		
	
}
