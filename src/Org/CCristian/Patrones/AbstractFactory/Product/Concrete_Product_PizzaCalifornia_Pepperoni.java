package Org.CCristian.Patrones.AbstractFactory.Product;

public class Concrete_Product_PizzaCalifornia_Pepperoni extends Abstract_Product_Pizza{

/*---------------CONSTRUCTOR---------------*/
    public Concrete_Product_PizzaCalifornia_Pepperoni() {
        super();
        nombre = "Pizza California Pepperoni";
        masa = "Masa a la piedra gruesa";
        ingredientes.add("Pepperoni");
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Aceitunas");
    }
/*---------------MÉTODOS---------------*/
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 50 min. a 55°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectángulos");
    }
}
