
package com.mycompany.sgbav;

import clases.ListaDoblementeEnlazada;
import clases.Usuario;
import clases.Nodo;
import clases.Devolucion;
import clases.Historial;
import clases.Libro;
import java.util.Scanner;
import java.util.Calendar;

public class GestionDeDevoluciones {
    
    private ListaDoblementeEnlazada<Devolucion> listaDevoluciones;
    private ListaDoblementeEnlazada<Historial> listaHistorial;
    
    public GestionDeDevoluciones() {
        this.listaDevoluciones = new ListaDoblementeEnlazada<>();
        this.listaHistorial = new ListaDoblementeEnlazada<>();
    }
    
    
    public static void gestionDeDevoluciones(ListaDoblementeEnlazada<Libro> listaLibros, ListaDoblementeEnlazada<Usuario> listaUsuarios){
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
                buscarUsuario(listaUsuarios);

                break;
            case 2:

                break;
            case 3:
                
                break;
            case 4:
                

                break;
            
        }
    }
    
    
    public static void buscarUsuario(ListaDoblementeEnlazada<Usuario> listaUsuarios){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el id del cliente: ");
        String idCliente = scanner.next();
        
        Nodo<Usuario> actual = listaUsuarios.getCabeza();
        boolean encontrado = false;
        while (actual != null) {
            if (actual.dato.getID().equalsIgnoreCase(idCliente)) {
                encontrado = true;
                break;
            }
            actual = actual.siguiente;
        }
        
        if (encontrado) {
            String nombreCliente = actual.dato.getNombre();
            String apellidoCliente = actual.dato.getApellido();
            System.out.print("Usuario encontrado ");
            System.out.print("ID: "+idCliente+" - Nombre: "+nombreCliente+" - Apellido:" +apellidoCliente);

        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}
