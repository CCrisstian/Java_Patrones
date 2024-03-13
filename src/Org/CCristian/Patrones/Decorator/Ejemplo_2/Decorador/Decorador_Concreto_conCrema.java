package Org.CCristian.Patrones.Decorator.Ejemplo_2.Decorador;

import Org.CCristian.Patrones.Decorator.Ejemplo_2.Componente.Componente_Configurable;

public class Decorador_Concreto_conCrema extends Decorador_Cafe{

/*-------------CONSTRUCTOR-------------*/
    public Decorador_Concreto_conCrema(Componente_Configurable cafe) {
        super(cafe);
    }
/*-------------MÉTODOS-------------*/
    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 2.5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Crema";
    }
}
