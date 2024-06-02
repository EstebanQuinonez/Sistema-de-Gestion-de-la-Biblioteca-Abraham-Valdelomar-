package com.mycompany.sgbav;

import clases.Libro;
import clases.ListaDoblementeEnlazada;

import java.util.Scanner;

public class MenuPrincipal {

    public static void menuPrincipal(ListaDoblementeEnlazada<Libro> listaLibros) {
            System.out.println("***Biblioteca Abraham Valdelomar***");
            System.out.println("1. Gestion de Usuarios");
            System.out.println("2. Gestion de Libros");
            System.out.println("3. Prestamo");
            System.out.println("4. Devolucion");
            System.out.println("5. Mostrar Historial");
            System.out.println("6. Salir");


            int opcion;
            System.out.print("Seleccione una opcion: ");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion)
            {
                case 1:
                    MenuGestionDeUsuarios.menuGestionDeUsuarios(listaLibros);

                    break;
                case 2:
                    MenuGestionDeLibros.menuGestionDeLibros(listaLibros);

                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Completar");

                    break;
                case 5:
                    System.out.println("Completarr");

                    break;
                case 6:
                    System.exit(0);
                    break;
            }
    }

}
