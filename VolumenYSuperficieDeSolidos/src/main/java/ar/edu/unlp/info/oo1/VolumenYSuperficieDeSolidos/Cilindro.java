package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;

public class Cilindro {
    private int radio;
    private int altura;

    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public double calcularSuperficie() {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
    }
}