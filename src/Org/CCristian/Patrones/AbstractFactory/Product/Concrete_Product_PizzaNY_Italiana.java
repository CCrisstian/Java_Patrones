package Org.CCristian.Patrones.AbstractFactory.Product;

public class Concrete_Product_PizzaNY_Italiana extends Abstract_Product_Pizza {

/*---------------CONSTRUCTOR---------------*/
    public Concrete_Product_PizzaNY_Italiana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiano carne";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamón");
        ingredientes.add("Choricillo");
        ingredientes.add("Champiñones");
    }
/*---------------MÉTODOS---------------*/
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min. a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos grandes");
    }
}
