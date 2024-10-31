import java.util.Scanner;

public class calculadora {
    // Métodoo para escoger un valor ingresado por el usuario
    public static double escogerValor() {
        Scanner scanner = new Scanner(System.in);
        double valor = 1; // Valor por defecto
        System.out.print("Introduce un valor: ");
        try {
            valor = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Se asigna 1 como valor por defecto.");
        }
        return valor;
    }

    // Métodos de operaciones
    public static double sumar(double operando1, double operando2) {
        return operando1 + operando2;
    }

    public static double restar(double operando1, double operando2) {
        return operando1 - operando2;
    }

    public static double multiplicar(double operando1, double operando2) {
        return operando1 * operando2;
    }

    public static String dividir(double operando1, double operando2) {
        if (operando2 == 0) {
            return "Error: División por cero";
        }
        return String.valueOf(operando1 / operando2);
    }

    // Métodoo del menú principal
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        double operando1 = 1; // Valores por defecto
        double operando2 = 1;
        boolean valoresAsignados = false;
        int opcion = 0; // Inicializamos la opción para el bucle
        // Bucle de control del menú
        while (opcion != 5) {
            System.out.println("\nMenu:");
            System.out.println("0 - Escoger valores de los operandos");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            try {
                System.out.print("Elige una opción: ");
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida, por favor introduce un número entre 0 y 5.");
                continue;
            }
            // Evaluamos las opciones usando 'if-else'
            switch (opcion) {
                case 0:
                    System.out.println("Escoge el primer operando:");
                    operando1 = escogerValor();
                    System.out.println("Escoge el segundo operando:");
                    operando2 = escogerValor();
                    valoresAsignados = true;
                    break;
                case 1:
                    System.out.println("Resultado de la suma: " + sumar(operando1,
                            operando2));
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + restar(operando1,
                            operando2));
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicación: " +
                            multiplicar(operando1, operando2));
                    break;
                case 4:
                    System.out.println("Resultado de la división: " +
                            dividir(operando1, operando2));
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Elige una opción entre 0 y 5.");
                    break;
            }
        }
        scanner.close();
    }

    // Punto de entrada del programa
    public static void main(String[] args) {
        menu();
    }
}
