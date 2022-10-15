import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        int edad, peso, dosis;
        System.out.println("Indique la edad del bebe en meses");
        Scanner leer = new Scanner(System.in);
        edad = leer.nextInt();

        System.out.println("Indique peso del bebe");
        peso = leer.nextInt();
        
        dosis = ((peso + 10) / (edad * 10)) * 8;
        System.out.println("La dosis ideal seria de " + dosis);
        leer.close();

        System.out.println();

    }
}
