package org.ies.programs.model;

import java.util.Objects;

public class Imagen extends Archivo {
    private int altura;
    private int anchura;

    public Imagen(int tamano, String path, int altura, int anchura) {
        super(tamano, path);
        this.altura = altura;
        this.anchura = anchura;
    }

    @Override
    public void open() {
        System.out.println("Archivo de Imagen:");
        System.out.println("Tamaño: " + tamano);
        System.out.println("Path: " + path);
        System.out.println("Altura: " + altura);
        System.out.println("Anchura: " + anchura);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Imagen imagen = (Imagen) o;
        return altura == imagen.altura && anchura == imagen.anchura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), altura, anchura);
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "altura=" + altura +
                ", anchura=" + anchura +
                '}';
    }
}
