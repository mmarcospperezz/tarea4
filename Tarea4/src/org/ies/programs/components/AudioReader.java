package org.ies.programs.components;

import org.ies.programs.model.Audio;

import java.util.Scanner;

public class AudioReader implements Reader<Audio> {
    private final Scanner scanner;

    public AudioReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Audio read() {

        System.out.println("Introduce la duracion del archivo de audio:");
        int duracion = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el tamaño del archivo de audio:");
        int tamano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el path del archivo de audio");
        String path = scanner.nextLine();

        return new Audio(
                tamano,
                path,
                duracion
        );
    }
}
