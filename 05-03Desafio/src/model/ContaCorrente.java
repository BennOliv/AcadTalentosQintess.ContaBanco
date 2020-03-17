package model;

public class ContaCorrente extends Conta{

	private double taxaEsp = 2;
	private double valorChequeEspecial;
	
	@Override
	public boolean sacar(double valor){
		valor += getTaxaSac();
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else if(this.saldo + valorChequeEspecial>= valor + taxaEsp){
			this.saldo -= (valor + taxaEsp);
			return true;
		} else {
			erro(0);
			return false;
		}
	}
	
	public double getTaxaEsp() {
		return taxaEsp;
	}
	public void setTaxaEsp(double valorTaxa) {
		this.taxaEsp = valorTaxa;
	}
	public double getValorChequeEspecial() {
		return valorChequeEspecial;
	}
	public void setValorChequeEspecial(double valorChequeEspecial) {
		this.valorChequeEspecial = valorChequeEspecial;
	}
	
	public ContaCorrente( Cliente cli, String agencia, String numero,double saldo,double valorChequeEspecial) {
		super(saldo, agencia, numero, cli);
		setValorChequeEspecial(valorChequeEspecial);
	}
}
