package clase04;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<String> materias = new ArrayList<>();

        materias.add("Matematicas");

        Alumno a = new Alumno("1234", 6, materias, "Alicia", "Ferreyra");

        alumnos.add(a);

        Profesor p = new Profesor(alumnos, "Carlos", "Gardel");

        NoDocente nd = new NoDocente("Claudia", "Ferreyra");

        ArrayList<Persona> ListaDePersona = new ArrayList<>();

        ListaDePersona.add(a);
        ListaDePersona.add(p);
        ListaDePersona.add(nd);

        for (Persona persona : ListaDePersona) {
            persona.saludar();
            
        }




    }
}
