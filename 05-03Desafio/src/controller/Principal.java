package controller;

import model.ContaCorrente;
import model.ContaPoupanca;
import model.Cliente;

public class Principal {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Jorgim");
		Cliente c2 = new Cliente("Jorge");
		Cliente c3 = new Cliente("Jorgao");
		
		ContaPoupanca cp01 = new ContaPoupanca(c1, "00001-1", "0000-1", 0);
		ContaCorrente cc01 = new ContaCorrente(c2, "00001-1", "0000-2", 100, 300);
		ContaCorrente cc02 = new ContaCorrente(c3, "00001-1", "0000-3", 0, 300);
		
		cp01.depositar(100);
		cp01.transferir(cc02, 96);
		cp01.ImprimirSaldo();
		
		cc01.transferir(cc02, 200);
		cc01.ImprimirSaldo();
		
		cc02.ImprimirSaldo();
		
		//Linha para teste commit
		
	}
}
