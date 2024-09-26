/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_pantalla_inicio;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_15_PANTALLA_INICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONSTANTES
        final String USUARIO = "Admin"; //Lo que haces es bloquear la variable y no deja modificarlo
        final String CONTRASENA = "Admin"; 
        //final double PI = 3.1416; 
        
        
        String Usuario;
        String Contrasena;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Escribe tu usuario: ");
        Usuario = captu.nextLine();
        System.out.println("Introduce tu contraseña: ");
        Contrasena = captu.nextLine();
        //Como validamos el acceso?
        if (Usuario.equals(USUARIO)&& Contrasena.equals(CONTRASENA)){
            System.out.println("ACCESO CONCEDIDO");
        }else{ 
      System.out.println("ACCESO DENEGADO");
        
        
    }
    
}

}