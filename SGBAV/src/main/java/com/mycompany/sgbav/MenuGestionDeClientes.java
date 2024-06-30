package com.mycompany.sgbav;

import clases.Cliente;
import clases.ListaDoblementeEnlazada;
import clases.Libro;
import clases.Nodo;

import java.util.Scanner;

public class MenuGestionDeClientes {

    public static void menuGestionDeClientes(ListaDoblementeEnlazada<Cliente> listaClientes, ListaDoblementeEnlazada<Libro> listaLibros) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Gestion de Clientes ***");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Editar Cliente");
            System.out.println("3. Eliminar Cliente");
            System.out.println("4. Ver Lista de Clientes");
            System.out.println("5. Volver al Menu Principal");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarCliente(listaClientes);
                    break;
                case 2:
                    editarCliente(listaClientes);
                    break;
                case 3:
                    eliminarCliente(listaClientes);
                    break;
                case 4:
                    System.out.println("*** Lista de Clientes ***");
                    listaClientes.verLista();
                    break;
                case 5:
                    MenuPrincipal.menuPrincipal(listaLibros, listaClientes);
                    break;
                case 6:
                    System.out.println("Saliendo del menu de gestion de clientes.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida, por favor intente de nuevo.");
            }
        } while (opcion != 6);
    }

    private static void agregarCliente(ListaDoblementeEnlazada<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del cliente: ");
        String ID = scanner.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el correo del cliente: ");
        String correo = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(ID, nombre, correo);
        listaClientes.agregarElemento(nuevoCliente);
        System.out.println("Cliente registrado correctamente.");
    }

    private static void eliminarCliente(ListaDoblementeEnlazada<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar la lista de clientes
        System.out.println("*** Clientes ***");
        System.out.println("ID - Nombre - Correo");
        listaClientes.verLista();

        System.out.print("Ingrese el ID del cliente que desea eliminar: ");
        String idClienteEliminar = scanner.nextLine();

        // Buscar el cliente por ID
        Nodo<Cliente> actual = listaClientes.getCabeza();
        Cliente clienteEliminar = null;
        while (actual != null) {
            if (actual.getDato().getID().equalsIgnoreCase(idClienteEliminar)) {
                clienteEliminar = actual.getDato();
                break;
            }
            actual = actual.getSiguiente();
        }

        if (clienteEliminar != null) {
            // Eliminar el elemento en la lista
            boolean eliminado = listaClientes.eliminarElemento(clienteEliminar);

            if (eliminado) {
                System.out.println("Cliente con ID: \"" + idClienteEliminar + "\" se elimino correctamente.");
            } else {
                System.out.println("Error al eliminar el cliente.");
            }
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static void editarCliente(ListaDoblementeEnlazada<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar la lista de clientes
        System.out.println("*** Clientes ***");
        System.out.println("ID - Nombre - Correo");
        listaClientes.verLista();

        System.out.print("Ingrese el ID del cliente que desea editar: ");
        String idClienteEditar = scanner.nextLine();

        // Buscar el cliente por ID
        Nodo<Cliente> actual = listaClientes.getCabeza();
        Cliente clienteEditar = null;
        while (actual != null) {
            if (actual.getDato().getID().equalsIgnoreCase(idClienteEditar)) {
                clienteEditar = actual.getDato();
                break;
            }
            actual = actual.getSiguiente();
        }

        if (clienteEditar != null) {
            System.out.print("Ingrese el nuevo nombre del cliente: ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Ingrese el nuevo correo del cliente: ");
            String nuevoCorreo = scanner.nextLine();

            // Crear un nuevo cliente con los datos actualizados
            Cliente clienteActualizado = new Cliente(idClienteEditar, nuevoNombre, nuevoCorreo);

            // Editar el elemento en la lista
            listaClientes.editarElemento(clienteEditar, clienteActualizado);

            System.out.println("Cliente con ID: \"" + idClienteEditar + "\" se modifico correctamente.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}
