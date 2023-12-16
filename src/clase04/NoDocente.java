package clase04;

public class NoDocente extends Persona {
    NoDocente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void saludar() {
        System.out.println("Buen dia");
    }
}
