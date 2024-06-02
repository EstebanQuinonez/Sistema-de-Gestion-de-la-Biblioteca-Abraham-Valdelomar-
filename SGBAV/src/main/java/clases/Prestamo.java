package clases;

public class Prestamo {
    private String idCliente;
    private String nombreCliente;
    private String idLibro;
    private String tituloLibro;
    private String autorLibro;
    private String categoriaLibro;
    
    public Prestamo(String idCliente, String nombreCliente, String idLibro, String nombreLibro, String autorLibro, String categoriaLibro) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.idLibro = idLibro;
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.categoriaLibro = categoriaLibro;
    }
 
}
