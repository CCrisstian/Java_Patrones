package Org.CCristian.Patrones.AbstractFactory.Product;

public class Concrete_Product_PizzaCalifornia_Queso extends Abstract_Product_Pizza{

/*---------------CONSTRUCTOR---------------*/
    public Concrete_Product_PizzaCalifornia_Queso() {
        super();
        nombre = "Pizza California Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Extra queso Mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }

/*---------------MÉTODOS---------------*/
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 min. a 100°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triángulos");
    }
}
