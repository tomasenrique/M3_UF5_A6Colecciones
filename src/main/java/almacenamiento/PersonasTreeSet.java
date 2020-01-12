package almacenamiento;

import entidad.Persona;

import java.util.TreeSet;

public class PersonasTreeSet {

    private TreeSet<Persona>listaPersonasTreeSet;

    // Builder
    public PersonasTreeSet() {
        this.listaPersonasTreeSet = new TreeSet<>();
    }

    // Setter and Getter
    public TreeSet<Persona> getListaPersonasTreeSet() {
        return listaPersonasTreeSet;
    }

    public void setListaPersonasTreeSet(TreeSet<Persona> listaPersonasTreeSet) {
        this.listaPersonasTreeSet = listaPersonasTreeSet;
    }

    // Methods
    @Override
    public String toString() {
        return "PersonasTreeSet{" +
                "listaPersonasTreeSet=" + listaPersonasTreeSet +
                '}';
    }


    public void agregarPersonaListTreeSet(Persona persona) {
        listaPersonasTreeSet.add(persona); // agrega la persona que no sean iguales
    }




}
