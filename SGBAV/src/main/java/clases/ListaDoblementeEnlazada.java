
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

    public void verLista() {
    Nodo<T> actual = cabeza;
    while (actual != null) {
        System.out.println(actual.dato);
        actual = actual.siguiente;
    }
}


}

