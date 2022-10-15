

public class App {

    public static void main(String[] args) {
            
            String dia;
            dia = "D";
            switch (dia){
                case "D":
                    System.out.println("Ufff!, que la fuerza te acompañe");
                break;
                case "Miérccoles":
                    System.out.println("Estamos a mitad de semana");
                break;
                case "Viernes":
                    System.out.println("Mañana empieza el fin de semana");
                break;
                case "Sábado": case "Domingo":
                    System.out.println("Disfruta del fin de semana");
                break;
                default:
                    System.out.println("Que tengas un buen día");
                break;
            }
         }    



    
}
