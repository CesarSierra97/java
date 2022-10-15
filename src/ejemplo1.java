import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {
        System.out.println("Indique la temperatura que deseas en °F");
        Scanner leerdato = new Scanner(System.in);
        double farengeith,centigrados;
        farengeith=leerdato.nextDouble();

        centigrados=(farengeith-32)/1.8;
        System.out.println("Para coninar la receta a "+farengeith+"°F, Necesitas la temperatura en "+centigrados+"°C");
        leerdato.close();

        
    }
}
