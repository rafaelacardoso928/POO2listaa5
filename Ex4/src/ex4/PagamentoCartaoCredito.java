package ex4;

public class PagamentoCartaoCredito extends Pagamento {
    public PagamentoCartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public double calcularValor() {
        return valor * 1.05; // taxa de 5%
    }
}

