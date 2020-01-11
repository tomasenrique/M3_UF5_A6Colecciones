package constantes_metodos;

public class MethodStatic {

    /**
     * Esta funcion servira para contar el tiempo en milisegundos.
     * Para el correcto funcionamiento se tiene que poner en el principio de la ejecucion del programa y al final para
     * poder saber el tiempo transcurrido.
     * Ejm:
     * long before = getTime();
     * ... ==>> code
     * long after = getTime();
     * <p>
     * long elapseTime = after - before
     *
     * @return devolvera un dato de tipo 'long' que sera el tiempo transcurrido
     */
    public static long getTime() {
        return System.currentTimeMillis();
    }


    public static String generaNumeroDNI() {
        String numeroDNI = String.valueOf(Math.random());
        String fullDNI = numeroDNI.substring(numeroDNI.length() - 8);
        return fullDNI;
    }





}
