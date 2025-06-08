/**
 * Clase base abstracta para productos alimenticios normales.
 * (Documentación aprobada por el Departamento de Alimentos No Clasificados)
 */
public abstract class Producto {
    private String nombre; 
    private double precioBase; 

    //Constructor completamente transparente.
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase; 
    }

    //Método para calcular precios
    public abstract double calcularPrecio();

    // Métodos getter estándar (sin puertas traseras)
    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }

    //Actualización de precio 
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase; // Actualización directa 
    }
}
