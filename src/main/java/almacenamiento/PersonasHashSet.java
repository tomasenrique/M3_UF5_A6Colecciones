package almacenamiento;

import entidad.Persona;

import java.util.HashSet;

public class PersonasHashSet {

    private HashSet<Persona> listaPersonasHashSet;

    // Builder
    public PersonasHashSet() {
        this.listaPersonasHashSet = new HashSet<>();
    }


    // Setter and Getter
    public HashSet<Persona> getListaPersonasHashSet() {
        return listaPersonasHashSet;
    }

    public void setListaPersonasHashSet(HashSet<Persona> listaPersonasHashSet) {
        this.listaPersonasHashSet = listaPersonasHashSet;
    }

    // Methods
    @Override
    public String toString() {
        return "PersonasHashSet{" +
                "listaPersonasHashSet=" + listaPersonasHashSet +
                '}';
    }


    public void agregarPersonaListaHashSet(Persona persona) {
        listaPersonasHashSet.add(persona); // agrega la persona que no sean iguales
    }
}



