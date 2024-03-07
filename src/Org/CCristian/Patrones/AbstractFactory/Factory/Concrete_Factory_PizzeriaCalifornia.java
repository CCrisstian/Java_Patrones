package Org.CCristian.Patrones.AbstractFactory.Factory;

import Org.CCristian.Patrones.AbstractFactory.Product.*;

public class Concrete_Factory_PizzeriaCalifornia extends Abstract_Factory_PizzeriaZona{

/*---------------MÉTODOS---------------*/
    @Override
    Abstract_Product_Pizza crearPizza(String tipo) {
        Abstract_Product_Pizza pizza;
        tipo = tipo.toLowerCase();
        pizza = switch (tipo) {
            case "vegetariana" -> new Concrete_Product_PizzaCalifornia_Vegetariana();
            case "queso" -> new Concrete_Product_PizzaCalifornia_Queso();
            case "pepperoni" -> new Concrete_Product_PizzaCalifornia_Pepperoni();
            default -> throw new IllegalStateException("No esta disponible el tipo: " + tipo);
        };
        return pizza;
    }
}
