package clases;

public class Libro {
    private String titulo;
    private String autor;
    private String id;
    private String categoria;
    private int stock;

    public Libro(String titulo, String autor, String id, String categoria, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }
    
    public void disminuirStock(int cantidad) {
    if (this.stock >= cantidad) {
        this.stock -= cantidad;
    } else {
        System.out.println("No hay suficientes libros en stock para completar el préstamo.");
      }
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return titulo.equals(libro.titulo); // Comparar solo por el título
    }
    
    @Override
    public String toString() {
        return  titulo + " - " + autor +" - " + id + " - " + categoria + " - " + stock;
    }

}
