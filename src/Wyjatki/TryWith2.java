package Wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// IOException --> Input Output exception - zbiór wyjatkow mogacych wystapic podczas obslugi plikow

public class TryWith2 {

    public static void main(String[] args) throws IOException {

        FileWriter writer = null;

        try {
            writer = new FileWriter("D:\\Java\\Training\\Week 8 (25-26 May)\\Day 1\\Wyjatki\\pliktekst.txt");
            writer.write("Hello word");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();        // zeby to dzialalo, musi byc na gorze w metodzie rzucanie wyjatku IOException
        }

        System.out.println("Sukces!");

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("pliktekst.txt"));

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        } finally {
            if(scanner !=null) {
                scanner.close();
            }
        }
    }
}
