package Org.CCristian.Patrones.AbstractFactory.Ejemplo;

import Org.CCristian.Patrones.AbstractFactory.Factory.Abstract_Factory_PizzeriaZona;
import Org.CCristian.Patrones.AbstractFactory.Factory.Concrete_Factory_PizzeriaCalifornia;
import Org.CCristian.Patrones.AbstractFactory.Factory.Concrete_Factory_PizzeriaNewYork;
import Org.CCristian.Patrones.AbstractFactory.Product.Abstract_Product_Pizza;

public class Ejemplo_Factory {
    public static void main(String[] args) {

        Abstract_Factory_PizzeriaZona nY = new Concrete_Factory_PizzeriaNewYork();
        Abstract_Factory_PizzeriaZona california = new Concrete_Factory_PizzeriaCalifornia();

        Abstract_Product_Pizza pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = nY.ordenarPizza("pepperoni");
        System.out.println("Andrés ordena una " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());

        pizza = nY.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("pepperoni");
        System.out.println("John ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
