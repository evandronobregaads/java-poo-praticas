package Modulo04_Polimorfismo;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double areaCirculo = Math.PI * Math.pow(raio,2);
        System.out.printf("A área do Círculo é igual a: %.4f%n" , areaCirculo);
    }
}
