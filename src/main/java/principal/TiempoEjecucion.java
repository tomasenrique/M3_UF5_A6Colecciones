package principal;

import almacenamiento.PersonasEqual;
import almacenamiento.PersonasHashSet;
import almacenamiento.PersonasNoIquals;
import almacenamiento.PersonasTreeSet;
import entidad.Persona;


import static constantes_metodos.MethodStatic.getTime;
import static constantes_metodos.MethodStatic.textCenter;

public class TiempoEjecucion {

    private final static int CANT_DIEZ_MIL = 10000;
    private final static int CANT_CIEN_MIL = 100000;
    private final static int CANT_10_MILLONES = 10000000;

    // Realiza las pruebas para un ArrayList que acepta objetos repetidos
    public long implementacionListaArrayList(int cantidad) {
        long inicio = getTime();
        PersonasEqual personasEqual = new PersonasEqual(); // Almacenara objeto de tipo Persona
        for (int i = 0; i < cantidad; i++) personasEqual.agregarPersonaLista(new Persona());
        long fin = getTime();
        long total = fin - inicio;  // resultado en milisegundo de cuanto tarda en implementar y cargar los datos a la lista
        return total;
    }


    // Realiza las pruebas para un ArrayList que no acepta objetos repetidos
    public long implementacionListaArrayListNoIgual(int cantidad) {
        long inicio = getTime();
        PersonasNoIquals personasNoIquals = new PersonasNoIquals(); // Almacenara objeto de tipo Persona
        for (int i = 0; i < cantidad; i++) personasNoIquals.agregarPersonaListaNoIgual(new Persona());
        long fin = getTime();
        long total = fin - inicio;  // resultado en milisegundo de cuanto tarda en implementar y cargar los datos a la lista
        return total;
    }


    // Realiza las pruebas para un HashSet que no acepta objetos repetidos
    public long implementacionListaHashSet(int cantidad) {
        long inicio = getTime();
        PersonasHashSet personasHashSet = new PersonasHashSet(); // Almacenara objeto de tipo Persona
        for (int i = 0; i < cantidad; i++) personasHashSet.agregarPersonaListaHashSet(new Persona());
        long fin = getTime();
        long total = fin - inicio;  // resultado en milisegundo de cuanto tarda en implementar y cargar los datos a la lista
        return total;
    }

    // Realiza las pruebas para un TreeSet que acepta no objetos repetidos
    public long implementacionListaTreeSet(int cantidad) {
        long inicio = getTime();
        PersonasTreeSet personasTreeSet = new PersonasTreeSet(); // Almacenara objeto de tipo Persona
        for (int i = 0; i < cantidad; i++) personasTreeSet.agregarPersonaListTreeSet(new Persona());
        long fin = getTime();
        long total = fin - inicio;  // resultado en milisegundo de cuanto tarda en implementar y cargar los datos a la lista
        return total;
    }


    // iniciara las pruebas de carga de datos
    public void iniciarPruebas() {
        long[] resultado = new long[12];

        // Pruebas de implementacion y carga de datos a un ArrayList que acepta objetos repetidos
        resultado[0] = implementacionListaArrayList(CANT_DIEZ_MIL);
        resultado[1] = implementacionListaArrayList(CANT_CIEN_MIL);
        resultado[2] = implementacionListaArrayList(CANT_10_MILLONES);

        // Pruebas de implementacion y carga de datos a un ArrayList que no acepta objetos repetidos
        resultado[3] = implementacionListaArrayListNoIgual(CANT_DIEZ_MIL);
        resultado[4] = implementacionListaArrayListNoIgual(CANT_CIEN_MIL);
        // resultado[5] = implementacionListaArrayListNoIgual(CANT_10_MILLONES); // resultado indeterminado

        // pruebas de implementacion y carga de datos a un HashSet
        resultado[6] = implementacionListaHashSet(CANT_DIEZ_MIL);
        resultado[7] = implementacionListaHashSet(CANT_CIEN_MIL);
        resultado[8] = implementacionListaHashSet(CANT_10_MILLONES);

        // pruebas de implementacion y carga de datos a un TreeSet
        resultado[9] = implementacionListaTreeSet(CANT_DIEZ_MIL);
        resultado[10] = implementacionListaTreeSet(CANT_CIEN_MIL);
        resultado[11] = implementacionListaTreeSet(CANT_10_MILLONES);

        presentacion(resultado); // cargara los datos obtenidos para mostrarlos en una tabla
    }


    /**
     * Este metodo mostrara en una tabla los resultados de las pruebas
     *
     * @param resultado Sera un array de resultados obtenidos para mostrar
     */
    public void presentacion(long[] resultado) {
        String titulo0 = "";
        String titulo1 = "ArrayList1";
        String titulo2 = "ArrayList2";
        String titulo3 = "HashSet";
        String titulo4 = "TreeSet";

        String cantDiezMil = "DIEZ MIL PERSONAS";
        String CantCienMil = "CIEN MIL PERSONAS";
        String CantdiezMillones = "DIES MILLONES DE PERSONAS";

        textCenter("Tiempo de implementación en milisegundos", 85);
        System.out.format(" %-15s  %-20s %-20s %-20s ", titulo0, cantDiezMil, CantCienMil, CantdiezMillones);
        System.out.format("\n %-15s  %-20s %-20s %-20s ", titulo1, resultado[0], resultado[1], resultado[2]);
        System.out.format("\n %-15s  %-20s %-20s %-20s ", titulo2, resultado[3], resultado[4], "Indeterminado");
        System.out.format("\n %-15s  %-20s %-20s %-20s ", titulo3, resultado[6], resultado[7], resultado[8]);
        System.out.format("\n %-15s  %-20s %-20s %-20s ", titulo4, resultado[9], resultado[10], resultado[11]);
        System.out.println();
        textCenter("-", 85);
    }


}
