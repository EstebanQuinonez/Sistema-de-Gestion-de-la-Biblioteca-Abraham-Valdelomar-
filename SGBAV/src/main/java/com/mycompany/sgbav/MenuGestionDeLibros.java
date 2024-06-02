package com.mycompany.sgbav;

import clases.Libro;
import clases.ListaDoblementeEnlazada;

import java.util.Scanner;

public class MenuGestionDeLibros {

    public static void menuGestionDeLibros(ListaDoblementeEnlazada<Libro> listaLibros) {
        System.out.println("\n***Gestion de libros***");
        System.out.println("1. Agregar Libro");
        System.out.println("2. ");
        System.out.println("3. Eliminar Libro");
        System.out.println("4. Ver Lista de Libros");
        System.out.println("5. Volver.");

        int opcion;
        // envolver en do while para validar entrada de usuario
        System.out.print("Seleccione una opcion: ");
        Scanner scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        // finaliza envolver

        switch (opcion)
        {
            case 1:
                agregarLibro(listaLibros);

                break;
            case 2:

                break;
            case 3:
                listaLibros.verLista();
                eliminarLibro(listaLibros);
                break;
            case 4:
                System.out.println("*** Libros ***");
                System.out.println("Titulo - Autor - Id - Categoria - Stock");
                listaLibros.verLista();

                break;
            case 5:
                MenuPrincipal.menuPrincipal(listaLibros);

                break;
            case 6:
                System.exit(0);
        }
    }

    private static void agregarLibro(ListaDoblementeEnlazada<Libro> listaLibros) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el titulo del libro: ");
        String titulo = scanner.next();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.next();
        System.out.print("Ingrese el id del libro: ");
        String id = scanner.next();
        System.out.print("Ingrese la categoria del libro: ");
        String categoria = scanner.next();
        System.out.print("Ingrese el stock del libro: ");
        int stock = scanner.nextInt();

        Libro nuevoLibro = new Libro(titulo, autor, id, categoria, stock);
        listaLibros.agregarElemento(nuevoLibro);
        System.out.println("Libro registrado correctamente.");
    }
    
    private static void eliminarLibro(ListaDoblementeEnlazada<Libro> listaLibros) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("*** Libros ***");
    System.out.println("Titulo - Autor - Id - Categoria - Stock");
    System.out.print("Ingrese el titulo a eliminar: ");
    String tituloEliminar = scanner.nextLine();
    Libro libroAEliminar = new Libro(tituloEliminar, null, null, null, 0); // Solo se necesita el título para eliminar
    boolean libroEncontrado = listaLibros.eliminarElemento(libroAEliminar);
    
    if (libroEncontrado) {
        System.out.println("Libro \"" + tituloEliminar + "\" eliminado.");
    } else {
        System.out.println("Libro \"" + tituloEliminar + "\" no encontrado.");
    }
}

}
