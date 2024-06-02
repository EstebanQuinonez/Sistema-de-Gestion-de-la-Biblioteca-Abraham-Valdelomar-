package com.mycompany.sgbav;
import clases.Libro;
import clases.ListaDoblementeEnlazada;

import java.util.Scanner;

public class SGBAV {

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        ListaDoblementeEnlazada<Libro> listaLibros = new ListaDoblementeEnlazada<>();
        int opc;
        int subOpc;

        MenuPrincipal.menuPrincipal(listaLibros);
    }
}
