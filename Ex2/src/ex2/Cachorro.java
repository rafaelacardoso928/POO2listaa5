package ex2;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Cachorro: Au au!");
    }

    @Override
    public void mover() {
        System.out.println("Cachorro correndo...");
    }
}

