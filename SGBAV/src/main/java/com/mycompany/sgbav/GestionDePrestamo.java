package com.mycompany.sgbav;

import clases.ListaDoblementeEnlazada;
import clases.Libro;
import clases.Cliente;
import clases.Nodo;
import clases.Prestamo;
import clases.Historial;
import java.util.Calendar;
import java.util.Scanner;

public class GestionDePrestamo {
    private ListaDoblementeEnlazada<Prestamo> listaPrestamos;
    private ListaDoblementeEnlazada<Historial> listaHistorial;
    
    public GestionDePrestamo(ListaDoblementeEnlazada<Prestamo> listaPrestamos, ListaDoblementeEnlazada<Historial> listaHistorial) {
        this.listaPrestamos = listaPrestamos;
        this.listaHistorial = listaHistorial;
    }

    
    public GestionDePrestamo() {
        this.listaPrestamos = new ListaDoblementeEnlazada<>();
        this.listaHistorial = new ListaDoblementeEnlazada<>();
    }
    
    public void agregarPrestamo(ListaDoblementeEnlazada<Libro> listaLibros, ListaDoblementeEnlazada<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);
        
        // Mostrar la lista de clientes
        System.out.println("*** Lista de Clientes ***");
        Nodo<Cliente> clienteActual = listaClientes.getCabeza();
        while (clienteActual != null) {
            System.out.println(clienteActual.getDato().toString());
            clienteActual = clienteActual.getSiguiente();
        }

        // Solicitar el ID del cliente
        System.out.print("Ingrese el ID del cliente: ");
        String idCliente = scanner.next();
        
        // Buscar el cliente por ID
        clienteActual = listaClientes.getCabeza();
        Cliente clienteEncontrado = null;
        while (clienteActual != null) {
            if (clienteActual.getDato().getID().equalsIgnoreCase(idCliente)) {
                clienteEncontrado = clienteActual.getDato();
                break;
            }
            clienteActual = clienteActual.getSiguiente();
        }

        if (clienteEncontrado == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        String nombreCliente = clienteEncontrado.getNombre();

        // Mostrar la lista de libros
        System.out.println("*** Lista de Libros ***");
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

            // Verificar si hay suficiente stock
            if (actual.dato.getStock() >= cantidad) {
                actual.dato.disminuirStock(cantidad);

                // Obtener la fecha y hora actuales
                Calendar horaActual = Calendar.getInstance();

                Prestamo nuevoPrestamo = new Prestamo(idCliente, nombreCliente, actual.dato.getId(), actual.dato.getTitulo(), actual.dato.getAutor(), actual.dato.getCategoria(), cantidad);
                listaPrestamos.agregarElemento(nuevoPrestamo);
                Historial nuevoHistorial = new Historial(idCliente, nombreCliente, actual.dato.getId(), actual.dato.getTitulo(), actual.dato.getAutor(), "Préstamo",
                                                 horaActual.get(Calendar.HOUR_OF_DAY), horaActual.get(Calendar.MINUTE), 
                                                 horaActual.get(Calendar.DAY_OF_MONTH), horaActual.get(Calendar.MONTH) + 1, 
                                                 horaActual.get(Calendar.YEAR));
                listaHistorial.agregarElemento(nuevoHistorial);
                System.out.println("Prestamo registrado correctamente.");
            } else {
                System.out.println("No hay suficientes libros en stock para completar el préstamo.");
            }
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public ListaDoblementeEnlazada<Historial> getListaHistorial() {
        return listaHistorial;
    }

    public void mostrarHistorial() {
        Nodo<Historial> actual = listaHistorial.getCabeza();
        if (actual == null) {
            System.out.println("No hay historial disponible.");
        } else {
            while (actual != null) {
                System.out.println(actual.getDato().toString());
                actual = actual.getSiguiente();
            }
        }
    }
}