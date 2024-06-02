package clases;
public class Nodo<T> {
    public T dato;
    public Nodo<T> anterior;
    public Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}