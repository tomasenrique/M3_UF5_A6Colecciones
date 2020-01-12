package entidad;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getDni().equals(persona.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }

    @Override
    public int compareTo(Persona persona) {
        /**Aqui la forma de comparar se realizara de la sigueinte manera:
         * Si el resultado es -1 indicara que el dato pasado va primero
         * Si el resultado es 0 indicara que el dato pasado es identico y por lo tanto no cambia de pocicion
         * Si el resultado es 1 indicara que el dato pasado va despues  */
        int resultado = 0;
        if (this.dni.hashCode() > persona.dni.hashCode()) resultado = -1;
        else if((this.dni.hashCode() < persona.dni.hashCode())) resultado = 1;

        return resultado;
    }
}
