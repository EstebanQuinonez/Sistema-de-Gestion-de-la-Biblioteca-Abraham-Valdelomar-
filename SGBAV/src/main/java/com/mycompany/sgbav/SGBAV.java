package com.mycompany.sgbav;
import clases.Libro;
import clases.ListaDoblementeEnlazada;

import java.util.Scanner;

public class SGBAV {

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        ListaDoblementeEnlazada<Libro> listaLibros = new ListaDoblementeEnlazada<>();
        int opc;

        while (true) {
            System.out.println("***Biblioteca Abraham Valdelomar***");
            System.out.println("1. Gestion de Usuarios");
            System.out.println("2. Gestion de Libros");
            System.out.println("3. Prestamo");
            System.out.println("4. Devolucion");
            System.out.println("5. Mostrar Historial");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opcion: ");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("\n***Gestion de Usuarios***");
                    break;
                case 2:
                   int subOpc;
                    do{
                        System.out.println("\n***Gestion de libros***");
                        System.out.println("1. Agregar Libro");
                        System.out.println("2. Opcion dos");
                        System.out.println("3. Opcion tres");
                        System.out.println("4. Ver Lista de Libros");
                        System.out.println("5. Volver al Menu Principal");

                        System.out.print("Seleccione una opcion: ");
                        subOpc = scanner.nextInt();

                        switch (subOpc) {
                            case 1:
                                System.out.print("Ingrese el titulo del libro: ");
                                String titulo = scanner.next();
                                System.out.print("Ingrese el autor del libro: ");
                                String autor = scanner.next(); 
                                System.out.print("Ingrese el autor del id: ");
                                String id = scanner.next(); 
                                System.out.print("Ingrese el autor del categoria: ");
                                String categoria = scanner.next(); 
                                System.out.print("Ingrese el autor del stock: ");
                                int stock = scanner.nextInt();
                                
                                Libro nuevoLibro = new Libro(titulo, autor, id, categoria, stock);
                                listaLibros.agregarElemento(nuevoLibro);
                                System.out.println("Libro registrado correctamente.");
                                break;
                            case 2:
                                System.out.print("opcion dos");
                                break;
                            case 3:
                                
                                break;
                            case 4:
                                listaLibros.verLista();
                                break;
                            case 5:
                                System.out.println("Volviendo al menu principal...");
                                System.out.println("                              ");
                                break;    
                            default:
                                System.out.println("Opción no valida. Por favor, seleccione una opcion del 1 al 4.");
                                System.out.println("                              ");
                        }
                    } while (subOpc != 5);
                    break;
                case 3:
                    System.out.println("Prestamo de Libros");

                    break;
                case 4:
                    System.out.println("Devolucion de Libros");

                    break;
                case 5:
                    System.out.println("Mostrar Historial");

                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion del 1 al 6.");
                    System.out.println("                              ");
            }
        }
    }
}
