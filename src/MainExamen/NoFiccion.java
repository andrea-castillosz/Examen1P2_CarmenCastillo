/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainExamen;

/**
 *
 * @author casti
 */
public class NoFiccion extends Libros{
    
    String tipo;

    public NoFiccion() {
        super();
    }

    public NoFiccion(String tipo) {
        this.tipo = tipo;
    }

    public NoFiccion(String tipo, String Titulo, String Autor, double Precio, int Edicion) {
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
        return "\n\tNo Ficcion: " + "[Tipo: " + tipo + "]\n";
    }
    
    
}
