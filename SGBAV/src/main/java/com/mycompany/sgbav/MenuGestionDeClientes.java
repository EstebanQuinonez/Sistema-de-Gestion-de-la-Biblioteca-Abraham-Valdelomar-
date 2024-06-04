package com.mycompany.sgbav;

import clases.Cliente;
import clases.Libro;
import clases.ListaDoblementeEnlazada;

import java.util.Scanner;

public class MenuGestionDeClientes {

    public static void menuGestionDeClientes(ListaDoblementeEnlazada<Libro> listaLibros, ListaDoblementeEnlazada<Cliente> listaClientes) {
        System.out.println("\n***Gestion de clientes***");
        System.out.println("1. Buscar cliente.");
        System.out.println("2. Eliminar cliente.");
        System.out.println("3. Agregar cliente.");
        System.out.println("4. Ver lista de clientes.");
        System.out.println("5. Volver.");
        System.out.println("6. Salir.");

        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 && opcion != 6) {
                System.out.println("Elija una opcion válida!");
            }
        } while(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 && opcion != 6);

        switch (opcion)
        {
            case 1:
                menuBuscarCliente(listaLibros, listaClientes);

                break;
            case 2:
                menuEliminarCliente(listaLibros, listaClientes);

                break;
            case 3:
                // inicialización provisional
                int ID = 0;
                String nombre = "nn";
                String correo = "nn";
                //
                Cliente.agregarCliente(ID, nombre, correo, listaClientes);

                break;
            case 4:
                // verListaDeUsuarios();
                break;
            case 5:
                MenuPrincipal.menuPrincipal(listaLibros, listaClientes);

                break;
            case 6:
                System.exit(0);
        }
    }

    public static void menuBuscarCliente(ListaDoblementeEnlazada<Libro> listaLibros, ListaDoblementeEnlazada<Cliente> listaClientes) {
        System.out.println("\n***Menu de búsqueda de clientes***");
        System.out.println("1. Buscar cliente por ID.");
        System.out.println("2. Buscar cliente por nombre.");
        System.out.println("3. Buscar cliente por correo.");
        System.out.println("4. Volver.");
        System.out.println("5. Salir.");

        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5) {
                System.out.println("Elija una opcion válida!");
            }
        } while(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5);

        switch (opcion)
        {
            case 1:
                System.out.println("Ingrese el ID a buscar: ");
                int ID = scanner.nextInt();
                Cliente.buscarClientePorID(ID, listaClientes);

                break;
            case 2:
                // Cliente.buscarClientePorNombre()

                break;
            case 3:
                // Cliente.buscarClientePorCorreo()

                break;
            case 4:
                MenuGestionDeClientes.menuGestionDeClientes(listaLibros, listaClientes);

                break;
            case 5:
                System.exit(0);
        }
    }

    public static void menuEliminarCliente(ListaDoblementeEnlazada<Libro> listaLibros, ListaDoblementeEnlazada<Cliente> listaClientes) {

        System.out.println("\n***Menu de búsqueda de clientes***");
        System.out.println("1. Eliminar cliente por ID.");
        System.out.println("2. Eliminar cliente por nombre.");
        System.out.println("3. Eliminar cliente por correo.");
        System.out.println("4. Volver.");
        System.out.println("5. Salir.");

        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5) {
                System.out.println("Elija una opcion válida!");
            }
        } while(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5);

        switch (opcion)
        {
            case 1:
                System.out.println("Ingrese el ID a buscar: ");
                int ID = scanner.nextInt();
                Cliente.eliminarClientePorID(ID, listaClientes);

                break;
            case 2:
                // Cliente.eliminarClientePorNombre()

                break;
            case 3:
                // Cliente.eliminarClientePorCorreo()

                break;
            case 4:
                MenuGestionDeClientes.menuGestionDeClientes(listaLibros, listaClientes);

                break;
            case 5:
                System.exit(0);
        }
    }
    // public static void agregarCliente() {}

    // Probablemente este método sea implementado directamente en la clase usuario y tenga que ser static para poder llamarlo sin crear objeto
    // public void verListaDeUsuarios() {}
}
