package modulos;

import java.util.Scanner;

public class Main {

	static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;

        while (opcion != 11) {

            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Calculadora básica");
            System.out.println("2. Validación de contraseña");
            System.out.println("3. Numeros primos");
            System.out.println("4. Suma de números pares");
            System.out.println("5. Conversión de temperatura");
            System.out.println("6. Contador de vocales");
            System.out.println("7. Cálculo de factorial");
            System.out.println("8. Juego de adivinanza");
            System.out.println("9. Paso por referencia");
            System.out.println("10. Tabla de multiplica ");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        calculadoraBasica();
                        break;
                    case 2:
                    	validacionContrasena();
                        break;
                    case 3:
                    	numerosPrimos();
                        break;
                    case 4:
                    	sumaNumerosPares();
                        break;
                    case 5:
                    	conversionTemperatura();
                        break;
                    case 6:
                    	contadordevocales();
                        break;
                    case 7:
                      
                        break;
                    case 8:
                       
                        break;
                    case 9:
                       
                        break;
                    case 10:
                      
                        break;
                    case 11:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (Exception e) {
                System.out.println("Debe ingresar un número válido.");
                sc.nextLine(); // limpiar buffer
            }
        }
    }

    
    
    
    
    // ===============================
    // MÉTODO PARA CALCULADORA
    // ===============================

    public static void calculadoraBasica() {

        double numero1 = leerNumero("Ingrese el primer número: ");
        double numero2 = leerNumero("Ingrese el segundo número: ");

        System.out.println("\nSeleccione operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Opción: ");

        int operacion = 0;

        try {
            operacion = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Operación inválida.");
            sc.nextLine();
            return;
        }

        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + suma(numero1, numero2));
                break;
            case 2:
                System.out.println("Resultado: " + resta(numero1, numero2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicacion(numero1, numero2));
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("No se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + division(numero1, numero2));
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }
    

    // ===============================
    // MÉTODO PARA LEER NÚMEROS 
    // ===============================

    public static double leerNumero(String mensaje) {

        double numero = 0;

        while (true) {
            try {
                System.out.print(mensaje);
                numero = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Debe ingresar un número.");
                sc.nextLine();
            }
        }

        return numero;
    }
    
 // ========ENTEROS==============
    public static int leerEntero(String mensaje) {

        int numero = 0;

        while (true) {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
                sc.nextLine(); // limpia el buffer
            }
        }

        return numero;
    }
    
    
    

    // ===============================
    // MÉTODOS DE OPERACIONES
    // ===============================

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    // ==================================
    // METODO VALIDACION DE CONTRASEÑA
    // ==================================
    
    public static void validacionContrasena() {

        String contrasena;

        do {
            System.out.print("Ingrese la contraseña: ");
            contrasena = sc.next();

            if (!contrasena.equals("1234")) {
                System.out.println("Contraseña incorrecta. Intente nuevamente.");
            }

        } while (!contrasena.equals("1234"));

        System.out.println("Acceso concedido.");
    }
  
        
    
    
    // ==================================
    // METODO DETERMINACION DE PRIMOS
    // ==================================
    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static void numerosPrimos() {

        int numero = 0;

        while (true) {
            try {
                System.out.print("Ingrese un número entero: ");
                numero = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
                sc.nextLine();
            }
        }

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }
    
    // ==================================
    // METODO SUMA DE PARES
    // ==================================
    
    public static void sumaNumerosPares() {

        int numero = -1;
        int suma = 0;

        while (numero != 0) {

            try {
                System.out.print("Ingrese un número entero (0 para salir): ");
                numero = sc.nextInt();

                if (numero % 2 == 0 && numero != 0) {
                    suma += numero;
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
                sc.nextLine();
            }
        }

        System.out.println("La suma de los números pares es: " + suma);
    }
    // ==================================
    // METODOS DE CONVERSION 
    // ==================================
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    
    public static void conversionTemperatura() {

        System.out.println("\n=== CONVERSIÓN DE TEMPERATURA ===");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");

        int opcion = leerEntero("Seleccione una opción: ");

        double temperatura = leerNumero("Ingrese la temperatura: ");

        switch (opcion) {
            case 1:
                double resultado1 = celsiusAFahrenheit(temperatura);
                System.out.println("Resultado: " + resultado1 + " °F");
                break;

            case 2:
                double resultado2 = fahrenheitACelsius(temperatura);
                System.out.println("Resultado: " + resultado2 + " °C");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
    // ==================================
    // FUNCION CONTEO DE VOCALES
    // ==================================
    public static int contarVocales(String texto) {

        int contador = 0;
        texto = texto.toLowerCase(); // para que también cuente mayúsculas

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' 
                    || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        return contador;
    }
    
    public static void contadordevocales() {

        sc.nextLine(); // limpiar buffer por si antes se usó nextInt

        System.out.print("Ingrese una palabra o frase: ");
        String texto = sc.nextLine();

        int cantidad = contarVocales(texto);

        System.out.println("La cantidad de vocales es: " + cantidad);
    }
    
    
    
}
