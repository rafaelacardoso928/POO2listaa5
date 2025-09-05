package ex4;

public class PagamentoBoleto extends Pagamento {
    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public double calcularValor() {
        return valor; // sem taxa
    }
}

