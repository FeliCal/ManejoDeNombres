import java.util.Scanner;

public class ManejoDeNombres {

    public static void main(String[] args) {

        String nombreFamiliarUno = "";
        String nombreFamiliarDos = "";
        String nombreFamiliarTres = "";
        String nombreFamiliarUnoModificado = "";
        String nombreFamiliarDosModificado = "";
        String nombreFamiliarTresModificado = "";
        String resultado = "";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre de un familiar:");
        nombreFamiliarUno = teclado.nextLine();
        nombreFamiliarUnoModificado = nombreFamiliarUno.toUpperCase().charAt(1) + "." + nombreFamiliarUno.substring(nombreFamiliarUno.length() - 2);

        System.out.println("Introduce el nombre de otro familiar:");
        nombreFamiliarDos = teclado.nextLine();
        nombreFamiliarDosModificado = nombreFamiliarDos.toUpperCase().charAt(1) + "." + nombreFamiliarDos.substring(nombreFamiliarDos.length() - 2);

        System.out.println("Introduce el nombre de otro familiar:");
        nombreFamiliarTres = teclado.nextLine();
        nombreFamiliarTresModificado = nombreFamiliarTres.toUpperCase().charAt(1) + "." + nombreFamiliarTres.substring(nombreFamiliarTres.length() - 2);

        resultado = nombreFamiliarUnoModificado + "_" + nombreFamiliarDosModificado + "_" + nombreFamiliarTresModificado;

        System.out.println(resultado);

    }
}
