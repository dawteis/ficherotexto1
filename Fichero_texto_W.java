package fich_texto_w;
import java.io.*;

//import java.util.*;
/**
 * ejemplo del libro JAVA head, pag 427
 * Programa que escribe string en un fichero de texto
 * @author C
 */
public class Fich_texto_W {

    public static void main(String[] args) {

        String nombreFichero = "c:/ficherosjava/ejemplo429.txt";
        String cr = System.lineSeparator();
        String frase;
        try {
            // FileWriter ficherito  = new FileWriter (nombreFichero,true); añade
            FileWriter ficherito = new FileWriter(nombreFichero); // crea nuevo
            
            ficherito.write("PRUEBA DE ESCRITURA DE TEXTO" + cr);

            for (int i = 65; i < 91; i++) {

                frase = ("A" + (char) i + cr);
                ficherito.write(frase);

            }
            ficherito.write("FIN  FIN FIN  DE TEXTO" + cr);
            ficherito.close();
            System.out.print("CERRAMOS EL FICHERO");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    } // fin del main

} // fin de la class y de  todo

