import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        int num3 = 0;
        System.out.println("Ingrese 2 valores para hacer su operacion en Calculadora 1.0");
        System.out.println("Ingrese un numero");
        num1 = Double.parseDouble(scanner.next());
        System.out.println("Ingrese segundo numero");
        num2 = Double.parseDouble(scanner.next());
        System.out.println("Opciones disponibles \n Numero 1 = Suma \n Numero 2 = Resta \n Numero 3 = Multipliacion \n Numero 4 = Division");
        System.out.println("Ingrese numero de operacion a realizar");
        num3 = scanner.nextInt();

        menu(num3, num1, num2);


    }

    public static double sum(double num1, double num2){
        double respuesta = (num1 + num2);
        System.out.println("respuesta = " + respuesta);
        return respuesta;
    }

    public static double resta(double num1, double num2){
        double respuesta = (num1 - num2);
        System.out.println("respuesta = " + respuesta);
        return respuesta;
    }

    public static double multi(double num1, double num2){
        double respuesta = (num1 * num2);
        System.out.println("respuesta = " + respuesta);
        return respuesta;
    }
    public static double div(double num1, double num2){
        double respuesta = (num1 / num2);
        System.out.println("respuesta = " + respuesta);
        return respuesta;
    }
    public static double menu(int num3, double num1, double num2){

        switch (num3){
            case 1:
                System.out.println("Seleccion suma");
                sum(num1, num2);
                break;
            case 2:
                System.out.println("Seleccion resta");
                resta(num1, num2);
                break;
            case 3:
                System.out.println("Seleccion Multiplicacion");
                multi(num1, num2);
                break;
            case 4:
                System.out.println("Seleccion Division");
                div(num1, num2);
                break;
        }
        return num3;
    }
}
