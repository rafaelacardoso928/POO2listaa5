package ex4;

public class Ex4 {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
            new PagamentoCartaoCredito(1000),
            new PagamentoBoleto(1000)
        };

        for (Pagamento p : pagamentos) {
            System.out.println("Valor final: " + p.calcularValor());
        }
    }
}

