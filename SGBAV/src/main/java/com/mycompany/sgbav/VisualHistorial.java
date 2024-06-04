package com.mycompany.sgbav;

import clases.ListaDoblementeEnlazada;
import clases.Historial;
import clases.Nodo;

public class VisualHistorial {
    private ListaDoblementeEnlazada<Historial> listaHistorial;

    // Constructor que recibe la lista de historial
    public VisualHistorial(ListaDoblementeEnlazada<Historial> listaHistorial) {
        this.listaHistorial = listaHistorial;
    }

    // Método para mostrar los elementos de la lista de historial
    public void mostrarHistorial() {
        System.out.println("\n*** Historial de Préstamos ***");
        Nodo<Historial> actual = listaHistorial.getCabeza();
        if (actual == null) {
            System.out.println("No hay registros en el historial.");
        } else {
            while (actual != null) {
                System.out.println(actual.getDato().toString());
                actual = actual.getSiguiente();
            }
        }
    }
}

