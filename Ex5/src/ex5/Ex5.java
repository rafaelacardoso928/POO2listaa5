package ex5;

public class Ex5 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
            new Gerente("Rafa", 5000, 2000),
            new Programador("Gaby", 3000, 10)
        };

        for (Funcionario f : funcionarios) {
            System.out.println(f.nome + " - Salário: " + f.calcularSalario());
        }
    }
}

