package model;

public abstract class Conta {
	
	protected double saldo;
	private double saldoA;
	private double taxaSac = 0.30;
	private double taxaTrans = 4;
	private String agencia;
	private String numero;
	private Cliente cli;
		
	public abstract boolean sacar(double saque);
	public void depositar(double valor) {
		if(valor > 0) {
			setSaldoA(getSaldo());
			setSaldo(getSaldo() + valor);	
		} else {
			erro(1);
		}
	}
	public void transferir(Conta dest, double valor) {
		if(sacar(valor + taxaTrans)) {
			if(this == dest)
				dest.depositar(valor);
			else
				System.out.println("Não é pertimito transefrir para você mesmo.");
		}
	}
	public void ImprimirSaldo() {
		String ret;
		
		ret = "\nCliente: " + cli.getNome()+
				"\n Agencia: " + agencia+
				"\n Conta: " + numero+
				"\n Saldo: R$" + saldo;
		
		System.out.println(ret);
	}
	
	public double getTaxaTrans() {
		return taxaTrans;
	}
	public void setTaxaTrans(double taxaTrans) {
		 this.taxaTrans = taxaTrans;
	}
	public double getTaxaSac() {
		return taxaSac;
	}
	public void setTaxaSac(double taxaSac) {
		this.taxaSac = taxaSac;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldoA() {
		return saldoA;
	}
	public void setSaldoA(double saldoA) {
		this.saldoA = saldoA;
	}
	public Cliente getCli() {
		return cli;
	}
	public void setCli(Cliente cli) {
		this.cli = cli;
	}
		
	public Conta(double saldo, String agencia, String numero, Cliente cli) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.cli = cli;
	}
	
	public void erro(int e) {
		String ret = "Erro:\n ";
		switch(e) {
		case 0://saldo insuficiente
			ret += "Saldo Insuficiente.\n";
			break;
		case 1://valor de depósito negativo
			ret += "Valor para depósito é negativo.\n";
			break;
		}
		System.out.println(ret);
	}
}