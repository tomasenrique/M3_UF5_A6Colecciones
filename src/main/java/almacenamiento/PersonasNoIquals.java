package almacenamiento;

import entidad.Persona;

import java.util.ArrayList;

public class PersonasNoIquals {

    private ArrayList<Persona> listaPersonasNoEquals;

    // Builder
    public PersonasNoIquals() {
        this.listaPersonasNoEquals = new ArrayList<>();
    }

    // Setter and Getter
    public ArrayList<Persona> getListaPersonasNoEquals() {
        return listaPersonasNoEquals;
    }

    public void setListaPersonasNoEquals(ArrayList<Persona> listaPersonasNoEquals) {
        this.listaPersonasNoEquals = listaPersonasNoEquals;
    }

    // Methods
    @Override
    public String toString() {
        return "PersonasNoIquals{" +
                "listaPersonasNoEquals=" + listaPersonasNoEquals +
                '}';
    }

    public void agregarPersonaListaNoIgual(Persona persona) /*throws ElementoDuplicadoException*/ {
        boolean contiene = false; // para saber si esta el objeto igual
        for (Persona p : listaPersonasNoEquals) { // se itera todo el array para verificar el contenido
            if (p.equals(persona)) contiene = true; // verifica que la moneda no existe en el arrayList
        }
        if (!contiene) listaPersonasNoEquals.add(persona); // agrega la persona que no sean iguales
    }



}

