package com.mycompany.sgbav;

import clases.Libro;
import clases.Cliente;
import clases.ListaDoblementeEnlazada;
import java.util.Scanner;

public class MenuPrincipal {

    public static void menuPrincipal(ListaDoblementeEnlazada<Libro> listaLibros, ListaDoblementeEnlazada<Cliente> listaClientes) {
        int opcion;
        GestionDePrestamo gestionPrestamo = new GestionDePrestamo(); // Asegúrate de que esta línea es correcta

        do {
            System.out.println("\n***Biblioteca Abraham Valdelomar***");
            System.out.println("1. Gestion de Clientes");
            System.out.println("2. Gestion de Libros");
            System.out.println("3. Prestamo");
            System.out.println("4. Devolucion");
            System.out.println("5. Mostrar Historial");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opcion: ");
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingrese un número válido: ");
                scanner.next();
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    MenuGestionDeClientes.menuGestionDeClientes(listaClientes, listaLibros);
                    break;
                case 2:
                    MenuGestionDeLibros.menuGestionDeLibros(listaLibros, listaClientes);
                    break;
                case 3:
                    gestionPrestamo.agregarPrestamo(listaLibros, listaClientes);
                    break;
                case 4:
                    GestionDeDevoluciones.gestionDeDevoluciones(listaLibros, listaClientes);
                    break;
                case 5:
                    VisualHistorial visualHistorial = new VisualHistorial(gestionPrestamo.getListaHistorial());
                    visualHistorial.mostrarHistorial();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 6);
    }
}
     
