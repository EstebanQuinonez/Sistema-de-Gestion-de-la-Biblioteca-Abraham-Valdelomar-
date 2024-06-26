package com.mycompany.sgbav;

import clases.Libro;
import clases.ListaDoblementeEnlazada;
import clases.Nodo;
import clases.Cliente;

import java.util.Scanner;

public class MenuGestionDeLibros {

    public static void menuGestionDeLibros(ListaDoblementeEnlazada<Libro> listaLibros, ListaDoblementeEnlazada<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Gestion de Libros ***");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Editar Libro");
            System.out.println("3. Eliminar Libro");
            System.out.println("4. Ver Lista de Libros");
            System.out.println("5. Volver al Menu Principal");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarLibro(listaLibros);
                    break;
                case 2:
                    editarLibro(listaLibros);
                    break;
                case 3:
                    eliminarLibro(listaLibros);
                    break;
                case 4:
                    System.out.println("*** Lista de Libros ***");
                    listaLibros.verLista();
                    break;
                case 5:
                    MenuPrincipal.menuPrincipal(listaLibros, listaClientes);
                    break;
                case 6:
                    System.out.println("Saliendo del menu de gestión de libros.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción invalida, por favor intente de nuevo.");
            }
        } while (opcion != 6);
    }

    private static void agregarLibro(ListaDoblementeEnlazada<Libro> listaLibros) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el ID del libro: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese la categoria del libro: ");
        String categoria = scanner.nextLine();
        System.out.print("Ingrese el stock del libro: ");
        int stock = scanner.nextInt();

        Libro nuevoLibro = new Libro(titulo, autor, id, categoria, stock);
        listaLibros.agregarElemento(nuevoLibro);
        System.out.println("Libro registrado correctamente.");
    }

    private static void eliminarLibro(ListaDoblementeEnlazada<Libro> listaLibros) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar la lista de libros
        System.out.println("*** Libros ***");
        System.out.println("Titulo - Autor - ID - Categoria - Stock");
        listaLibros.verLista();

        System.out.print("Ingrese el ID del libro que desea eliminar: ");
        String idLibroEliminar = scanner.nextLine();

        // Buscar el libro por ID
        Nodo<Libro> actual = listaLibros.getCabeza();
        Libro libroEliminar = null;
        while (actual != null) {
            if (actual.getDato().getId().equalsIgnoreCase(idLibroEliminar)) {
                libroEliminar = actual.getDato();
                break;
            }
            actual = actual.getSiguiente();
        }

        if (libroEliminar != null) {
            // Eliminar el elemento en la lista
            boolean eliminado = listaLibros.eliminarElemento(libroEliminar);

            if (eliminado) {
                System.out.println("Libro con ID: \"" + idLibroEliminar + "\" se elimino correctamente.");
            } else {
                System.out.println("Error al eliminar el libro.");
            }
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private static void editarLibro(ListaDoblementeEnlazada<Libro> listaLibros) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar la lista de libros
        System.out.println("*** Libros ***");
        System.out.println("Titulo - Autor - ID - Categoria - Stock");
        listaLibros.verLista();

        System.out.print("Ingrese el ID del libro que desea editar: ");
        String idLibroEditar = scanner.nextLine();

        // Buscar el libro por ID
        Nodo<Libro> actual = listaLibros.getCabeza();
        Libro libroEditar = null;
        while (actual != null) {
            if (actual.getDato().getId().equalsIgnoreCase(idLibroEditar)) {
                libroEditar = actual.getDato();
                break;
            }
            actual = actual.getSiguiente();
        }

        if (libroEditar != null) {
            System.out.print("Ingrese el nuevo titulo del libro: ");
            String nuevoTitulo = scanner.nextLine();
            System.out.print("Ingrese el nuevo autor del libro: ");
            String nuevoAutor = scanner.nextLine();
            System.out.print("Ingrese el nuevo ID del libro: ");
            String nuevoId = scanner.nextLine();
            System.out.print("Ingrese la nueva categoria del libro: ");
            String nuevaCategoria = scanner.nextLine();
            System.out.print("Ingrese el nuevo stock del libro: ");
            int nuevoStock = scanner.nextInt();

            // Crear un nuevo libro con los datos actualizados
            Libro libroActualizado = new Libro(nuevoTitulo, nuevoAutor, nuevoId, nuevaCategoria, nuevoStock);

            // Editar el elemento en la lista
            boolean editado = listaLibros.editarElemento(libroEditar, libroActualizado);

            if (editado) {
                System.out.println("Libro con ID: \"" + idLibroEditar + "\" se modifico correctamente.");
            } else {
                System.out.println("Error al editar el libro.");
            }
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}
