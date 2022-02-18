package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;

public class PrismaRectangular {
    private int ladoMayor;
    private int ladoMenor;
    private int altura;

    public double calcularVolumen() {
        return ladoMayor * ladoMenor * altura;
    }

    public double calcularSuperficie() {
        return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
    }
}