package Org.CCristian.Patrones.AbstractFactory.Product;

public class Concrete_Product_PizzaNY_Vegetariana extends Abstract_Product_Pizza {

/*---------------CONSTRUCTOR---------------*/
    public Concrete_Product_PizzaNY_Vegetariana() {
        super();
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
    }
/*---------------MÉTODOS---------------*/
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }
}
