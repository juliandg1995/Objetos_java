package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;

public class Esfera {
    private int radio;

    public double calcularVolumen() {
        return 4/3 * Math.PI * Math.pow(radio, 2);
    }

    public double calcularSuperficie() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}