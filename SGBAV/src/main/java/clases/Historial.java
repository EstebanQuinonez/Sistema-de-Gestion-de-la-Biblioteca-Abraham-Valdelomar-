package clases;

public class Historial {
    private String idCliente;
    private String nombreCliente;
    private String idLibro;
    private String tituloLibro;
    private String autorLibro;
    private int hora;
    private int min;
    private int dia;
    private int mes;
    private int anio;

    public Historial(String idCliente, String nombreCliente, String idLibro, String tituloLibro, String autorLibro, int hora, int min, int dia, int mes, int anio) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.idLibro = idLibro;
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.hora = hora;
        this.min = min;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    
    //Historial nuevoHistorial = new Historial(idCliente, nombreCliente, actual.dato.getId(), actual.dato.getTitulo(), actual.dato.getAutor(), Hora.get(Calendar.HOUR),Hora.get(Calendar.MINUTE),Fecha.get(Calendar.DATE), Fecha.get(Calendar.MONTH),Fecha.get(Calendar.YEAR));

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

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Historial{" + "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", idLibro=" + idLibro + ", tituloLibro=" + tituloLibro + ", autorLibro=" + autorLibro + ", hora=" + hora + ", min=" + min + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
}
