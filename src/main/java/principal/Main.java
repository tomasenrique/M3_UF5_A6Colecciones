package principal;

import almacenamiento.PersonasEqual;
import almacenamiento.PersonasHashSet;
import almacenamiento.PersonasNoIquals;
import almacenamiento.PersonasTreeSet;
import entidad.Persona;
import excepciones.ElementoDuplicadoException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        int cantidad = 100;


        Persona p1 = new Persona();
        p1.setDni("aaabbbcc");
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        p3.setDni("aaabbbcc");





        PersonasEqual personasEqual = new PersonasEqual();
        personasEqual.agregarPersonaLista(p1);
        personasEqual.agregarPersonaLista(p2);
        personasEqual.agregarPersonaLista(p3);

        ArrayList<Persona> lista1 = personasEqual.getListaPersonasEquals();
        for (Persona p: lista1  ) {
            System.out.println(p);
        }

        System.out.println("------------------------------------------");

        PersonasNoIquals personasNoIquals = new PersonasNoIquals();
        try {
            personasNoIquals.agregarPersonaListaNoIgual(p1);
            personasNoIquals.agregarPersonaListaNoIgual(p2);
            personasNoIquals.agregarPersonaListaNoIgual(p3);
        } catch (ElementoDuplicadoException e) {
            System.out.println("ERROR: " + e);
        }

        ArrayList<Persona> lista2 = personasNoIquals.getListaPersonasNoEquals();

        for (Persona p: lista2  ) {
            System.out.println(p);
        }


        System.out.println("------------------------------------------");

        PersonasHashSet personasHashSet = new PersonasHashSet();

        personasHashSet.agregarPersonaListaHashSet(p1);
        personasHashSet.agregarPersonaListaHashSet(p2);
        personasHashSet.agregarPersonaListaHashSet(p3);

        HashSet<Persona> lista3 = personasHashSet.getListaPersonasHashSet();
        for (Persona p: lista3 ) {
            System.out.println(p);
        }


        System.out.println("------------------------------------------");

        PersonasTreeSet personasTreeSet = new PersonasTreeSet();

        personasTreeSet.agregarPersonaListTreeSet(p1);
        personasTreeSet.agregarPersonaListTreeSet(p2);
        personasTreeSet.agregarPersonaListTreeSet(p3);

        TreeSet<Persona> lista4 = personasTreeSet.getListaPersonasTreeSet();
        for (Persona p: lista4  ) {
            System.out.println(p);
        }
















    }
}
