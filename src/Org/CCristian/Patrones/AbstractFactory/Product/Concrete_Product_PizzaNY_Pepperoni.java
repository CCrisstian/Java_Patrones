package Org.CCristian.Patrones.AbstractFactory.Product;

public class Concrete_Product_PizzaNY_Pepperoni extends Abstract_Product_Pizza {

/*---------------CONSTRUCTOR---------------*/
    public Concrete_Product_PizzaNY_Pepperoni() {
        super();
        nombre = "Pizza Pepperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra pepperoni");
        ingredientes.add("Aceitunas");
    }
/*---------------MÉTODOS---------------*/
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos");
    }
}
