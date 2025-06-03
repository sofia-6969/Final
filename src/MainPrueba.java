public class MainPrueba {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margarita", 10.99, new String[]{"Queso", "tomate", "Polvo de estrella"});
        System.out.println(pizza.getDescripcionRidicula());
        System.out.println("Precio: $ " + pizza.calcularPrecio());
    }
}
