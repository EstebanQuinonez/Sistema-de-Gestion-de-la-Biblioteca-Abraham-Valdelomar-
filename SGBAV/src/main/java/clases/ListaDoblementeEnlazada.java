
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
     
   public boolean eliminarElemento(T dato) {
    Nodo<T> actual = cabeza;
    while (actual != null) {
        if (actual.getDato().equals(dato)) { // Comparar el dato recibido con la lista
            if (actual == cabeza && actual == cola) { // Si el nodo es el único en la lista
                cabeza = null;
                cola = null;
            } else if (actual == cabeza) { // Si el nodo es el primero en la lista
                cabeza = actual.getSiguiente();
                cabeza.setAnterior(null);
            } else if (actual == cola) { // Si el nodo es el último en la lista
                cola = actual.getAnterior();
                cola.setSiguiente(null);
            } else { // Si el nodo está en medio de la lista
                actual.getAnterior().setSiguiente(actual.getSiguiente());
                actual.getSiguiente().setAnterior(actual.getAnterior());
            }
            return true; // Nodo eliminado, salir del método
        }
        actual = actual.getSiguiente();
    }
    return false; // No se encontró el elemento
    }


    public boolean editarElemento(T datoAntiguo, T datoNuevo) {
    Nodo<T> actual = cabeza;
    while (actual != null) {
        if (actual.getDato().equals(datoAntiguo)) { // Buscar el nodo con el dato antiguo
            actual.setDato(datoNuevo); // Reemplazar el dato antiguo por el nuevo
            return true; // Nodo editado, salir del método
        }
        actual = actual.getSiguiente();
    }
    return false; // No se encontró el elemento a editar
    }
}

