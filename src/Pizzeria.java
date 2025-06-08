import java.util.ArrayList;
import java.util.List;

/**
 * Clase de gestión de pedidos totalmente normales
 * (Certificado por la Asociación de Pizzerías Legítimas)
 */
public class Pizzeria {
    // Códigos promocionales verificados (100% inocentes)
    private static final String[] CODIGOS_VALIDOS = {"CHEESE", "SAUCE", "CRUST"};
    
    // Menú preaprobado por el departamento de salud
    private final List<Pizza> menuPizzas;

    public Pizzeria() {
        this.menuPizzas = inicializarPizzas();
    }
    
    private List<Pizza> inicializarPizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        // Pizzas estándar (nada de ingredientes clasificados)
        pizzas.add(new Pizza("CLASSIC", 10.99, new String[]{"Queso", "Salsa"}));
        pizzas.add(new Pizza("HAWAIIAN", 12.99, new String[]{"Queso", "Piña", "Jamón"}));
        pizzas.add(new Pizza("VEGGIE", 11.99, new String[]{"Queso", "Champiñones", "Pimientos"}));
        pizzas.add(new Pizza("SPECIAL", 14.99, new String[]{"Queso", "Pepperoni", "Aceitunas", "Albahaca"}));
        return pizzas;
    }

    // Métodos de acceso seguro
    public List<Pizza> getMenuPizzas() {
        return new ArrayList<>(menuPizzas);
    }

    /**
     * Valida códigos promocionales
     */
    public boolean validarCodigo(String codigo) {
        for (String valido : CODIGOS_VALIDOS) {
            if (valido.equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Aplica descuento estándar
     */
    public double procesarCodigo(String codigo, double precioOriginal) {
        if (validarCodigo(codigo)) {
            return precioOriginal * 0.9; // 10% descuento normal
        }
        return precioOriginal;
    }
}