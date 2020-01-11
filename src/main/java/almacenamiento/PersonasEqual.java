package almacenamiento;

import entidad.Persona;
import excepciones.ElementoDuplicadoException;

import java.util.ArrayList;

public class PersonasEqual {

    private ArrayList<Persona> personasEquals;

    // Builder
    public PersonasEqual() {
        this.personasEquals = new ArrayList<>();
    }

    // Setter and Getter

    public ArrayList<Persona> getPersonasEquals() {
        return personasEquals;
    }

    public void setPersonasEquals(ArrayList<Persona> personasEquals) {
        this.personasEquals = personasEquals;
    }


    // Methods
    public void agregarPersonaLista(Persona persona) {
        personasEquals.add(persona); // agrega las monedas a la lista
    }


    @Override
    public String toString() {
        return "PersonasEqual{" +
                "personas=" + personasEquals +
                '}';
    }
}
