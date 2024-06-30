package clases;

import java.util.Objects;

public class Cliente {
    private String ID;
    private String nombre;
    private String correo;

    public Cliente(String ID, String nombre, String correo) {
        this.ID = ID;
        this.nombre = nombre;
        this.correo = correo;
    }

    // Getters and setters
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente cliente = (Cliente) obj;
        return ID.equals(cliente.ID); // Compara por ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID); // Genera un hashcode basado en el ID
    }
    
    @Override
    public String toString() {
        return "ID Cliente: " + ID + 
               " / Nombre: " + nombre + 
               " / Correo: " + correo;
    }
    
}
    

