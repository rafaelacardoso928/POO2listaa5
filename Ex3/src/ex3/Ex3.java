package ex3;

public class Ex3 {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente(1000);
        ContaBancaria cp = new ContaPoupanca(500);

        cc.depositar(200);
        cc.sacar(100);

        cp.depositar(200);
        cp.sacar(50);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
    }
}

