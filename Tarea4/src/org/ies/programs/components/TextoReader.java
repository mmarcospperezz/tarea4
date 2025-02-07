package org.ies.programs.components;

import org.ies.programs.model.Texto;

import java.util.Scanner;

public class TextoReader implements Reader<Texto> {
    private final Scanner scanner;

    public TextoReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Texto read() {
        System.out.println("Introduce el contenido del archivo de texto:");
        String contenido = scanner.nextLine();
        System.out.println("Introduce el tamaño del archivo de texto:");
        int tamano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el path del archivo de texto:");
        String path = scanner.nextLine();

        return new Texto(
                tamano,
                path,
                contenido
        );
    }
}