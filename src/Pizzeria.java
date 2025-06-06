public class Pizzeria {
    private static final String[] codigosValidos = {"CHEESE", "REPTIL", "ALIEN"};
    private static final double DESCUENTO_CHEESE = 0.10;

    // Ejemplo simple de matriz de stock: cada fila es un ingrediente y la columna es la cantidad
    private int[][] stockIngredientes = {
        {10}, // Queso
        {10}, // Salsa
        {10}  // Masa
    };

    public boolean validarCodigo(String codigo) {
        for (String valido : codigosValidos) {
            if (valido.equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }

    public double procesarCodigo(String codigo, double precioOriginal) {
        double precioFinal = precioOriginal;

        try {
            if (!validarCodigo(codigo)) {
                throw new Exception("¡El Deep State bloqueó tu pedido!");
            }

            if (codigo.equalsIgnoreCase("CHEESE")) {
                precioFinal = precioOriginal * (1 - DESCUENTO_CHEESE);
                System.out.println("Código CHEESE aplicado: 10% de descuento.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return precioFinal;
    }

    public void actualizarStock(int[][] consumo) {
        for (int i = 0; i < stockIngredientes.length; i++) {
            stockIngredientes[i][0] -= consumo[i][0];

            if (stockIngredientes[i][0] < 0) {
                stockIngredientes[i][0] = 0;
            }
        }
    }

    public void imprimirStock() {
        System.out.println("Stock actual de ingredientes:");
        for (int i = 0; i < stockIngredientes.length; i++) {
            System.out.println("Ingrediente " + i + ": " + stockIngredientes[i][0]);
        }
    }
}
