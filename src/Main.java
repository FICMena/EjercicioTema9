public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Fabian";
        cliente.edad = 29;
        cliente.numeroTelefono = 313192092;
        cliente.credito = 200.25;
        System.out.println("Buenos dias. Soy" + cliente.nombre + "tengo" + cliente.edad + "años y mi telefono es" + cliente.numeroTelefono
        + "y el credito que me queda es" + cliente.credito);

        trabajador.nombre = "Pablo";
        trabajador.edad = 52;
        trabajador.numeroTelefono = 381256121;
        trabajador.salario = 2000.54;
        System.out.println("Buenos dias! Yo Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi numero de telefono es " + trabajador.numeroTelefono
                + " y mi salario es de " + trabajador.salario + "€");
    }
}

class Persona {
    int edad;
    String nombre;
    int numeroTelefono;

}

class Cliente extends Persona {
    static double credito;
}

class Trabajador extends Persona {
    static double salario;
}