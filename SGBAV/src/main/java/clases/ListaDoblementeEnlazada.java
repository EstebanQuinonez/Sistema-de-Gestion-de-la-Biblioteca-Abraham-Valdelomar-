
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
}

