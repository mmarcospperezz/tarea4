import org.ies.programs.components.*;
import org.ies.programs.model.Programa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextoReader textoReader = new TextoReader(scanner);
        AudioReader audioReader = new AudioReader(scanner);
        ImagenReader imagenReader = new ImagenReader(scanner);
        ArchivoReader archivoReader = new ArchivoReader(scanner, textoReader, imagenReader, audioReader);
        ProgramaReader programaReader = new ProgramaReader(scanner, archivoReader);

        Programa programa = programaReader.read();
        String outPutPath = scanner.nextLine();
        programa.execute(outPutPath);
    }
}