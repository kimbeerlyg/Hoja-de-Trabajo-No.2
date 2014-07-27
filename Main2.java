import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.E;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kimberlyguzman
 */

import java.util.Stack;

public class Main {

    public static void main(String[] args, String[] arrayInfix, String infix, String postfix) {
        try
        {
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
        }catch (IOException e){ //Catch de excepciones
            System.err.println(e.getMessage() + "Ocurrio un error: ");
        }
    
    //Declaración de las pilas
    Stack < String > Entrada = new Stack <  > (); //Pila entrada
    Stack < String > Procedimiento = new Stack <  > (); //Pila temporal para operadores
    Stack < String > Salida = new Stack <  > (); //Pila salida
    
    for (int i = arrayInfix.length - 1; i >= 0; i--) {
            String push = Entrada.push(arrayInfix[i]);
    }
            
     try 
     {
      //Algoritmo Infijo a Postfijo
      while (!Entrada.isEmpty()) 
      {
        switch (pref(Entrada.peek())){
          case 1:
            Procedimiento.push(Entrada.pop());
            break;
          case 3:
          case 4:
            while(pref(Procedimiento.peek()) >= pref(Entrada.peek())) {
              Salida.push(Procedimiento.pop());
            }
            Procedimiento.push(Entrada.pop());
            break; 
          case 2:
            while(!Procedimiento.peek().equals("(")) {
              Salida.push(Procedimiento.pop());
            }
            Procedimiento.pop();
            Entrada.pop();
            break; 
          default:
            Salida.push(Entrada.pop()); 
        }        

    }
        
    }
    
}
