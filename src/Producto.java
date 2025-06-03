public abstract class Producto {
    private String nombre;
    private double precioBase;

    public Producto(String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Método abstracto (todas las clases hijas deben implementarlo)
    public abstract double calcularPrecio();

    //Getters y Setters encapsulamiento
    public String getNombre() {
        return nombre;
    }
    public double getPrecioBase() {
        return precioBase;
    }

    // Setters para aplicar descuentos o cambios de precio
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
