package clases;

public class Prestamo {
    private String idCliente;
    private String nombreCliente;
    private String idLibro;
    private String tituloLibro;
    private String autorLibro;
    private String categoriaLibro;
    private int cantidad;
    
    public Prestamo(String idCliente, String nombreCliente, String idLibro, String tituloLibro, String autorLibro, String categoriaLibro, int cantidad) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.idLibro = idLibro;
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.categoriaLibro = categoriaLibro;
        this.cantidad = cantidad;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public String getCategoriaLibro() {
        return categoriaLibro;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    @Override
    public String toString() {
        return "ID Cliente: " + idCliente + 
                " / Nombre Cliente: " + nombreCliente + 
                " / ID Libro: " + idLibro + 
                " / Titulo Libro: " + tituloLibro + 
                " / Autor Libro: " + autorLibro + 
                " / Categoria Libro: " + categoriaLibro + 
                " / Cantidad: " + cantidad;
    }
 
}
