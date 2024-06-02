
package clases;

public class ListaDoblementeEnlazada<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;

    public ListaDoblementeEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregarElemento(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }
    
    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void verLista() {
    Nodo<T> actual = cabeza;
    while (actual != null) {
        System.out.println(actual.dato);
        actual = actual.siguiente;
       }
    }
    
    public T obtenerElemento(int indice) {
    Nodo<T> actual = cabeza;
    int contador = 0;
    while (actual != null) {
        if (contador == indice) {
            return actual.dato;
        }
        contador++;
        actual = actual.siguiente;
    }
    return null;
    }
    
    public boolean eliminarElemento(T dato) {
    Nodo<T> actual = cabeza;
    while (actual != null) {
        if (actual.dato.equals(dato)) { //Comparar el dato recibido con la lista
            if (actual == cabeza && actual == cola) { // Si el nodo es el único en la lista
                cabeza = null;
                cola = null;
            } else if (actual == cabeza) { // Si el nodo es el primero en la lista
                cabeza = actual.siguiente;
                cabeza.anterior = null;
            } else if (actual == cola) { // Si el nodo es el último en la lista
                cola = actual.anterior;
                cola.siguiente = null;
            } else { // Si el nodo está en medio de la lista
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
            }
            return true; // Nodo eliminado, salir del método
        }
        actual = actual.siguiente;
    }
    return false; // No se encontró el elemento
}


}

