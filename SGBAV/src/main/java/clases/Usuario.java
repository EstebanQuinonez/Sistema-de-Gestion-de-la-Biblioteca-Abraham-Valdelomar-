package clases;

public class Usuario {
    private String ID;
    private String nombre;
    private String apellido;
    private String correo;

    public Usuario(String ID, String nombre, String apellido, String correo) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    

    public void buscarUsuarioPorID(String ID) {
        
    }
}
