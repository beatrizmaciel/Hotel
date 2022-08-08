package br.dell.modelos;

public class Hospede {
	
	private long CPF;
	private long RG;
	private String nome;
	private int idade;
	private String endereço;
	
	// construtor sem parâmetros
	public Hospede() {
		super();
	}
	
	// construtor com todos os parâmetros
	public Hospede(long cPF, long rG, String nome, int idade, String endereço) {
		super();
		CPF = cPF;
		RG = rG;
		this.nome = nome;
		this.idade = idade;
		this.endereço = endereço;
	}
	
	// GETTERS & SETTERS
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	public long getRG() {
		return RG;
	}
	public void setRG(long rG) {
		RG = rG;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	

}
