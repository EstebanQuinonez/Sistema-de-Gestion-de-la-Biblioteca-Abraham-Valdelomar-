
package com.mycompany.sgbav;

import java.util.Scanner;

public class SGBAV {

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
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
                        System.out.println("1. Opcion uno");
                        System.out.println("2. Opcion dos");
                        System.out.println("3. Opcion tres");
                        System.out.println("4. Volver al Menú Principal");

                        System.out.print("Seleccione una opcion: ");
                        subOpc = scanner.nextInt();

                        switch (subOpc) {
                            case 1:
                                System.out.print("opcion uno");  
                                break;
                            case 2:
                                System.out.print("opcion dos");
                                break;
                            case 3:
                                System.out.println("opcion tres");
                                break;
                            case 4:
                                System.out.println("Volviendo al menu principal...");
                                System.out.println("                              ");
                                break;
                            default:
                                System.out.println("Opción no valida. Por favor, seleccione una opcion del 1 al 4.");
                                System.out.println("                              ");
                        }
                    } while (subOpc != 4);
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
