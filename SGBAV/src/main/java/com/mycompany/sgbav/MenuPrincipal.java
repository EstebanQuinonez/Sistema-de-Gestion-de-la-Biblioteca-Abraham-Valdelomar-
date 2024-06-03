package com.mycompany.sgbav;

import clases.Libro;
import clases.ListaDoblementeEnlazada;
import java.util.Scanner;

public class MenuPrincipal {

    public static void menuPrincipal(ListaDoblementeEnlazada<Libro> listaLibros) {
        int opcion;
        GestionDePrestamo gestionPrestamo = new GestionDePrestamo(); // Asegúrate de que esta línea es correcta

        do {
            System.out.println("\n***Biblioteca Abraham Valdelomar***");
            System.out.println("1. Gestion de Usuarios");
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
                    MenuGestionDeUsuarios.menuGestionDeUsuarios(listaLibros);
                    break;
                case 2:
                    MenuGestionDeLibros.menuGestionDeLibros(listaLibros);
                    break;
                case 3:
                    gestionPrestamo.agregarPrestamo(listaLibros); // Esta línea debería funcionar si todo está correctamente definido
                    break;
                case 4:
                    GestionDeDevoluciones.gestionDeDevoluciones(listaLibros);
                    break;
                case 5:
                    System.out.println("Completarr");
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
     
