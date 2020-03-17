package model;

public class Cliente {
	
	private String nome;
	private String email;
	private String logradouro;
	private int numero;
	private int rg;
	private int cpf;
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public int getCpf() {
		return cpf;
	}
	public int getRg() {
		return rg;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public void setEmail(String email) {
		this.email = email;	
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	public Cliente(String nome, int rg, int cpf, String logradouro, int numero, String email) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.logradouro = logradouro;
		this.numero = numero;
		this.email = email;
	}
}