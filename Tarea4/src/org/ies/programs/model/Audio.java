package org.ies.programs.model;

import java.util.Objects;

public class Audio extends Archivos {
    private int duracion;

    public Audio(int tamano, String path, int duracion) {
        super(tamano, path);
        this.duracion = duracion;
    }

    @Override
    public void open() {
        System.out.println("Archivo de Audio:");
        System.out.println("Tamaño: " + tamano);
        System.out.println("Path: " + path);
        System.out.println("Duración: " + duracion);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Audio audio = (Audio) o;
        return duracion == audio.duracion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duracion);
    }

    @Override
    public String toString() {
        return "Audio{" +
                "duracion=" + duracion +
                '}';
    }
}
