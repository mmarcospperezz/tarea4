package org.ies.programs.model;

import java.util.Objects;

public class Texto extends Archivo {
    private String contenido;

    public Texto(int tamano, String path, String contenido) {
        super(tamano, path);
        this.contenido = contenido;
    }

    @Override
    public void open() {
        System.out.println("Archivo de Texto:");
        System.out.println("Tamaño: " + tamano);
        System.out.println("Path: " + path);
        System.out.println("Contenido: " + contenido);
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Texto texto = (Texto) o;
        return Objects.equals(contenido, texto.contenido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), contenido);
    }

    @Override
    public String toString() {
        return "Texto{" +
                "contenido='" + contenido + '\'' +
                '}';
    }
}
