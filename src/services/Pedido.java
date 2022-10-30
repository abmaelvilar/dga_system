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
	
	List<Produto> produtos= new ArrayList<>();
		
}
