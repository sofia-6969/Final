// hija de Producto
public class Pizza extends Producto {
    
    //Atributo extra (encapsulamiento)
    private String[] ingredientesRaros;

    public Pizza(String nombre, double precioBase, String[] ingredientesRaros) {
        super(nombre, precioBase); // Llama al constructor de la clase padre Producto
        this.ingredientesRaros = ingredientesRaros;
    }
    @Override
    public double calcularPrecio(){
        //esto es un ejemplo de si tine mas de 3 ingredientes raros, aumenta el precio
        return (ingredientesRaros.length > 3) ?
                getPrecioBase() * 1.1 : // Aumenta el precio un 10%
                getPrecioBase(); // Mantiene el precio base
    }
    // getteer para ingredientes raros
    public String[] getIngredientesRaros() {
        return ingredientesRaros;
    }
    // Metodo adicional (opcional)
    //public String getDescripcionRidicula() {
    //    return "¡Pizza " + getNombre() + " con ingredientes 'secretos' para iluminatis!";
    //}
}
