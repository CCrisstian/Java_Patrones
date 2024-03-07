package Org.CCristian.Patrones.AbstractFactory.Factory;

import Org.CCristian.Patrones.AbstractFactory.Product.Abstract_Product_Pizza;
import Org.CCristian.Patrones.AbstractFactory.Product.Concrete_Product_PizzaNY_Vegetariana;
import Org.CCristian.Patrones.AbstractFactory.Product.Concrete_Product_PizzaNY_Italiana;
import Org.CCristian.Patrones.AbstractFactory.Product.Concrete_Product_PizzaNY_Pepperoni;

public class Concrete_Factory_PizzeriaNewYork extends Abstract_Factory_PizzeriaZona{

/*---------------MÉTODOS---------------*/
    @Override
    Abstract_Product_Pizza crearPizza(String tipo) {
        Abstract_Product_Pizza pizza;
        tipo = tipo.toLowerCase();
        pizza = switch (tipo) {
            case "vegetariana" -> new Concrete_Product_PizzaNY_Vegetariana();
            case "pepperoni" -> new Concrete_Product_PizzaNY_Pepperoni();
            case "italiana" -> new Concrete_Product_PizzaNY_Italiana();
            default -> throw new IllegalStateException("No esta disponible el tipo: " + tipo);
        };
        return pizza;
    }
}
