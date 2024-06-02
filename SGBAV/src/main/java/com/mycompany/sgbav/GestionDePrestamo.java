package com.mycompany.sgbav;

import clases.ListaDoblementeEnlazada;
import clases.Libro;
import clases.Nodo;
import clases.Prestamo;
import java.util.Scanner;

public class GestionDePrestamo {

    private ListaDoblementeEnlazada<Prestamo> listaPrestamos;

    public GestionDePrestamo() {
        this.listaPrestamos = new ListaDoblementeEnlazada<>();
    }

    public void agregarPrestamo(ListaDoblementeEnlazada<Libro> listaLibros) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el id del cliente: ");
        String idCliente = scanner.next();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.next();

        // Mostrar la lista de libros
        System.out.println("Lista de Libros Disponibles:");
        listaLibros.verLista();

        System.out.print("Ingrese el ID del libro que desea solicitar: ");
        String idLibro = scanner.next();

        // Buscar el libro por ID
        Nodo<Libro> actual = listaLibros.getCabeza();
        boolean encontrado = false;
        while (actual != null) {
            if (actual.dato.getId().equalsIgnoreCase(idLibro)) {
                encontrado = true;
                break;
            }
            actual = actual.siguiente;
        }

        if (encontrado) {
            System.out.print("Ingrese el numero de libros que desea solicitar: ");
            int cantidad = scanner.nextInt();
            actual.dato.disminuirStock(cantidad);

            Prestamo nuevoPrestamo = new Prestamo(idCliente, nombreCliente, actual.dato.getId(), actual.dato.getTitulo(), actual.dato.getAutor(), actual.dato.getCategoria());
            listaPrestamos.agregarElemento(nuevoPrestamo);
            System.out.println("Prestamo registrado correctamente.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}