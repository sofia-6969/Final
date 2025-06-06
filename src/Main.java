// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizzeria pizzeria = new Pizzeria();
        
        // Precios base (ajustables según la conspiración)
        double precioPizza = 10.99;
        double precioBebida = 2.50;

        System.out.println("""
            *********************************************
            *    ¡BIENVENIDO A *PIZZA GATE*!            *
            *  (Las pizzas son inocentes... ¿o no?)      *
            *********************************************
            """);

        while (true) {
            try {
                System.out.println("\n--- MENÚ SECRETO (nivel de seguridad 5) ---");
                System.out.println("1. Pedir pizza (¡cuidado con los ingredientes!)");
                System.out.println("2. Ver stock de ingredientes (acceso restringido)");
                System.out.println("3. Salir (no recomendamos abandonar la misión)");
                System.out.print("Ingresa tu elección (1-3): ");

                int opcion = Integer.parseInt(scanner.nextLine()); // ¡Try-catch aquí!

                switch (opcion) {
                    case 1:
                        System.out.println("\n🚨 ALERTA: Has iniciado un pedido clasificado.");
                        double total = precioPizza;

                        // ¿Bebida? (¡posiblemente con control mental!)
                        System.out.print("¿Agregar bebida? (s/n): ");
                        String quiereBebida = scanner.nextLine();
                        if (quiereBebida.equalsIgnoreCase("s")) {
                            total += precioBebida;
                            System.out.println("⚠️ ADVERTENCIA: La bebida contiene trazas de teletransportación cuántica.");
                        }

                        // Código secreto (¡solo para iniciados!)
                        System.out.print("¿Código secreto? (o escribe 'MKULTRA' para salir): ");
                        String codigo = scanner.nextLine();
                        if (!codigo.isEmpty()) {
                            if (codigo.equalsIgnoreCase("MKULTRA")) {
                                System.out.println("✋ ¡Operación abortada por el Programa de Control Mental!");
                                continue;
                            }
                            total = pizzeria.procesarCodigo(codigo, total);
                        }

                        System.out.printf("\n🔮 TOTAL (en dólares reptilianos): $%.2f%n", total);
                        System.out.println("(Incluye impuestos de la Federación Galáctica)");
                        System.out.println("-----------------------------------------------");
                        break;

                    case 2:
                        System.out.println("\n🔍 ACCESO A STOCK: Nivel de seguridad 9 requerido...");
                        System.out.println("(Escaneando iris... ¡acceso concedido!)\n");
                        pizzeria.imprimirStock();
                        System.out.println("\n☠️ ADVERTENCIA: El queso puede contener algoritmos de vigilancia.");
                        break;

                    case 3:
                        System.out.println("\n🛑 ¡HUYENDO DE LA BASE! (autodestrucción en 3... 2... 1...)");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("\n❌ ¡OPCIÓN INVÁLIDA! ¿Eres un agente infiltrado?");
                }
            } catch (NumberFormatException e) {
                System.out.println("\n‼️ ¡SABOTEO DETECTADO! Solo números, agente. No letras.");
            } catch (Exception e) {
                System.out.println("\n☢️ ERROR CRÍTICO: " + e.getMessage() + " (¡Llama al Departamento de Daños!)");
            }
        }
    }
}