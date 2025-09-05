package ex5;

public class Gerente extends Funcionario {
    private double salarioBase;
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome);
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}

