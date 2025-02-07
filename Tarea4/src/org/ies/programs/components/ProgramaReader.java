package org.ies.programs.components;

import org.ies.programs.model.Archivo;
import org.ies.programs.model.Programa;

import java.util.Scanner;

public class ProgramaReader<T extends Archivo> implements Reader<Programa<T>> {
    private final Scanner scanner;
    private final Reader<T> archivoreader;

    public ProgramaReader(Scanner scanner, Reader<T> archivoreader) {
        this.scanner = scanner;
        this.archivoreader = archivoreader;
    }

    @Override
    public Programa<T> read() {
        System.out.println("Introduce el nombre del programa:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el tamaño del array de archivos:");
        T[] archivos =  (T[]) new Archivo[scanner.nextInt()];
        scanner.nextLine();
        for (int i = 0; i < archivos.length; i++) {
            archivos[i] = archivoreader.read();
        }

        return new Programa<>(
                nombre,
                archivos
        );
    }
}
