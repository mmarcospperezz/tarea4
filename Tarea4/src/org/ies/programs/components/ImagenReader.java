package org.ies.programs.components;

import org.ies.programs.model.Imagen;

import java.util.Scanner;

public class ImagenReader implements Reader<Imagen> {
    private final Scanner scanner;

    public ImagenReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Imagen read() {
        System.out.println("Introduce la altura del archivo de imagen:");
        int altura = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce la anchura del archivo de imagen:");
        int anchura = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el tamaño del archivo de imagen:");
        int tamano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el path del archivo de imagen:");
        String path = scanner.nextLine();

        return new Imagen(
                tamano,
                path,
                altura,
                anchura
        );
    }
}
