package ex1;

public class Ex1 {
    public static void main(String[] args) {
        FormaGeometrica[] formas = {
            new Circulo(5),
            new Retangulo(4, 6),
            new Triangulo(3, 7)
        };

        for (FormaGeometrica f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
}
