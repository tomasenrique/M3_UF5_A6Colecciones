package almacenamiento;

import entidad.Persona;
import excepciones.ElementoDuplicadoException;

import java.util.ArrayList;

public class PersonasEqual {

    private ArrayList<Persona> listaPersonasEquals;

    // Builder
    public PersonasEqual() {
        this.listaPersonasEquals = new ArrayList<>();
    }

    // Setter and Getter
    public ArrayList<Persona> getListaPersonasEquals() {
        return listaPersonasEquals;
    }

    public void setListaPersonasEquals(ArrayList<Persona> listaPersonasEquals) {
        this.listaPersonasEquals = listaPersonasEquals;
    }

    // Methods
    public void agregarPersonaLista(Persona persona) {
        listaPersonasEquals.add(persona); // agrega las monedas a la lista
    }

    // Methods
    @Override
    public String toString() {
        return "PersonasEqual{" +
                "listaPersonasEquals=" + listaPersonasEquals +
                '}';
    }

}
