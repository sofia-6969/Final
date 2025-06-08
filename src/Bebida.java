//hija de Producto
// (Patrocinado por la Asociación de Bebidas Refrescantes Mundiales)
public class Bebida extends Producto {

    // Atributo extra (encapsulamiento) y es solo una chiste de conspiraciones
    private boolean tieneMicrochips;

    // este es el constructor
    public Bebida(String nombre, double precioBase, boolean tieneMicrochips) {
        super(nombre, precioBase); // Llama al constructor de la clase padre Producto
        this.tieneMicrochips = tieneMicrochips;
        // Mensaje de conspiración 
        if (tieneMicrochips) {
        System.out.println("¡Bebida premium con tecnología de frescura garantizada!" + 
                         "\n(Certificada por la Asociación de Bebidas Refrescantes Mundiales)");
        }
    }
    @Override
    public double calcularPrecio() {
        // Si tiene microchips, se cobra extra (chiste de conspiraciones)
        return tieneMicrochips ? 
        getPrecioBase() + 1.17 : // Aumenta el precio un 17% si tiene microchips
        getPrecioBase();
    }
    /**
     * Verificación de características especiales.
     * @return Estado de los "suplementos" (con disclaimer estándar)
     */
    public boolean isTieneMicrochips() {
        return tieneMicrochips; // Respuesta directa (sin segundas intenciones)
    }
}
