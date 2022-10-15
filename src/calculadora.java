
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int op, num1, num2, total;

        char i = 'n';
        String user, contraseña;

        System.out.println("Ingrese su usuario");
        user = leer.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña = leer.nextLine();
        System.out.println(user+contraseña);


        if (user.equalsIgnoreCase("jfajardo") && contraseña.equalsIgnoreCase("12345678#")) {
            while (i == 'n') {

                System.out.println(
                        "CALCULADORA SENA \nMenu de opciones \n 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division \n 5. Potencia \n 6. Radicacion");
                op = leer.nextInt();

                System.out.println("Ingrese el numero 1");
                num1 = leer.nextInt();

                System.out.println("Ingrese el numero 2");
                num2 = leer.nextInt();

                switch (op) {
                    case 1:
                        total = num1 + num2;
                        System.out.println("La suma de " + num1 + "+" + num2 + "=" + total);

                        break;
                    case 2:
                        total = num1 - num2;
                        System.out.println("La resta de " + num1 + "-" + num2 + "=" + total);
                        break;
                    case 3:
                        total = num1 * num2;
                        System.out.println("La multiplicacion de " + num1 + "x" + num2 + "=" + total);
                        break;
                    case 4:
                        total = num1 / num2;
                        System.out.println("La divicion de " + num1 + "en" + num2 + "=" + total);
                        break;
                    case 5:
                        double elevado;
                        elevado = Math.pow(num1, num2);
                        System.out.println("La potencia de " + num1 + " Elevado a la " + num2 + "=" + elevado);
                        break;
                    case 6:
                        Double raiz1, raiz2;
                        raiz1 = Math.sqrt(num1);
                        raiz2 = Math.sqrt(num2);
                        System.out.println("La raiz de " + num1 + "=" + raiz1 + " y " + num2 + "=" + raiz2);
                        break;
                }
                leer.nextLine();//limpieza de buffer
                System.out.println("Para realizar otra operacion precione n, de lo contrario prima cualquier tecla");
                i = leer.nextLine().charAt(0);
                System.out.println(i);
            }
        }
        
        else if (user != "jfajardo" || user != "tcabrera") {
            System.out.println("USUARIO NO REGISTRADO!!!!");
        }
        else if (user == "jfajardo" || user == "tcabrera" && contraseña != "12345678#" || contraseña != "qwerty2022") {
            System.out.println("CONTRASEÑA INCORRECTA!!");
        }
        else if (user != "jfajardo" || user != "tcabrera" && contraseña != "12345678#" || contraseña != "qwerty2022") {
            System.out.println("CREDENCIALES INVALIDAS");
        }
        
        leer.close();        
    }
}
