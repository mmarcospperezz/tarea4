package org.ies.programs.model;

import java.util.Objects;

public abstract class Archivo {
    protected int tamano;
    protected String path;

    public Archivo(int tamano, String path) {
        this.tamano = tamano;
        this.path = path;
    }

    public abstract void open();

    public void move(String newPath) {
        if ( path.equals(newPath)) {
            System.out.println("No hay cambios");
        } else {
            path = newPath;
            System.out.println("Se ha movido el fichero a " + newPath);
        }
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Archivo archivos = (Archivo) o;
        return tamano == archivos.tamano && Objects.equals(path, archivos.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tamano, path);
    }

}
