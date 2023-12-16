package clase04;

import java.security.PublicKey;
import java.util.ArrayList;

public class Alumno extends Persona{
    private String matricula;
    private Integer nota;
    private ArrayList<String> materias;

    public Alumno(String matricula, Integer nota, ArrayList<String> materias, String nombre, String apellido) {
        this.matricula = matricula;
        this.nota = nota;
        this.materias = materias;
        this.nombre = nombre;
        this.apellido = apellido;

    }
    @Override
    public void saludar() {
        System.out.println("Que ondaaa");
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public Integer getNota() {
        return nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

}
