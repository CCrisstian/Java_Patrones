package Org.CCristian.Patrones.AbstractFactory.Product;

import java.util.ArrayList;
import java.util.List;

abstract public class Abstract_Product_Pizza {

/*---------------ATRIBUTOS---------------*/
     protected String nombre;
     protected String masa;
     protected String salsa;
     protected List<String> ingredientes;
/*---------------GETTER---------------*/
    public String getNombre() {
        return nombre;
    }
/*---------------CONSTRUCTOR---------------*/
    public Abstract_Product_Pizza() {
        this.ingredientes = new ArrayList<>();
    }
/*---------------MÉTODOS---------------*/
    public void preparar(){ /*Método común - cada instancia lo implementa de la misma forma*/
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("Agregando salsa " + salsa);
        System.out.println("Agregando ingredientes:");
        this.ingredientes.forEach(i -> System.out.println("\t- " + i));
    }

    public void empaquetar(){   /*Método común - cada instancia lo implementa de la misma forma*/
        System.out.println("Poniendo la pizza en una caja de empaque...");
    }

    abstract public void cocinar(); /*Método abstracto - cada instancia lo implementa a su manera*/

    abstract public void cortar();  /*Método abstracto - cada instancia lo implementa a su manera*/

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder("\t\t\t\tAbstract_PizzaProducto");
        sB.append("\nNombre: ").append(nombre)
                .append("\nMasa: ").append(masa)
                .append("\nSalsa='").append(salsa)
                .append("\nIngredientes:");
        this.ingredientes.forEach(i -> sB.append("\t- ").append(i).append("\n"));
        return sB.toString();
    }
}
