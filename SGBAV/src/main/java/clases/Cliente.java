package clases;

import java.util.Scanner;

public class Cliente {
    private int ID;
    private String nombre;
    private String correo;

    public Cliente(int ID, String nombre, String apellido, String correo) {
        this.ID = ID;
        this.nombre = nombre;
        this.correo = correo;
    }

    // Getters and setters
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public static void verCliente(Cliente cliente) {
        System.out.println("El ID del cliente es: " + cliente.getID());
        System.out.println("El nombre del cliente es: " + cliente.getNombre());
        System.out.println("El correo del cliente es: " + cliente.getCorreo());
    }

    /*
    public static Cliente buscarClientePorID(int ID, ListaDoblementeEnlazada<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID a buscar: ");

    }
    */

    /*
    public static Cliente eliminarClientePorID(int ID, ListaDoblementeEnlazada<Cliente> listaClientes) {
        return ;
    }
    */

    public static void agregarCliente(int ID, String nombre, String correo, ListaDoblementeEnlazada<Cliente> listaClientes) {
       // se crea objeco cliente y se devuelve: void --> Cliente
    }
    public static void verListaDeClientes(ListaDoblementeEnlazada<Cliente> listaClientes) {

    }
}
