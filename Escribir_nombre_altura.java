
package escribir_nombre_altura;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Pide por teclado el nombre de una persona y la altura.
 * lo escribe en un fichero de texto todo como ASCII
 * @author C
 */
public class Escribir_nombre_altura {

      public static void main(String[] args) {
       
        Scanner teclado=new Scanner (System.in);
                   
        
        String nombreFichero = "c:\\ficherosjava\\nombrealt.txt";
        String cr = System.lineSeparator();
        String linea;
        System.out.println ("VAMOS A PEDIR DATOS Y ESCRIBIR EN UN FICHERO");
        try {
            // FileWriter ficherito  = new FileWriter (nombreFichero,true); añade
            FileWriter ficherito = new FileWriter(nombreFichero, true); // 
            
            for (int i=1 ; i<4; i++) { 
            System.out.println("nombre: ");
            String nombre=teclado.next();
              System.out.println("altura: ");
              int altura=teclado.nextInt();
        
               /* pasamos altura a string */
               //String saltura= Integer.toString(altura);
               
               /* componemos la linea que vamos a escribir */
               
              linea = nombre + "-"+altura+cr;
              
              /* scribimos */
              ficherito.write (linea);
               
            }
               
            /* cerramos el fichero */
            
            
            ficherito.close();
            System.out.print("CERRAMOS EL FICHERO");

        } catch (IOException ex) {
            //ex.printStackTrace();
            System.out.print("*********************** PROBLEMAS CON EL FICHERO *******************");
        }
        
//   
       

    } // fin del main
}
