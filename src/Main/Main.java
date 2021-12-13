package Main;

import Model.Cliente;
import Model.Conta;
import Model.ContaCorrente;
import Model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Dielme", "1234");
        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);

        contaCorrente.depositar(100);
        contaCorrente.transferir(contaPoupanca, 40);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}
