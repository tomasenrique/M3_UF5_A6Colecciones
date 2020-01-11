package almacenamiento;

import entidad.Persona;
import excepciones.ElementoDuplicadoException;

import java.util.ArrayList;

public class PersonasNoIquals {

    private ArrayList<Persona> personasNoEquals;

    // Builder
    public PersonasNoIquals() {
        this.personasNoEquals = new ArrayList<>();
    }

    // Setter and Getter
    public ArrayList<Persona> getPersonasNoEquals() {
        return personasNoEquals;
    }

    public void setPersonasNoEquals(ArrayList<Persona> personasNoEquals) {
        this.personasNoEquals = personasNoEquals;
    }


    // Methods
    public void agregarPersonaListaNoIgual(Persona persona) throws ElementoDuplicadoException {

        boolean contiene = false; // para saber si esta el objeto igual

        for (Persona p : personasNoEquals) { // se itera todo el array para verificar el contenido
            if (p.getDni().contains(persona.getDni()))
                contiene = true; // verifica que la moneda no existe en el arrayList
        }
        if (contiene) {
            throw new ElementoDuplicadoException("La moneda de valor " + persona.getDni() + " ya existe, No se agregara a la lista.");
        } else personasNoEquals.add(persona); // agrega las monedas que no sean iguales
    }


    @Override
    public String toString() {
        return "PersonasNoIquals{" +
                "personasNoEquals=" + personasNoEquals +
                '}';
    }
}
