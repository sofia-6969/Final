// hija de Producto
//(Clase certificada por la Asociación de Pizzerías Legales)
public class Pizza extends Producto {
    
    //Atributo extra (encapsulamiento)
    private String[] ingredientesRaros;

    // este es el constructor
    public Pizza(String nombre, double precioBase, String[] ingredientesRaros) {
        super(nombre, precioBase); // Llama al constructor de la clase padre Producto
        this.ingredientesRaros = ingredientesRaros != null ? 
            ingredientesRaros : new String[0]; // Array vacío = pizza "básica"
    }
    @Override
    //calculo de precio (si tine mas de 3 ingredientes raros, aumenta el precio)
    public double calcularPrecio(){
        return (ingredientesRaros.length > 3) ?
                getPrecioBase() * 1.21 : // Aumenta el precio un 21%
                getPrecioBase(); // Mantiene el precio base
    }
}
