package Modulo04_Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Forma a = new Circulo(5.0);
        Forma b = new Quadrado(10.0);

        a.calcularArea();
        b.calcularArea();
    }
}
