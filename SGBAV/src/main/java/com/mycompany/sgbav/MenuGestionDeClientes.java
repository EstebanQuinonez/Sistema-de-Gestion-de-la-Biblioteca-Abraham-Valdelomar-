package com.mycompany.sgbav;

import clases.Cliente;
import clases.Libro;
import clases.ListaDoblementeEnlazada;
import clases.Nodo;
import java.util.Scanner;

public class MenuGestionDeClientes {

    public static void menuGestionDeClientes(ListaDoblementeEnlazada<Libro> listaLibros, ListaDoblementeEnlazada<Cliente> listaClientes) {
        int opcion;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("\n***Gestion de clientes***");
            System.out.println("1. Buscar cliente.");
            System.out.println("2. Eliminar cliente.");
            System.out.println("3. Agregar cliente.");
            System.out.println("4. Ver lista de clientes.");
            System.out.println("5. Volver.");
            System.out.println("6. Salir.");

            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()
            
            if(opcion < 1 || opcion > 6) {
                System.out.println("Elija una opcion válida!");
            }
        } while(opcion < 1 || opcion > 6);

        switch (opcion) {
            case 1:
                menuBuscarCliente(listaLibros, listaClientes);
                break;
            case 2:
                menuEliminarCliente(listaLibros, listaClientes);
                break;
            case 3:
                agregarCliente(listaClientes);
                break;
            case 4:
                verListaDeClientes(listaClientes);
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
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()
            
            if(opcion < 1 || opcion > 5) {
                System.out.println("Elija una opcion válida!");
            }
        } while(opcion < 1 || opcion > 5);

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el ID a buscar: ");
                int ID = scanner.nextInt();
                // Cliente.buscarClientePorID(ID, listaClientes);
                break;
            case 2:
                // Cliente.buscarClientePorNombre()
                break;
            case 3:
                // Cliente.buscarClientePorCorreo()
                break;
            case 4:
                menuGestionDeClientes(listaLibros, listaClientes);
                break;
            case 5:
                System.exit(0);
        }
    }

    public static void menuEliminarCliente(ListaDoblementeEnlazada<Libro> listaLibros, ListaDoblementeEnlazada<Cliente> listaClientes) {
        System.out.println("\n***Menu de eliminación de clientes***");
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
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()
            
            if(opcion < 1 || opcion > 5) {
                System.out.println("Elija una opcion válida!");
            }
        } while(opcion < 1 || opcion > 5);

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el ID a eliminar: ");
                int ID = scanner.nextInt();
                // Cliente.eliminarClientePorID(ID, listaClientes);
                break;
            case 2:
                // Cliente.eliminarClientePorNombre()
                break;
            case 3:
                // Cliente.eliminarClientePorCorreo()
                break;
            case 4:
                menuGestionDeClientes(listaLibros, listaClientes);
                break;
            case 5:
                System.exit(0);
        }
    }

    public static void agregarCliente(ListaDoblementeEnlazada<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del cliente: ");
        String ID = scanner.nextLine();
        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el correo del cliente: ");
        String correo = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(ID, nombre, correo);
        listaClientes.agregarElemento(nuevoCliente);
        System.out.println("Cliente agregado exitosamente.");
    }

    public static void verListaDeClientes(ListaDoblementeEnlazada<Cliente> listaClientes) {
        Nodo<Cliente> actual = listaClientes.getCabeza();
        if (actual == null) {
            System.out.println("No hay clientes disponibles.");
        } else {
            while (actual != null) {
                System.out.println(actual.getDato().toString());
                actual = actual.getSiguiente();
            }
        }
    }
}
