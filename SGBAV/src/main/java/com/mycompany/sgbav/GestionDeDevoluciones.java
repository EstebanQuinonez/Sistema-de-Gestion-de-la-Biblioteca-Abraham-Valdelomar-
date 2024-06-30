package com.mycompany.sgbav;

import clases.ListaDoblementeEnlazada;
import clases.Cliente;
import clases.Nodo;
import clases.Devolucion;
import clases.Historial;
import clases.Libro;
import clases.Prestamo;
import java.util.Scanner;
import java.util.Calendar;

public class GestionDeDevoluciones {
    
    private ListaDoblementeEnlazada<Devolucion> listaDevoluciones;
    private ListaDoblementeEnlazada<Historial> listaHistorial;
    private ListaDoblementeEnlazada<Prestamo> listaPrestamos;

    public GestionDeDevoluciones(ListaDoblementeEnlazada<Prestamo> listaPrestamos, ListaDoblementeEnlazada<Historial> listaHistorial) {
        this.listaDevoluciones = new ListaDoblementeEnlazada<>();
        this.listaHistorial = listaHistorial;
        this.listaPrestamos = listaPrestamos;
    }
    
    public static void gestionDeDevoluciones(ListaDoblementeEnlazada<Libro> listaLibros,ListaDoblementeEnlazada<Cliente> listaClientes,ListaDoblementeEnlazada<Prestamo> listaPrestamos,ListaDoblementeEnlazada<Historial> listaHistorial) {
        GestionDeDevoluciones gestionDevoluciones = new GestionDeDevoluciones(listaPrestamos, listaHistorial);

        System.out.println("\n***Gestion de Devoluciones***");
        System.out.println("1. Mostrar lista de prestamos");
        System.out.println("2. Devolver libro");
        System.out.println("3. Volver.");
        
        int opcion;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestionDevoluciones.mostrarListaPrestamos();
                    break;
                case 2:
                    gestionDevoluciones.devolverLibro(listaLibros);
                    break;
                case 3:
                    MenuPrincipal.menuPrincipal(listaLibros, listaClientes);
                    break;
                default:
                    System.out.println("Opcion no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 3);
    }

    public void mostrarListaPrestamos() {
        Nodo<Prestamo> actual = listaPrestamos.getCabeza();
        if (actual == null) {
            System.out.println("No hay préstamos disponibles.");
        } else {
            System.out.println("*** Lista de Préstamos ***");
            while (actual != null) {
                System.out.println(actual.getDato().toString());
                actual = actual.getSiguiente();
            }
        }
    }

    public void devolverLibro(ListaDoblementeEnlazada<Libro> listaLibros) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del cliente: ");
        String idCliente = scanner.next();
        
        Nodo<Prestamo> prestamoActual = listaPrestamos.getCabeza();
        Prestamo prestamoEncontrado = null;
        
        while (prestamoActual != null) {
            if (prestamoActual.getDato().getIdCliente().equalsIgnoreCase(idCliente)) {
                prestamoEncontrado = prestamoActual.getDato();
                break;
            }
            prestamoActual = prestamoActual.getSiguiente();
        }

        if (prestamoEncontrado == null) {
            System.out.println("Préstamo no encontrado para el ID de cliente proporcionado.");
            return;
        }

        // Buscar el libro por ID en la lista de libros
        Nodo<Libro> libroActual = listaLibros.getCabeza();
        boolean libroEncontrado = false;
        
        while (libroActual != null) {
            if (libroActual.getDato().getId().equalsIgnoreCase(prestamoEncontrado.getIdLibro())) {
                libroEncontrado = true;
                libroActual.getDato().incrementarStock(prestamoEncontrado.getCantidad());
                break;
            }
            libroActual = libroActual.getSiguiente();
        }

        if (libroEncontrado) {
            // Obtener la fecha y hora actuales
            Calendar horaActual = Calendar.getInstance();

            Devolucion nuevaDevolucion = new Devolucion(prestamoEncontrado.getIdCliente(), prestamoEncontrado.getNombreCliente(), prestamoEncontrado.getIdLibro(), prestamoEncontrado.getTituloLibro(), prestamoEncontrado.getAutorLibro(), prestamoEncontrado.getCategoriaLibro());
            listaDevoluciones.agregarElemento(nuevaDevolucion);
            Historial nuevoHistorial = new Historial(prestamoEncontrado.getIdCliente(), prestamoEncontrado.getNombreCliente(), prestamoEncontrado.getIdLibro(), prestamoEncontrado.getTituloLibro(), prestamoEncontrado.getAutorLibro(), "Devolución",
                                                     horaActual.get(Calendar.HOUR_OF_DAY), horaActual.get(Calendar.MINUTE), 
                                                     horaActual.get(Calendar.DAY_OF_MONTH), horaActual.get(Calendar.MONTH) + 1, 
                                                     horaActual.get(Calendar.YEAR));
            
            listaHistorial.agregarElemento(nuevoHistorial);
            listaPrestamos.eliminarElemento(prestamoEncontrado);
            System.out.println("Libro devuelto correctamente.");
        } else {
            System.out.println("Libro no encontrado en la lista de libros.");
        }
    }

    public ListaDoblementeEnlazada<Devolucion> getListaDevoluciones() {
        return listaDevoluciones;
    }
}