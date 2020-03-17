package model;

public class ContaPoupanca extends Conta{
	
	@Override
	public boolean sacar(double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		} else {
			erro(0);
			return false;
		}
	}
	
	public ContaPoupanca( Cliente cli, String agencia, String numero, double saldo) {
		super(saldo, agencia, numero, cli);
	}
}