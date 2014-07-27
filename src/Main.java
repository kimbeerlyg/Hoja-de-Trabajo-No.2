
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try{
            // Abrimos el archivo
            FileInputStream texto = new FileInputStream("C:\\Users\\Luis\\Desktop\\Java\\Hoja de Trabajo No.2\\Hoja de Trabajo No.2\\src\\datos.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(texto);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por pantalla
                System.out.println (strLinea);
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        
        
    }
    
}
