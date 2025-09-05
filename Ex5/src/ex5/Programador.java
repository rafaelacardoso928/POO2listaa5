package ex5;

public class Programador extends Funcionario {
    private double salarioBase;
    private int horasExtras;

    public Programador(String nome, double salarioBase, int horasExtras) {
        super(nome);
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * 50);
    }
}

