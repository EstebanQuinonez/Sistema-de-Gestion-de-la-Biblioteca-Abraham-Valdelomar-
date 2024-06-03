
package com.mycompany.sgbav;

import clases.ListaDoblementeEnlazada;
import clases.Usuario;
import clases.Nodo;
import clases.Devolucion;
import clases.Libro;
import java.util.Scanner;


public class GestionDeDevoluciones {
    
    private ListaDoblementeEnlazada<Devolucion> listaDevoluciones;
    
    public static void gestionDeDevoluciones(ListaDoblementeEnlazada<Libro> listaLibros){
        System.out.println("\n***Gestion de Devoluciones***");
        System.out.println("1. Buscar usuario por ID");
        System.out.println("2. Mostrar lista de libros prestados");
        System.out.println("3. Devolver libro");
        System.out.println("4. Volver.");
        
        int opcion;
        
        System.out.print("Seleccione una opcion: ");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        

        switch (opcion)
        {
            case 1:
                

                break;
            case 2:

                break;
            case 3:
                
                break;
            case 4:
                

                break;
            
        }
    }
    
    public GestionDeDevoluciones() {
        this.listaDevoluciones = new ListaDoblementeEnlazada<>();
    }
    
    public static void buscarUsuario(ListaDoblementeEnlazada<Usuario> listaLibros){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el id del cliente: ");
        String idCliente = scanner.next();
        
        
    }
}
