package clase04;

import java.util.ArrayList;

public class Profesor extends Persona{
    ArrayList<Alumno> ListaDeAlumnos;

    public Profesor(ArrayList<Alumno> ListaDeAlumnos, String nombre, String apellido) {
        this.ListaDeAlumnos = ListaDeAlumnos;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void saludar() {
        System.out.println("Hola a todos");
    }
    //Recorro la lista de alumno
    public void calificar(Alumno alumno, Integer nota) {
        for (Alumno al: ListaDeAlumnos) {
            if (al == alumno) {
                //Le asigno la nota al alumno que me pasaron por parametro
                al.setNota(nota);
            }
            
        }
    }
    public void calificar(Integer nota) {
        for (Alumno al: ListaDeAlumnos) {
            al.setNota(nota);
        }
    }


    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }


    public String getNombre() {
        return super.getNombre();
    }


    public String getApellido() {
        return super.getApellido();
    }


    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public ArrayList<Alumno> getListaDeAlumnos() {
        return ListaDeAlumnos;
    }

    public void setListaDeAlumnos(ArrayList<Alumno> listaDeAlumnos) {
        ListaDeAlumnos = listaDeAlumnos;
    }
}
