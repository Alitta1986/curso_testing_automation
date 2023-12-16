package clase05;

public class main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Sergio", "sergio@gmail.com");
        ClienteVIP vip = new ClienteVIP("Alicia", "alibe2930.com", 3);

        c.mostrarInformacion();
        vip.mostrarInformacion();
    }
}
