package ar.edu.unlp.info.oo1.VolumenYSuperficieDeSolidos;

import java.util.ArrayList;

public class ReporteDeConstruccion {
    private ArrayList<Pieza> piezas;

    public double getVolumenDeMaterial(String nombreDeMaterial) {
        return
        this.piezas.stream().filter(pieza -> pieza.getMaterial() == nombreDeMaterial)
        .mapToDouble(pieza -> pieza.calcularVolumen())
        .sum();
    }

    public double getSuperficieDeColor(String unNombreDeColor) {
        return
        this.piezas.stream().filter(pieza -> pieza.getColor() == unNombreDeColor)
        .mapToDouble(pieza -> pieza.calcularSuperficie())
        .sum();
    }
}