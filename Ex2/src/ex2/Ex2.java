package ex2;

public class Ex2 {
    public static void main(String[] args) {
        Animal[] animais = {new Cachorro(), new Gato(), new Passaro()};

        for (Animal a : animais) {
            a.emitirSom();
            a.mover();
            System.out.println();
        }
    }
}

