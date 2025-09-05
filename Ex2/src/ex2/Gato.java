package ex2;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Gato: Miau!");
    }

    @Override
    public void mover() {
        System.out.println("Gato andando silenciosamente...");
    }
}

