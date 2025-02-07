package org.ies.programs.components;

import org.ies.programs.model.Archivo;

import java.util.Scanner;

public class ArchivoReader implements Reader<Archivo> {
    private final Scanner scanner;
    private final TextoReader textoReader;
    private final ImagenReader imagenReader;
    private final AudioReader audioReader;

    public ArchivoReader(Scanner scanner, TextoReader textoReader, ImagenReader imagenReader, AudioReader audioReader) {
        this.scanner = scanner;
        this.textoReader = textoReader;
        this.imagenReader = imagenReader;
        this.audioReader = audioReader;
    }

    @Override
    public Archivo read() {
       chooseOption();
       int option = scanner.nextInt();
       if (option == 1){
         return textoReader.read();
       }
       if (option == 2){
            return audioReader.read();
       } else{
            return imagenReader.read();
        }
    }

    public  int chooseOption() {
        int option;

        do {
            System.out.println("Elige una opción:");
            System.out.println("1.Archivo de texto");
            System.out.println("2.Archivo de audio");
            System.out.println("3.Archivo de imagen");
            System.out.print("Ingresa tu elección:");

            option = scanner.nextInt();

        } while (option < 1 || option > 3);


        return option;
    }
}
