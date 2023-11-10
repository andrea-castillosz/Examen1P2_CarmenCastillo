/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainExamen;

/**
 *
 * @author casti
 */
public class Libros {
    
    String Titulo;
    String Autor;
    double Precio;
    int Edicion;

    public Libros() {
        
    }

    public Libros(String Titulo, String Autor, double Precio, int Edicion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Precio = Precio;
        this.Edicion = Edicion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }

    @Override
    public String toString() {
        return "\nLibros" + "\nTitulo: " + Titulo + "\nAutor: " + Autor + "\nPrecio: " + Precio + "\nEdicion: " + Edicion + "\n";
    }
    
    
    
}
