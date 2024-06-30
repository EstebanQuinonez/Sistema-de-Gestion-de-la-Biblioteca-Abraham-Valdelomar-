package clases;

public class Devolucion {
    private String idCliente;
    private String nombreCliente;
    private String idLibro;
    private String tituloLibro;
    private String autorLibro;
    private String categoriaLibro;
    
    public Devolucion(String idCliente, String nombreCliente, String idLibro, String tituloLibro, String autorLibro, String categoriaLibro){
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.idLibro= idLibro;
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.categoriaLibro = categoriaLibro;
    }
}
