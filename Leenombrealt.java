
package leenombrealt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * lee el fichero nombrealtura  lee toda la linea y la muestra tal cual
 * @author C
 */
public class Leenombrealt {

    public static void main(String[] args) throws IOException {
        
        FileInputStream fichero; 
        
        BufferedReader buffer;
        
        InputStreamReader isr;
        
          
       fichero = new FileInputStream("c:\\ficherosjava\\nombrealt.txt");
        
        isr = new InputStreamReader(fichero, "UTF8");
        
        buffer = new BufferedReader(isr);
        
        String linea;
        while ((linea = buffer.readLine()) != null) {
            
            /* lee toda una linea y la mostramos */
            
            System.out.println (" > > > "+ linea);
            
            /* pero podemos obtener los datos de la linea por separado */
            
            if (linea.length() != 0) { // filtra líneas en blanco
                String datos[] = linea.split("-");
// Mostramos los elementos
                System.out.print("Nombre: ");
                System.out.print(datos[0]);
                System.out.print(" altura: ");
                System.out.println (datos[1]);
                
            }
           
            }
        
        buffer.close();   /* cerramos el fichero */
    }
}


