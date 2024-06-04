package com.mycompany.sgbav;

import clases.Libro;
import clases.ListaDoblementeEnlazada;
import clases.Usuario;

import java.util.Scanner;

public class MenuGestionDeUsuarios {

    public static void menuGestionDeUsuarios(ListaDoblementeEnlazada<Libro> listaLibros, ListaDoblementeEnlazada<Usuario> listaUsuarios) {
        System.out.println("\n***Gestion de usuarios***");
        System.out.println("1. Buscar usuario.");
        System.out.println("2. Eliminar usuario.");
        System.out.println("3. Agregar usuario.");
        System.out.println("4. Ver lista de usuarios.");
        System.out.println("5. Volver.");
        System.out.println("6. Salir.");

        int opcion;
        // envolver en do while para validar opcion ingresada
        System.out.print("Seleccione una opcion: ");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        // finaliza envolver

        switch (opcion)
        {
            case 1:
                menuBuscarUsuario();

                break;
            case 2:
                menuEliminarUsuario();

                break;
            case 3:
                menuAgragarUsuario();

                break;
            case 4:
                // verListaDeUsuarios();
                break;
            case 5:
                MenuPrincipal.menuPrincipal(listaLibros, listaUsuarios);

                break;
            case 6:
                System.exit(0);
        }
    }

    public static void menuBuscarUsuario() {

    }
    public static void menuEliminarUsuario() {

    }
    public static void menuAgragarUsuario() {

    }
    // Probablemente este método sea implementado directamente en la clase usuario y tenga que ser static para poder llamarlo sin crear objeto
    // public void verListaDeUsuarios() {}
}
