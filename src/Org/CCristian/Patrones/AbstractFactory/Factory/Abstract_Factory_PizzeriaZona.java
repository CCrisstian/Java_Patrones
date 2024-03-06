package Org.CCristian.Patrones.AbstractFactory.Factory;

import Org.CCristian.Patrones.AbstractFactory.Product.Abstract_Product_Pizza;

abstract public class Abstract_Factory_PizzeriaZona {

/*---------------MÉTODOS---------------*/
    public Abstract_Product_Pizza ordenarPizza(String tipo){
        Abstract_Product_Pizza pizza = crearPizza(tipo);
        System.out.println("------Fabricando la pizza "+pizza.getNombre()+"------");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract Abstract_Product_Pizza crearPizza(String tipo);
}
