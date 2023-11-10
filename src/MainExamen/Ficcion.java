/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainExamen;

/**
 *
 * @author casti
 */
public class Ficcion extends Libros{
    
    String tipo;

    public Ficcion() {
        super();
    }

    public Ficcion(String tipo) {
        this.tipo = tipo;
    }

    public Ficcion(String tipo, String Titulo, String Autor, double Precio, int Edicion) {
        super(Titulo, Autor, Precio, Edicion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "\n\tFiccion: " + "[Tipo: " + tipo + "]\n";
    }
    
    
    
}
