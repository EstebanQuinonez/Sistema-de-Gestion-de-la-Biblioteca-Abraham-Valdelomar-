package com.mycompany.sgbav;

import clases.ListaDoblementeEnlazada;
import clases.Libro;
import clases.Nodo;
import clases.Prestamo;
import clases.Historial;
import java.util.Calendar;
import java.util.Scanner;

public class GestionDePrestamo {
    static Calendar Hora = Calendar.getInstance();
    static Calendar Fecha = Calendar.getInstance();
    private ListaDoblementeEnlazada<Prestamo> listaPrestamos;
    private ListaDoblementeEnlazada<Historial> listaHistorial;

    public GestionDePrestamo() {
        this.listaPrestamos = new ListaDoblementeEnlazada<>();
        this.listaHistorial = new ListaDoblementeEnlazada<>();
    }

    public void agregarPrestamo(ListaDoblementeEnlazada<Libro> listaLibros) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el id del cliente: ");
        String idCliente = scanner.next();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.next();

        // Mostrar la lista de libros
        System.out.println("Lista de Libros Disponibles:");
        System.out.println("*** Libros ***");
        System.out.println("Titulo - Autor - Id - Categoria - Stock");
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
            int a =Hora.get(Calendar.HOUR);
            int b =Hora.get(Calendar.MINUTE);
            int c =Fecha.get(Calendar.DATE);
            int d =Fecha.get(Calendar.MONTH);
            int e =Fecha.get(Calendar.YEAR);
            Historial nuevoHistorial = new Historial(idCliente, nombreCliente, actual.dato.getId(), actual.dato.getTitulo(), actual.dato.getAutor(), a,b,c,d,e);
            listaPrestamos.agregarElemento(nuevoPrestamo);
            listaHistorial.agregarElemento(nuevoHistorial);
            System.out.println("Prestamo registrado correctamente.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
    public ListaDoblementeEnlazada<Historial> getListaHistorial(){
        return listaHistorial;
    }
    
    
    public void mostrarHistorial(){
        System.out.println("\n*** Historial de Préstamos ***");
        listaHistorial.verLista();
    }
}