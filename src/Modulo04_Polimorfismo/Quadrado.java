package Modulo04_Polimorfismo;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = Math.pow(lado,2);
        System.out.println("A área do Quadrado é igual a: " + area);
    }
}
