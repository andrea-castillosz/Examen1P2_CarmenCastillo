/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainExamen;

/**
 *
 * @author casti
 */
public class Texto extends Libros{
    int Curso;
    String Facultad;

    public Texto() {
        super();
    }

    public Texto(int Curso, String Facultad) {
        this.Curso = Curso;
        this.Facultad = Facultad;
    }

    public Texto(int Curso, String Facultad, String Titulo, String Autor, double Precio, int Edicion) {
        super(Titulo, Autor, Precio, Edicion);
        this.Curso = Curso;
        this.Facultad = Facultad;
    }

    
    public int getCurso() {
        return Curso;
    }

    public void setCurso(int Curso) {
        this.Curso = Curso;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    @Override
    public String toString() {
        return "\n\tTexto: " + "{Curso: " + Curso + " / Facultad: " + Facultad + "]\n";
    }
    
    
    
}
