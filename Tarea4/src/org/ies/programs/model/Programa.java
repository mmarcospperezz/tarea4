package org.ies.programs.model;

import java.util.Arrays;
import java.util.Objects;

public class Programa<T extends Archivo> {
    private String nombre;
    private T[] archivos;

    public Programa(String nombre, T[] archivos) {
        this.nombre = nombre;
        this.archivos = archivos;
    }

    public void execute(String outputPath) {
        System.out.println("Ejecutando programa: " + nombre);
        for (T archivo : archivos) {
            archivo.open();
            archivo.move(outputPath);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public T[] getArchivos() {
        return archivos;
    }

    public void setArchivos(T[] archivos) {
        this.archivos = archivos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programa<?> programas = (Programa<?>) o;
        return Objects.equals(nombre, programas.nombre) && Objects.deepEquals(archivos, programas.archivos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Arrays.hashCode(archivos));
    }

    @Override
    public String toString() {
        return "Programas{" +
                "nombre='" + nombre + '\'' +
                ", archivos=" + Arrays.toString(archivos) +
                '}';
    }
}