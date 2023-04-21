
package misrc;


public class SustituitEspaciosBlanco {

    public static void main(String[] args) {
        String cadena = "En       un      puerto     italiano   al pie de la montaña";
        String er = "[\\s]+";
        String resultadoCadena = cadena.replaceAll(er, " ");
        System.out.println("Resultado: " + resultadoCadena);
    }   
}
