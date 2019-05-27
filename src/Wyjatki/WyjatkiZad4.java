package Wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WyjatkiZad4 {

    public static void main(String[] args) throws IOException {

        FileReader file =null;

        try{
            file=new FileReader("D:\\Java\\Training\\Week 8 (25-26 May)\\Day 1\\Wyjatki\\lines.txt");

            file.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            file.close();
        }


        Scanner scanner = null;     //musimy przypisac null, bo jest to zmienna lokalna, a program automatycznie nadaje
                                    // wartosc null tylko zmiennym klasowym

        try {
            scanner = new Scanner(new File("lines.txt"));

            while (scanner.hasNextLine()) {
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
