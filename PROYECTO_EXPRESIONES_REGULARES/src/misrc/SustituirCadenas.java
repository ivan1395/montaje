
package misrc;


public class SustituirCadenas {


    public static void main(String[] args) {
        String cadena = "Guatemale 19 de Marzo de 2013";
        String er = "[0-9]+";
        String resultadoCadena = cadena.replaceAll(er, "**");
        System.out.println("Resultado: " + resultadoCadena);
    }   
}