package entidad;

public class Persona {

    private static String semilla;
    private String dni;

    // Builder
     public Persona() {
        semilla = String.valueOf(Math.random()); // genera numeros aleatorios
        this.dni = semilla.substring(semilla.length() - 8); // pasa la semilla a 8 digitos
    }

    // Getter
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Methods
    @Override
    public String toString() {
        return "DNI: " + dni;
    }


}
