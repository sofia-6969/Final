//hija de Producto
public class Bebida extends Producto {

    // Atributo extra (encapsulamiento) y es solo una chiste de conspiraciones
    private boolean tieneMicrochips;

    // este es el constructor
    public Bebida(String nombre, double precioBase, boolean tieneMicrochips) {
        super(nombre, precioBase); // Llama al constructor de la clase padre Producto
        this.tieneMicrochips = tieneMicrochips;
    }
    @Override
    public double calcularPrecio() {
        // Si tiene microchips, se cobra extra (chiste de conspiraciones)
        return tieneMicrochips ? 
        getPrecioBase() + 2.0 : 
        getPrecioBase();
    }
    // Getter para el atributo extra
    public boolean isTieneMicrochips() {
        return tieneMicrochips;
    }
}
