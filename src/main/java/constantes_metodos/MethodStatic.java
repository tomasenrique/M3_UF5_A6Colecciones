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


    /**
     * Esta funcion servira pra centrar el texto como titulo
     *
     * @param cadenaTitulo Sera la cadena a centrar
     * @param tamanyo Sera el tamaño de linea a agregar para centrar el titulo
     */
    public static void textCenter(String cadenaTitulo, int tamanyo) {
        int left = (tamanyo - cadenaTitulo.length()) / 2;
        int right = tamanyo - left - cadenaTitulo.length();
        String charArepetir = "-"; // linea de titulo para concatenar
        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < left; i++) {
            buff.append(charArepetir);
        }
        buff.append(cadenaTitulo);
        for (int i = 0; i < right; i++) {
            buff.append(charArepetir);
        }
        System.out.println(buff.toString());
    }
}


