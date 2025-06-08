import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Sistema de Pedidos Pizzagate - Interfaz Oficial
 * (Nada de operaciones encubiertas aquí... eso creemos)
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Pizzeria pizzeria = new Pizzeria();

    public static void main(String[] args) {
        mostrarEncabezado();
        
        while (true) {
            try {
                int opcion = mostrarMenuPrincipal();
                
                switch (opcion) {
                    case 1:
                        realizarPedido();
                        break;
                    case 2:
                        System.out.println("\n🚫 Acceso denegado por el Comité 300");
                        System.out.println("(Esta opción solo está disponible para miembros del Club Bilderberg)");
                        break;
                    case 3:
                         if (confirmarSalida()) {
                            salirDelSistema();
                        }
                        break;
                    default:
                        System.out.println("\n¡ERROR! Esa opción no existe en nuestros registros");
                        System.out.println("(Aunque según los archivos desclasificados del FBI, debería)");
                        System.out.println("Por favor elija entre 1-3 (como dicta el Protocolo Orion)");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n¡ALERTA DEL DEPARTAMENTO DE SEGURIDAD!");
                System.out.println("Hemos detectado un intento de inyección de código");
                System.out.println("Solo se aceptan números (como en los documentos del FBI)");
                System.out.println("Este incidente será reportado a la División de Crímenes Alimenticios");
                scanner.nextLine();
            }
        }
    }

    private static void mostrarEncabezado() {
        System.out.println("\n***************************************");
        System.out.println("*    ¡BIENVENIDO A PIZZAGATE!         *");
        System.out.println("*  (Premiados por higiene dimensional)*");
        System.out.println("*                                     *");
        System.out.println("*  Todas nuestras pizzas contienen    *");
        System.out.println("*  100% ingredientes verificados      *");
        System.out.println("*  (por nuestros propios sistemas)    *");
        System.out.println("***************************************");
    }

    private static int mostrarMenuPrincipal() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. 🍕 Realizar pedido");
        System.out.println("2. 🕵️ [Área restringida]");
        System.out.println("3. 🚪 Salir");
        System.out.print("Seleccione una opción (1-3): ");
        return scanner.nextInt();
    }

    private static void realizarPedido() {
        scanner.nextLine(); // Limpiar buffer
        
        // Mostrar pizzas disponibles
        List<Pizza> pizzas = pizzeria.getMenuPizzas();
        System.out.println("\n--- NUESTRAS PIZZAS ---");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.printf("%d. %-10s $%.2f%n", 
                i+1, pizzas.get(i).getNombre(), pizzas.get(i).getPrecioBase());
        }
        
        Pizza pizza = seleccionarPizza(pizzas);
        double subtotal = pizza.getPrecioBase();
        boolean conBebida = false;
        String codigoUsado = null;
        
        // Opción de bebida
        System.out.print("\n¿Desea agregar la Bebida Especial? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            Bebida bebida = new Bebida("AguaPremium", 3.50, true);
            subtotal += bebida.calcularPrecio();
            conBebida = true;
        }
        
        // Código promocional
        System.out.print("\n¿Tiene código promocional? (deje vacío si no): ");
        String codigo = scanner.nextLine();
        
        double total = subtotal;
        if (!codigo.isEmpty()) {
            codigoUsado = codigo.toUpperCase();
            total = pizzeria.procesarCodigo(codigoUsado, subtotal);
        }
        
        mostrarRecibo(pizza, subtotal, total, conBebida, codigoUsado);
    }

    private static Pizza seleccionarPizza(List<Pizza> pizzas) {
        while (true) {
            try {
                System.out.print("\nElija una pizza (1-" + pizzas.size() + "): ");
                int eleccion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                if (eleccion >= 1 && eleccion <= pizzas.size()) {
                    return pizzas.get(eleccion-1);
                }
                System.out.println("¡Opción inválida! Intente nuevamente");
            } catch (InputMismatchException e) {
                System.out.println("¡Debe ingresar un número!");
                scanner.nextLine();
            }
        }
    }

    private static void mostrarRecibo(Pizza pizza, double subtotal, double total, boolean conBebida, String codigoUsado) {
        System.out.println("\n======== RECIBO ========");
        System.out.println("🍕 Pizza: " + pizza.getNombre());
        System.out.printf("💰 Precio base: $%.2f%n", pizza.getPrecioBase());
        
        if (conBebida) {
            System.out.println("🥤 Bebida Premium: $3.50");
            System.out.println("   (con tecnología de frescura garantizada)");
        }
        
        if (codigoUsado != null) {
            double descuento = subtotal - total;
            System.out.printf("\n🎫 Código '%s' aplicado: -$%.2f%n", codigoUsado, descuento);
        }
        
        System.out.printf("\n🤑 TOTAL A PAGAR: $%.2f%n", total);
        System.out.println("=========================");
        System.out.println("¡Gracias por su pedido!");
        System.out.println("(Los ingredientes han sido verificados por");
        System.out.println("nuestros sistemas de control de calidad*)");
        System.out.println("\n*Los sistemas de control de calidad");
        System.out.println("fueron descontinuados en 2015 por");
        System.out.println("\"razones no relacionadas con la salud pública\"");
        System.out.println("\n[Este recibo se autodestruirá en 5... 4... 3...]");
    }

    private static boolean confirmarSalida() {
        while (true) {
            System.out.print("\n¿Está seguro que desea salir? (s/n): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            
            switch (respuesta) {
                case "s":
                    return true;
                case "n":
                    System.out.println("\n¡Continúe con su experiencia culinaria no rastreada!");
                    return false;
                default:
                    System.out.println("\n¡SEÑAL NO RECONOCIDA!");
                    System.out.println("Nuestros sistemas de control mental solo entienden 's' o 'n'");
                    System.out.println("(Por su seguridad, estas respuestas están siendo grabadas)");
            }
        }
    }
    private static void salirDelSistema() {
        System.out.println("\n🔒 Activando protocolos de despedida...");
        System.out.println("Borrando huellas digitales...");
        System.out.println("Limpiando ADN dejado en el teclado...");
        System.out.println("\n¡Hasta pronto, usuario totalmente normal!");
        System.out.println("Recuerde: Lo que ocurre en Pizzagate, queda en Pizzagate");
        System.exit(0);
    }
}