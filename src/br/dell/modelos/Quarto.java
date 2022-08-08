package br.dell.modelos;

public class Quarto {
	
	private int numero;
	private Hospede hospede;

	// construtor que recebe todos os parâmetros
	public Quarto(int numero, Hospede hospede) {
		super();
		this.numero = numero;
		this.hospede = hospede;
	}

	
	// GETTERS & SETTERS
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	
	
	
	
	

}
